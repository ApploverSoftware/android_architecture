package pl.applover.androidarchitecture.view_presenters.example.main

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Subcomponent(modules = arrayOf(ExampleMainActivityModule::class))
interface ExampleMainActivitySubComponent : AndroidInjector<ExampleMainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<ExampleMainActivity>()
}