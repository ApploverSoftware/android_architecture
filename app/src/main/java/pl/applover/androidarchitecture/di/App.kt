package pl.applover.androidarchitecture.di

import android.app.Activity
import android.support.multidex.MultiDexApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import pl.applover.androidarchitecture.di.components.DaggerAppComponent
import pl.applover.androidarchitecture.util.extensions.DelegatesExt
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class App : MultiDexApplication(), HasDispatchingActivityInjector {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

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