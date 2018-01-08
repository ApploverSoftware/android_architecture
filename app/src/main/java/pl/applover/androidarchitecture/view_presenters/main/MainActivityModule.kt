package pl.applover.androidarchitecture.view_presenters.main

import android.content.Context
import com.stfalcon.mvphelper.PresenterLoader
import dagger.Module
import dagger.Provides

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Module
class MainActivityModule {

    @Provides
    fun providePresenterLoader(context: Context, presenter: MainActivityPresenter)
            : PresenterLoader<MainActivityContract.Presenter> = PresenterLoader(context, presenter)
}