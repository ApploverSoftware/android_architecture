package pl.applover.androidarchitecture.views_presenters.example.main

import com.stfalcon.mvphelper.Presenter
import pl.applover.androidarchitecture.App
import pl.applover.androidarchitecture.data.example.internet.headers.HeadersExample
import pl.applover.androidarchitecture.data.example.internet.params.ParamsExample
import pl.applover.androidarchitecture.interactors.example.InteractorExample
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-08.
 */
class ExampleMainActivityPresenter @Inject constructor()
    : Presenter<ExampleMainActivityContract.View>(), ExampleMainActivityContract.Presenter {

    private val exampleInteractor by lazy {
        InteractorExample(App.getExampleRetrofit())
    }

    override fun onViewAttached(view: ExampleMainActivityContract.View, created: Boolean) {
        super.onViewAttached(view, created)
    }


    override fun onViewDetached() {
        super.onViewDetached()
        exampleInteractor.unsubscribe() //if dialog
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onViewCreated() {
        exampleInteractor.execute(onFailure = {code: Int? ->
            view?.onResponseFailure(code)
        }, onSuccess = {
            view?.onResponseSuccess()
        }, headersExample = HeadersExample(), paramsExample = ParamsExample("1") )
    }
}