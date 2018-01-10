package pl.applover.androidarchitecture.views_presenters.start.start_fragment

import pl.applover.androidarchitecture.R
import com.stfalcon.mvphelper.MvpFragment

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class StartFragment : MvpFragment<StartFragmentContract.Presenter, StartFragmentContract.View>(),
        StartFragmentContract.View {

    companion object {
        fun newInstance(): StartFragment {
            return StartFragment()
        }
    }

    override fun getLayoutResId(): Int = R.layout.fragment_start
}