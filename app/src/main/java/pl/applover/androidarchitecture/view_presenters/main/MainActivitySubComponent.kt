package pl.applover.androidarchitecture.view_presenters.main

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivitySubComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}