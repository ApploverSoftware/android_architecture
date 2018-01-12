package pl.applover.androidarchitecture.models.example

import pl.applover.androidarchitecture.data.example.internet.response.ExampleResponse

/**
 * Created by Janusz Hain on 2018-01-12.
 */
class ExampleModel(exampleResponse: ExampleResponse) {

    private val body: String?
    private val id: String?
    private val title: String?
    private val userId: String?

    init {
        body = exampleResponse.body
        id = exampleResponse.id
        title = exampleResponse.title
        userId = exampleResponse.userId
    }

}