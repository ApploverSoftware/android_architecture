package pl.applover.androidarchitecture.di

import android.app.Activity
import android.app.Application
import android.support.multidex.MultiDexApplication
import pl.applover.androidarchitecture.di.components.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class App : MultiDexApplication(), HasDispatchingActivityInjector {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }
}