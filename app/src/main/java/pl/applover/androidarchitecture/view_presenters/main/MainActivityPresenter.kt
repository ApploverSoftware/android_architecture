package pl.applover.androidarchitecture.view_presenters.main

import com.stfalcon.mvphelper.Presenter
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class MainActivityPresenter @Inject constructor()
    : Presenter<MainActivityContract.View>(), MainActivityContract.Presenter {

    override fun onViewAttached(view: MainActivityContract.View, created: Boolean) {
        super.onViewAttached(view, created)
    }

    override fun onViewDetached() {
        super.onViewDetached()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}