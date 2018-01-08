package pl.applover.androidarchitecture.view_presenters

import com.stfalcon.mvphelper.Presenter
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class StartActivityPresenter @Inject constructor()
    : Presenter<StartActivityContract.View>(), StartActivityContract.Presenter {

    override fun onViewAttached(view: StartActivityContract.View, created: Boolean) {
        super.onViewAttached(view, created)
    }

    override fun onViewDetached() {
        super.onViewDetached()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}