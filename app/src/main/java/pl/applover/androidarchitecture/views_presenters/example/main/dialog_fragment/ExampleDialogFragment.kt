package pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment

import pl.applover.androidarchitecture.R
import pl.applover.androidarchitecture.util.ui.mvp.MvpFullscreenDialogFragment

/**
 * Created by Janusz Hain on 2018-01-16.
 */
class ExampleDialogFragment : MvpFullscreenDialogFragment<ExampleDialogFragmentContract.Presenter, ExampleDialogFragmentContract.View>(),
        ExampleDialogFragmentContract.View {

    companion object {
        fun newInstance(): ExampleDialogFragment {
            return ExampleDialogFragment()
        }
    }

    override fun getLayoutResId(): Int = R.layout.fragment_example_dialog
}