package pl.applover.androidarchitecture.dependency_injection.application.modules

import android.content.Context
import pl.applover.androidarchitecture.App
import dagger.Module
import dagger.Provides
import pl.applover.androidarchitecture.views_presenters.example.main.ExampleMainActivitySubComponent
import pl.applover.androidarchitecture.views_presenters.start.StartActivitySubComponent
import javax.inject.Singleton

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Module(subcomponents = arrayOf(
//        register your activities' subcomponents here
        StartActivitySubComponent::class,
        ExampleMainActivitySubComponent::class

))
class AppModule {

    @Singleton
    @Provides
    internal fun provideContext(application: App): Context = application.applicationContext
}