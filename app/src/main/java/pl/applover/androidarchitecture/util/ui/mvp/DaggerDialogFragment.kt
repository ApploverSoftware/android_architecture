package pl.applover.androidarchitecture.util.ui.mvp

import android.content.Context
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasDispatchingSupportFragmentInjector
import dagger.internal.Beta
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-16.
 */
@Beta
abstract class DaggerDialogFragment : DialogFragment(), HasDispatchingSupportFragmentInjector {

    @Inject lateinit var childFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun supportFragmentInjector(): DispatchingAndroidInjector<Fragment>? {
        return childFragmentInjector
    }
}