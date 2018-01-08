package pl.applover.androidarchitecture.view_presenters.start.start_fragment

import com.stfalcon.mvphelper.Presenter
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class StartFragmentPresenter @Inject constructor()
    : Presenter<StartFragmentContract.View>(), StartFragmentContract.Presenter {

    override fun onViewAttached(view: StartFragmentContract.View, created: Boolean) {
        super.onViewAttached(view, created)
    }

    override fun onViewDetached() {
        super.onViewDetached()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}