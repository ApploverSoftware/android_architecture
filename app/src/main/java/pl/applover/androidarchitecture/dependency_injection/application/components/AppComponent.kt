package pl.applover.androidarchitecture.dependency_injection.application.components

import pl.applover.androidarchitecture.App
import pl.applover.androidarchitecture.dependency_injection.application.factories.ActivitiesInjectorFactories
import pl.applover.androidarchitecture.dependency_injection.application.factories.FragmentsInjectorFactories
import pl.applover.androidarchitecture.dependency_injection.application.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import pl.applover.androidarchitecture.dependency_injection.internet.example.ExampleNetModule
import javax.inject.Singleton

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ActivitiesInjectorFactories::class,
        FragmentsInjectorFactories::class,
        ExampleNetModule::class,
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