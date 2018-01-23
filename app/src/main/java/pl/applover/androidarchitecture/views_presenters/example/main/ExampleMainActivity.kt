package pl.applover.androidarchitecture.views_presenters.example.main

import android.annotation.SuppressLint
import com.stfalcon.mvphelper.MvpActivity
import pl.applover.androidarchitecture.R
import pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment.ExampleDialogFragment

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class ExampleMainActivity : MvpActivity<ExampleMainActivityContract.Presenter, ExampleMainActivityContract.View>(),
        ExampleMainActivityContract.View, ExampleMainFragmentInteractions {


    override fun getLayoutResId(): Int = R.layout.activity_example_main

    @SuppressLint("MissingSuperCall") //I am not sure why, but IDE shows the problem here, but I call super
    override fun onStart() {//note that presenter is injected AFTER onCreate, so use onStart
        super.onStart()
        presenter?.onViewCreated()
    }

    override fun onResponseSuccess() {
        ExampleDialogFragment.newInstance("Response success, yeah!", true).show(supportFragmentManager, "DialogSuccess")
    }

    override fun onResponseFailure(code: Int?) {
        val message =
                when (code) {
                    400 -> "Response failure, code 400 :("
                    401 -> "Response failure, code 401 :("
                    else -> "Response failure :("
                }
        ExampleDialogFragment.newInstance(message, false).show(supportFragmentManager, "DialogFailure")
    }

    override fun exampleMainActivityWithFragmentInteraction() {

    }


}