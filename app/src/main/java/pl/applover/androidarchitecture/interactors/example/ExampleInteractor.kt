package pl.applover.androidarchitecture.interactors.example

import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import pl.applover.androidarchitecture.data.example.internet.api_endpoints.ExampleApiEndpointsInterface
import pl.applover.androidarchitecture.data.example.internet.headers.ExampleHeaders
import pl.applover.androidarchitecture.data.example.internet.params.ExampleParams
import pl.applover.androidarchitecture.data.example.internet.response.ExampleResponse
import pl.applover.androidarchitecture.models.example.ExampleModel
import pl.applover.androidarchitecture.util.MyScheduler
import retrofit2.Response
import retrofit2.Retrofit

/**
 * Created by Janusz Hain on 2018-01-10.
 */
class ExampleInteractor(private val retrofit: Retrofit) {

    private var disposable: Disposable? = null

    fun execute(onSuccess: (exampleModel: ArrayList<ExampleModel>) -> Unit, onFailure: () -> Unit, exampleHeaders: ExampleHeaders, exampleParams: ExampleParams) {
        disposable = getObservable(retrofit, exampleHeaders, exampleParams).subscribe({
            if (it.isSuccessful) {
                it.body()?.let {
                    onSuccess(ArrayList(it.map { ExampleModel(it) }))
                } ?: run {
                    onSuccess(ArrayList())
                }
            } else {
                onFailure()
            }
        }, {
            onFailure()
        })
    }

    fun unsubscribe() {
        disposable?.dispose()
    }

    companion object {
        fun getObservable(retrofit: Retrofit, exampleHeaders: ExampleHeaders, exampleParams: ExampleParams): Observable<Response<List<ExampleResponse>>> {
            val api = retrofit.create<ExampleApiEndpointsInterface>(ExampleApiEndpointsInterface::class.java)

            return api.getExampleList(exampleHeaders.contentType, exampleParams.userId)
                    .observeOn(MyScheduler.getMainThreadScheduler())
                    .subscribeOn(MyScheduler.getScheduler())
        }
    }


}