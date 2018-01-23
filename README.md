MVP architecture for Kotlin project with Dependency Injection and Interactors

Plugin for generating MVP: 
https://plugins.jetbrains.com/plugin/9760-mvp-generator 

Plugin for generating kotlin classes from JSON:
https://github.com/wuseal/JsonToKotlinClass

When generating Activity using MVP Generator:
1. From class ActivityNameSubComponent cut ActivityName.class and paste it in array of subcomponents in AppModule
2. From class ActivityNameSubComponent cut code for binding and paste it to the class ActivitiesInjectorFactories

When generatring Fragment using MVP Generator:
1. From class FragmentNameSubComponent cut Fragment.class and paste it in array of subcomponents in FragmentsInjectorFactories
2. From class FragmentNameSubComponent cut code for binding and paste it to the class FragmentsInjectorFactories

NOTE that presenter is being injected after onCreate (Activity), so use for example onStart to work with presenter

To create DialogFragment using MVP, create Fragment (as above) and change name of extended class to MvpDialogFragment or MvpFullscreenDialogFragment

Interactors are used to work with database and online sources

Usable tools:
- http://pojo.sodhanalibrary.com/ - creating pojo from json body
- https://www.hurl.it/ - making calls using curl without curling on the computer!
- http://nsdateformatter.com/ - date formatter
- https://convertcase.net/ - String formatter

Rename package name!
Example: https://stackoverflow.com/questions/16804093/android-studio-rename-package

Right click on package, refactor and then rename. Manifest will change, but it is needed to change "application id" in gradle
