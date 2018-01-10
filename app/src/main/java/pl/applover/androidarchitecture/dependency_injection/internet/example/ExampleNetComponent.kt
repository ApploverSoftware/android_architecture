package pl.applover.androidarchitecture.dependency_injection.internet.example

import javax.inject.Singleton

import dagger.Component
import pl.applover.androidarchitecture.interactors.example.ExampleInteractor

@Singleton
@Component(modules = arrayOf(ExampleNetModule::class))
interface ExampleNetComponent{
    fun inject(exampleInteractor: ExampleInteractor)
}
