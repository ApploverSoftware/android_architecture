package pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment

import com.stfalcon.mvphelper.Presenter
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-16.
 */
class ExampleDialogFragmentPresenter @Inject constructor()
    : Presenter<ExampleDialogFragmentContract.View>(), ExampleDialogFragmentContract.Presenter {

    override fun onViewAttached(view: ExampleDialogFragmentContract.View, created: Boolean) {
        super.onViewAttached(view, created)
    }

    override fun onViewDetached() {
        super.onViewDetached()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}