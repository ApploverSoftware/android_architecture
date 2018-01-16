package pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Janusz Hain on 2018-01-16.
 */
@Subcomponent(modules = arrayOf(ExampleDialogFragmentModule::class))
interface ExampleDialogFragmentSubComponent : AndroidInjector<ExampleDialogFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<ExampleDialogFragment>()
}