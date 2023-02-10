# quarkus-demo

You need a java graalVM distribution:
```shell
sdk install java 22.3.r19-grl
```

Run the app in dev mode with:
```shell
./gradlew quarkusDev
```

Build the native executable with:
```shell
./gradlew clean build -Dquarkus.package.type=native
```

If you don't have GraalVM installed, build the native executable with a container:
```shell
./gradlew clean build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

You can then run your native executable app with:
```shell
./build/quarkus-demo-1.0-SNAPSHOT-runner
```

Then hit an endpoint with:
```shell
curl http://localhost:8080/hello
```

<details>
  <summary>jar generation</summary>

Build jar:
```shell
./gradlew build
```

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.
The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.
If you want to build an _über-jar_, execute the following command:
```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```
The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

</details>
