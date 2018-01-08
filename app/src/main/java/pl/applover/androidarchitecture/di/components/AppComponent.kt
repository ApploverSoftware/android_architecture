package pl.applover.androidarchitecture.di.components

import pl.applover.androidarchitecture.di.App
import pl.applover.androidarchitecture.di.factories.ActivitiesInjectorFactories
import pl.applover.androidarchitecture.di.factories.FragmentsInjectorFactories
import pl.applover.androidarchitecture.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ActivitiesInjectorFactories::class,
        FragmentsInjectorFactories::class,
        AppModule::class
))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

}