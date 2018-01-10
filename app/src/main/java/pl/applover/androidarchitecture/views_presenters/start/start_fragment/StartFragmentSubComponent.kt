package pl.applover.androidarchitecture.views_presenters.start.start_fragment

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Subcomponent(modules = arrayOf(StartFragmentModule::class))
interface StartFragmentSubComponent : AndroidInjector<StartFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<StartFragment>()

}