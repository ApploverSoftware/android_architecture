package pl.applover.androidarchitecture.interactors.example

import pl.applover.androidarchitecture.App
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-01-10.
 */
class ExampleInteractor() {
    @Inject
    lateinit var retrofit: Retrofit

    init {
        injectDependencies()
    }

    fun execute(onSuccess: () -> Unit, onFailure: () -> Unit){

    }

    private fun injectDependencies() {
        App.instance.netLoginComponent.inject(this)
    }


}