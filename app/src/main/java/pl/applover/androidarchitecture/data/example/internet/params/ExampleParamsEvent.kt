package pl.applover.androidarchitecture.data.example.internet.params

import com.squareup.moshi.Moshi
import pl.applover.androidarchitecture.data.internet.params.Params


/**
 * Created by Janusz Hain on 2018-01-12.
 */
class ExampleParamsEvent(val key: String, val id: Long) : Params {

    override fun createJsonString(): String {
        val moshi = Moshi.Builder().build()
        val jsonAdapter = moshi.adapter(ExampleParamsEvent::class.java)
        return jsonAdapter.toJson(this)
    }
}