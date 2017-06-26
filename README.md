## Introduction

Starting point of this project is from [ud867](https://github.com/udacity/ud867/tree/master/FinalProject)

Project contains 
* A java lib providing the jokes
* An Android lib providing the UI.
* A backend [GCE](https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints) 
  API service using the java lib.
* And main app communicates with the API service.

## Quick start
Run free version.
* run the backend module's gradle task first, to start local GCE server.
* In studio, open Build Variants tab in bottom left corner.
* verify Build Variant value is freeDebug.
* run main app's gradle task.

To run paid version, change step 3's value to paidDebug.



## Testing

To run main app's android test,  run the backend module's gradle task first, to start local GCE server.
