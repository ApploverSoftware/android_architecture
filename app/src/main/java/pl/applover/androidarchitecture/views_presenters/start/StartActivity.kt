package pl.applover.androidarchitecture.views_presenters.start

import android.os.Bundle
import android.os.PersistableBundle
import pl.applover.androidarchitecture.R
import com.stfalcon.mvphelper.MvpActivity

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class StartActivity : MvpActivity<StartActivityContract.Presenter, StartActivityContract.View>(),
        StartActivityContract.View {

    override fun getLayoutResId(): Int = R.layout.activity_start

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        
    }
}
