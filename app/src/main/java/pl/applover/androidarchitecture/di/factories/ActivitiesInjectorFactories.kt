package pl.applover.androidarchitecture.di.factories

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import pl.applover.androidarchitecture.view_presenters.example.main.ExampleMainActivity
import pl.applover.androidarchitecture.view_presenters.example.main.ExampleMainActivitySubComponent
import pl.applover.androidarchitecture.view_presenters.start.StartActivity
import pl.applover.androidarchitecture.view_presenters.start.StartActivitySubComponent

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Module
abstract class ActivitiesInjectorFactories {

    //TODO bind your activities' injection factories here

    @Binds
    @IntoMap
    @ActivityKey(StartActivity::class)
    internal abstract fun bindStartActivityInjectorFactory(
            builder: StartActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>

    @Binds
    @IntoMap
    @ActivityKey(ExampleMainActivity::class)
    internal abstract fun bindMainActivityInjectorFactory(
            builder: ExampleMainActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>
}