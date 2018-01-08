package pl.applover.androidarchitecture.view_presenters.start

import pl.applover.androidarchitecture.R
import com.stfalcon.mvphelper.MvpActivity

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class StartActivity : MvpActivity<StartActivityContract.Presenter, StartActivityContract.View>(),
        StartActivityContract.View {

    override fun getLayoutResId(): Int = R.layout.activity_start

}