package pl.applover.androidarchitecture.views_presenters.example.main

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import pl.applover.androidarchitecture.R
import com.stfalcon.mvphelper.MvpActivity
import pl.applover.androidarchitecture.App
import pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment.ExampleDialogFragment

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class ExampleMainActivity : MvpActivity<ExampleMainActivityContract.Presenter, ExampleMainActivityContract.View>(),
        ExampleMainActivityContract.View {

    override fun getLayoutResId(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        presenter?.onViewCreated()
    }

    override fun onResponseSuccess() {
        ExampleDialogFragment.newInstance("Response success, yeah!", true).show(supportFragmentManager, "DialogSuccess")
    }

    override fun onResponseFailure() {
        ExampleDialogFragment.newInstance("Response failure :(", false).show(supportFragmentManager, "DialogFailure")
    }

}