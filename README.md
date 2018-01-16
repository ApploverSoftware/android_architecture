MVP architecture for Kotlin project with Dependency Injection and Interactors

Using: https://plugins.jetbrains.com/plugin/9760-mvp-generator 

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