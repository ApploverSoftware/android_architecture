package pl.applover.androidarchitecture.view_presenters.example.main

import com.stfalcon.mvphelper.Presenter
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class ExampleMainActivityPresenter @Inject constructor()
    : Presenter<ExampleMainActivityContract.View>(), ExampleMainActivityContract.Presenter {

    override fun onViewAttached(view: ExampleMainActivityContract.View, created: Boolean) {
        super.onViewAttached(view, created)
    }

    override fun onViewDetached() {
        super.onViewDetached()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}