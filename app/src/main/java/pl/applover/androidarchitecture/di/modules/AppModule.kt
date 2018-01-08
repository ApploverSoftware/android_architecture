package pl.applover.androidarchitecture.di.modules

import android.content.Context
import pl.applover.androidarchitecture.di.App
import dagger.Module
import dagger.Provides
import pl.applover.androidarchitecture.view_presenters.StartActivitySubComponent
import javax.inject.Singleton

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Module(subcomponents = arrayOf(
//        register your activities' subcomponents here
        StartActivitySubComponent::class

))
class AppModule {

    @Singleton
    @Provides
    internal fun provideContext(application: App): Context = application.applicationContext
}