MVP architecture for Kotlin project with Dependency Injection and Interactors

Using: https://plugins.jetbrains.com/plugin/9760-mvp-generator 

When generating Activity using MVP Generator:
1. From class ActivityNameSubComponent cut ActivityName.class and paste it in array of subcomponents in AppModule
2. From class ActivityNameSubComponent cut code for binding and paste it to the class ActivitiesInjectorFactories

When generatring Fragment using MVP Generator:
1. From class FragmentNameSubComponent cut Fragment.class and paste it in array of subcomponents in FragmentsInjectorFactories
2. From class FragmentNameSubComponent cut code for binding and paste it to the class FragmentsInjectorFactories

Interactors are used to work with database and online sources
