Kōan Gradle template project
===========

This project shows how to include [Koan](https://github.com/yanex/koan) DSL library in an Android Gradle project. Demo application is very simple yet working and shows some important concepts.

It is a template so it could be a nice starting point for your new project. Come get some! :thumbsup:

## Importing

Project can be easily imported into IntelliJ IDEA (v. 13+).
Select **File** | **Import project…** and open ``settings.gradle`` file.

## Building from command line

Just as in Android Gradle plugin.

Task                           | Command
-------------------------------|--------
Install debug build on device  |`./gradlew installDebug`
Assemble debug APK             |`./gradlew assembleDebug`
Assemble production APK        |`./gradlew assembleRelease`

In Windows you can just type ``gradlew installDebug`` and so on.

## So what is Koan?

[Here](https://github.com/yanex/koan) is the manual.