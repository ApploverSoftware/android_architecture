package pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment

import android.content.Context
import com.stfalcon.mvphelper.PresenterLoader
import dagger.Module
import dagger.Provides

/**
 * Created by Janusz Hain on 2018-01-16.
 */
@Module
class ExampleDialogFragmentModule {

    @Provides
    fun providePresenterLoader(context: Context, presenter: ExampleDialogFragmentPresenter)
            : PresenterLoader<ExampleDialogFragmentContract.Presenter> = PresenterLoader(context, presenter)
}