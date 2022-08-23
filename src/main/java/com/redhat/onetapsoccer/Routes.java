
package com.redhat.onetapsoccer;

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.aws2.s3.AWS2S3Constants;

@ApplicationScoped
public class Routes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // kafka consumer
        from("kafka:{{kafka.topic.name}}")
                .routeId("FromKafka2S3")
                .setHeader(AWS2S3Constants.KEY, 
                    header("kafka.PARTITION").append(simple("-"))
                    .append(header("kafka.OFFSET").append(simple("-"))
                    .append(header("kafka.TIMESTAMP").append(simple(".json")))))
                .setHeader(AWS2S3Constants.DESTINATION_KEY, simple("camelDestinationKey"))
                .log("Received : \"${body}\"")
                //.to("seda:kafka-messages")
                .toD("aws2-s3:one-tap-events?region={{s3.region}}&accessKey={{s3.accessKey}}&secretKey={{s3.secretKey}}")
                ;
    }
}