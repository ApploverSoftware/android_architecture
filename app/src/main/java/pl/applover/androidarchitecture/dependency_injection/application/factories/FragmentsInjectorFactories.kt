package pl.applover.androidarchitecture.dependency_injection.application.factories



import android.support.v4.app.Fragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.FragmentKey

import dagger.multibindings.IntoMap
import pl.applover.androidarchitecture.view_presenters.start.start_fragment.StartFragment
import pl.applover.androidarchitecture.view_presenters.start.start_fragment.StartFragmentSubComponent


/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Module(subcomponents = arrayOf(
//        register your fragments' subcomponents here
        StartFragmentSubComponent::class

))
abstract class FragmentsInjectorFactories {

    //TODO bind your fragments' injection factories here

    @Binds
    @IntoMap
    @FragmentKey(StartFragment::class)
    internal abstract fun bindStartFragmentInjectorFactory(builder: StartFragmentSubComponent.Builder):
            AndroidInjector.Factory<out Fragment>
}