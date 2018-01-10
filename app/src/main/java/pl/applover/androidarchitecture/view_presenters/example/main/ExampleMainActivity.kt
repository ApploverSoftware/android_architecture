package pl.applover.androidarchitecture.view_presenters.example.main

import pl.applover.androidarchitecture.R
import com.stfalcon.mvphelper.MvpActivity

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class ExampleMainActivity : MvpActivity<ExampleMainActivityContract.Presenter, ExampleMainActivityContract.View>(),
        ExampleMainActivityContract.View {

    override fun getLayoutResId(): Int = R.layout.activity_main

}