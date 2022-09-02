# kafka-to-s3 Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev -Dkafka.bootstrap.servers=<KAFKA SERVER> -Ds3.region=<YOUR REGION> -Ds3.accessKey=<YOUR ACCESS KEY> -Ds3.secretKey=<YOUR SECRET KEY>
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw clean package 

```


```shell script
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/kafka-to-s3-jvm .
```

```shell script
docker tag quarkus/kafka-to-s3-jvm:latest viniciusfcf/one-tap-soccer-kafka-to-s3:latest
```

```shell script
docker push viniciusfcf/one-tap-soccer-kafka-to-s3:latest
```


or

```shell script
docker tag quarkus/kafka-to-s3-jvm:latest quay.io/vflorent/one-tap-soccer-kafka-to-s3:latest
```

```shell script
docker push quay.io/vflorent/one-tap-soccer-kafka-to-s3:latest
```

```shell script

java -jar target/quarkus-app/quarkus-run.jar -Ds3.region=<REGION> -Ds3.accessKey=<AK> -Ds3.secretKey=<SK> -Dkafka.bootstrap.servers=<K>

```