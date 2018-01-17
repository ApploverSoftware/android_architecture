package pl.applover.androidarchitecture.data.example.internet.params

import com.squareup.moshi.Json
import com.squareup.moshi.Moshi
import pl.applover.androidarchitecture.data.internet.params.Params


/**
 * Created by Janusz Hain on 2018-01-12.
 */
data class ExampleParamsEvent(private val exampleParamsEventModel: ExampleParamsEventModel) : Params {

    /**
     * If you need json string then:
     * Generate classes using JsonToKotlinClass:
     * 1. Code
     * 2. Generate
     * 3. Convert Json into Kotlin
     */
    override fun createJsonString(): String {
        val moshi = Moshi.Builder().build()
        val jsonAdapter = moshi.adapter(ExampleParamsEventModel::class.java)
        return jsonAdapter.toJson(exampleParamsEventModel)
    }
}

data class ExampleParamsEventModel(
        @Json(name = "event") val event: ExampleParamsEventDetailsModel
)

data class ExampleParamsEventDetailsModel(
        @Json(name = "to") val to: String,
        @Json(name = "from") val from: String
)