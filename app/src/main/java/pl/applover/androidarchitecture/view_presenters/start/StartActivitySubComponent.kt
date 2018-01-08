package pl.applover.androidarchitecture.view_presenters.start

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Subcomponent(modules = arrayOf(StartActivityModule::class))
interface StartActivitySubComponent : AndroidInjector<StartActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<StartActivity>()

    //TODO REMINDER: move the line below to AppModule's @Module(...) annotation
    //StartActivitySubComponent::class

    //TODO REMINDER: move this to ActivitiesInjectorFactories module
    /*
    @Binds
    @IntoMap
    @ActivityKey(StartActivity::class)
    internal abstract fun bindStartActivityInjectorFactory(
            builder: StartActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>
            */
}