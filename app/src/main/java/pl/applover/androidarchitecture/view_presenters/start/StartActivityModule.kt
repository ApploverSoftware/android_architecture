package pl.applover.androidarchitecture.view_presenters.start

import android.content.Context
import com.stfalcon.mvphelper.PresenterLoader
import dagger.Module
import dagger.Provides

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Module
class StartActivityModule {

    @Provides
    fun providePresenterLoader(context: Context, presenter: StartActivityPresenter)
            : PresenterLoader<StartActivityContract.Presenter> = PresenterLoader(context, presenter)
}