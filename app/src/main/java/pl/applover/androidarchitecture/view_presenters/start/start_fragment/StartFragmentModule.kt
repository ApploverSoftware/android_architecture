package pl.applover.androidarchitecture.view_presenters.start.start_fragment

import android.content.Context
import com.stfalcon.mvphelper.PresenterLoader
import dagger.Module
import dagger.Provides

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Module
class StartFragmentModule {

    @Provides
    fun providePresenterLoader(context: Context, presenter: StartFragmentPresenter)
            : PresenterLoader<StartFragmentContract.Presenter> = PresenterLoader(context, presenter)
}