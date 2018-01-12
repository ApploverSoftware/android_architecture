package pl.applover.androidarchitecture

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import pl.applover.androidarchitecture.dependency_injection.application.components.DaggerAppComponent
import pl.applover.androidarchitecture.dependency_injection.internet.example.DaggerExampleNetComponent
import pl.applover.androidarchitecture.dependency_injection.internet.example.ExampleNetComponent
import pl.applover.androidarchitecture.dependency_injection.internet.example.ExampleNetModule
import pl.applover.androidarchitecture.util.extensions.DelegatesExt
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class App : Application(), HasDispatchingActivityInjector {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    val netLoginComponent: ExampleNetComponent by lazy {
        DaggerExampleNetComponent.builder()
                .exampleNetModule(ExampleNetModule())
                .build();
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }
}