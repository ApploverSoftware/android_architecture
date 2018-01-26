package pl.applover.androidarchitecture.interactors.example

import io.reactivex.Single
import io.reactivex.disposables.Disposable
import pl.applover.androidarchitecture.data.example.internet.api_endpoints.ApiEndpointsInterfaceExample
import pl.applover.androidarchitecture.data.example.internet.headers.HeadersExample
import pl.applover.androidarchitecture.data.example.internet.params.ParamsExample
import pl.applover.androidarchitecture.data.example.internet.response.ExampleResponse
import pl.applover.androidarchitecture.models.example.ExampleModel
import pl.applover.androidarchitecture.util.MyScheduler
import pl.applover.androidarchitecture.util.extensions.printError
import retrofit2.Response
import retrofit2.Retrofit

/**
 * Created by Janusz Hain on 2018-01-10.
 */
class InteractorExample(private val retrofit: Retrofit) {

    private var disposable: Disposable? = null

    fun execute(onSuccess: (exampleModel: ArrayList<ExampleModel>) -> Unit, onFailure: (code: Int?) -> Unit, headersExample: HeadersExample, paramsExample: ParamsExample) {
        disposable = getSingle(retrofit, headersExample, paramsExample).subscribe({
            if (it.isSuccessful) {
                it.body()?.let {
                    onSuccess(ArrayList(it.map { ExampleModel(it) }))
                } ?: run {
                    onSuccess(ArrayList())
                }
            } else {
                onFailure(it.code())
            }
        }, {
            throwable ->
            printError(this, throwable)
            onFailure(null)
        })
    }

    fun unsubscribe() {
        disposable?.dispose()
    }

    companion object {
        fun getSingle(retrofit: Retrofit, headersExample: HeadersExample, paramsExample: ParamsExample): Single<Response<List<ExampleResponse>>> {
            val api = retrofit.create<ApiEndpointsInterfaceExample>(ApiEndpointsInterfaceExample::class.java)

            return api.getExampleList(paramsExample.userId, headersExample.contentType) //it can be api.getExampleList(paramsExample.userId) too as we got default value set in getExampleList
                    .observeOn(MyScheduler.getMainThreadScheduler())
                    .subscribeOn(MyScheduler.getScheduler())
        }
    }


}