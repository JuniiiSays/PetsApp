# PetsApp
This app displays a list of pets and their related data that the user inputs. Then we are saving this inforamtion into the SQLite database.

## Screenshots

Main Screen             |  Add New Pet     |   Main Screen Menu
:-------------------------:|:-------------------------:|:-------------------------:
![](https://user-images.githubusercontent.com/45339238/189655170-6b8c2600-d12c-4e2a-9437-a9d91f0f3ee9.png)  |  ![](https://user-images.githubusercontent.com/45339238/189655405-c9e382ed-7001-4e40-9b69-b1842f2b8c8a.png)  |  ![](https://user-images.githubusercontent.com/45339238/189655532-2ffb4d9c-ab68-49c5-893b-bef4d8ef21f6.png)

Edit Pet Screen             |  Edit Pet Menu     |   Conformation Dialogue
:-------------------------:|:-------------------------:|:-------------------------:
![](https://user-images.githubusercontent.com/45339238/189656298-097f9e44-3478-4dfd-94f5-283f4ffcfb64.png)  |  ![](https://user-images.githubusercontent.com/45339238/189656325-74494679-5b9e-40ee-b631-cfccd4cf6daa.png)  |  ![](https://user-images.githubusercontent.com/45339238/189656404-a69b08e8-72d2-43d8-a989-fa6cd3a161f3.png)

## Application Features & Implements
#### Using a Database in ANdroid App
- Create a DB
- Identify Schema
- Contract Class
- Contract creation for the DB
- SQLiteOpenHelper
- Database Connection
#### Content Providers
- Use of Content Providers
- Content Providers Operations
- URI
- URI Matcher

How to use this repository
--------------
- Fork this repository to your Github account.
- Open Android Studio 3.2.x+ in your local machine.
- We recommend you to use the [Version Control System](https://developer.android.com/studio/intro#version_control_basics)(VCS) in your Android Studio 3.2.x+ IDE to clone the repository directly in your IDE.
- You may have to use the File > Settings > Version Control (VCS) menu option to set up Git settings.
- Refer to this [IntelliJ document](https://www.jetbrains.com/help/idea/version-control-integration.html) for details.
- Working with VCS will make it easy for you to push your updates or switch between branches to your remote repository in Github.

Prerequisites
--------------

- Android Studio 3.2.1 or higher
- compileSdkVersion 32 (For AndroidX dependencies, the min compileSdkVersion version is 31)
- minSdkVersion 21
- Supports up to Android 12
- Gradle 7.2.0

To run app in an Android Virtual Device (AVD), we have used the following configuration:
- Pixel 4 Mobile device with x86 System image
- API level 30
- Android 11

Note - Gradle Updates
---------------

The Android Studio build system depends on Gradle and its plugins. The Gradle and its plugins have to be updated separately of Android Studio.
For the updated version, refer to the following updated files:
~/build.gradle (project) file
~/app/build.graddle(: app) file
~/gradle/wrapper/gradle-wrapper.properties file
You can refer anytime to the latest [Android Gradle plugin release notes](https://developer.android.com/studio/releases/gradle-plugin) for the newest version of plugins.


This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Troubleshoot
---------------
- Gradle version and Android Gradle Plugin version should be compatible. See the table [here](https://developer.android.com/studio/releases/gradle-plugin#updating-gradle)
- Sometimes, if you face unexpected behavior, go to File > Invalidate Caches/Restart. 
- Android Studio - [How to Change Android SDK Path?](https://stackoverflow.com/questions/16581752/android-studio-how-to-change-android-sdk-path/18409923#18409923)  
- In case you face some unexpected errors with the Emulator, it will be beneficial to wipe out the AVD data by going to Tools >> Device Manager >> Select Device >> Wipe out option.


License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
