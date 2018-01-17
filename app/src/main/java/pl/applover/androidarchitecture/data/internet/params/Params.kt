package pl.applover.androidarchitecture.data.internet.params

/**
 * Created by Janusz Hain on 2018-01-12.
 */
interface Params {

    /**
     * If you need json string then:
     * Generate classes using JsonToKotlinClass:
     * 1. Code
     * 2. Generate
     * 3. Convert Json into Kotlin
     */
    fun createJsonString(): String? = null

}