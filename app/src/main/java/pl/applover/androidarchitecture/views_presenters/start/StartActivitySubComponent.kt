package pl.applover.androidarchitecture.views_presenters.start

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Subcomponent(modules = arrayOf(StartActivityModule::class))
interface StartActivitySubComponent : AndroidInjector<StartActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<StartActivity>()
}