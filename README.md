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
- If works... You are ready to continue to code lab exercises

## What to do?

You will need to create a new endpoint that will serve in a json-array a list of Greetings that have been requested on the /api/kotlin/v1/greetings/[greetingId] endpoint.

### Step 1:

To store data in Google Datastore we will make use of [https://github.com/objectify/objectify] (Objectify). Let's add the dependency to Gradle. You may need to make a full rebuild to refresh bgradle cache.

```
compile "com.googlecode.objectify:objectify:5.1.15"
```

You also need to uncomment the required Objectify settings in web.xml inside webapp/WEB-INF folder.

### Step 2:

Change the endpoints to match the new specs. You can have a look at ExampleEndpoint.kt and play around with AppEngine annotations to change the definition. You may need to add a new method in there to fetch all the stored greetings on the server :-)

### Step 3:

Save the received greetings in Google DataStore after we receive the request on the correct endpoint. Remember to add @Id and @Entity annotation to Kotlin dataclass :-). Check [https://github .com/objectify/objectify/wiki/Entities](How to define entities) in Objectify

To save it, you may need to use ofy() static method and register the new datatype in DataStore in app startup. Check AppStartupListener class. Read, [https://github.com/objectify/objectify/wiki/BasicOperations#saving](How to save entities in official docs)

### Step 4:

Add logic to retrieve all saved entities from datastore. As a tip, you may need to use static ofy () method as well :-) More help in [https://github.com/objectify/objectify/wiki/BasicOperations#loading](Official docs)

### Step 5:

Run the example! You can use ```./gradlew appengineRun``` and enjoy your new backend!
