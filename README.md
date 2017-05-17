# Helsinki Google IO Extended 2017 App Engine Codelab
This is a sample fork from [AppEngineKotlin](https://github.com/jonyas/AppEngineKotlin/) repository adding a bit more classes to let you add more functionalities on top of it. You can read more about the basic setup in following [blogpost](https://medium.com/@jonimanolduran/using-kotlin-in-google-app-engine-76d2cb47580b).

## Explanation
In this project, you are gonna use [Google cloud endpoints](https://cloud.google.com/endpoints/), [Dagger2](https://github.com/google/dagger), [Kotlin](https://kotlinlang.org/) and Gradle as build system to run this App Engine Project. You will add more functionality on top of the basic example so you can get used to the basics of App Engine.

## System requirements

You need to have JDK8 installed.

## How to start?

- Clone project
- Inside project folder run ```./gradlew appengineRun``` More Gradle plugin [commands](https://github.com/GoogleCloudPlatform/gradle-appengine-plugin)
- Wait project to build
- Open in browser [http://localhost:8080/_ah/api/kotlin/v1/greetings/me](http://localhost:8080/_ah/api/kotlin/v1/greetings/me)

