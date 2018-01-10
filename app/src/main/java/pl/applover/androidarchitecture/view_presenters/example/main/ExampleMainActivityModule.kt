package pl.applover.androidarchitecture.view_presenters.example.main

import android.content.Context
import com.stfalcon.mvphelper.PresenterLoader
import dagger.Module
import dagger.Provides

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Module
class ExampleMainActivityModule {

    @Provides
    fun providePresenterLoader(context: Context, presenterExample: ExampleMainActivityPresenter)
            : PresenterLoader<ExampleMainActivityContract.Presenter> = PresenterLoader(context, presenterExample)
}