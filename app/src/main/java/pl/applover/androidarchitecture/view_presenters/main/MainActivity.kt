package pl.applover.androidarchitecture.view_presenters.main

import pl.applover.androidarchitecture.R
import com.stfalcon.mvphelper.MvpActivity

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class MainActivity : MvpActivity<MainActivityContract.Presenter, MainActivityContract.View>(),
        MainActivityContract.View {

    override fun getLayoutResId(): Int = R.layout.activity_main

}