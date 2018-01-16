package pl.applover.androidarchitecture

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import pl.applover.androidarchitecture.dependency_injection.application.components.DaggerAppComponent
import pl.applover.androidarchitecture.util.extensions.DelegatesExt
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class App : Application(), HasDispatchingActivityInjector {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
    @Inject @field:Named("example")
    lateinit var exampleRetrofit: Retrofit

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

        fun getExampleRetrofit(): Retrofit = instance.exampleRetrofit
    }
}