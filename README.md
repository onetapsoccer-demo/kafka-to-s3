# kafka-to-s3 Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev -Ds3.region=<YOUR REGION> -Ds3.accessKey=<YOUR ACCESS KEY> -Ds3.secretKey=<YOUR SECRET KEY>
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package -Ds3.region=<YOUR REGION> -Ds3.accessKey=<YOUR ACCESS KEY> -Ds3.secretKey=<YOUR SECRET KEY>
```
