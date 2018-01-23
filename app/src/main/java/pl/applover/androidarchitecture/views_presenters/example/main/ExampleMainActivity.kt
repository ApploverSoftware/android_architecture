package pl.applover.androidarchitecture.views_presenters.example.main

import com.stfalcon.mvphelper.MvpActivity
import pl.applover.androidarchitecture.R
import pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment.ExampleDialogFragment

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class ExampleMainActivity : MvpActivity<ExampleMainActivityContract.Presenter, ExampleMainActivityContract.View>(),
        ExampleMainActivityContract.View {

    override fun getLayoutResId(): Int = R.layout.activity_example_main

    override fun onStart() {//note that presenter is injected AFTER onCreate!!!
        super.onStart()
        presenter?.onViewCreated()
    }

    override fun onResponseSuccess() {
        ExampleDialogFragment.newInstance("Response success, yeah!", true).show(supportFragmentManager, "DialogSuccess")
    }

    override fun onResponseFailure() {
        ExampleDialogFragment.newInstance("Response failure :(", false).show(supportFragmentManager, "DialogFailure")
    }

}