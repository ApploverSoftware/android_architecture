package pl.applover.androidarchitecture.example.interactors

import javax.inject.Singleton

import dagger.Component

@Singleton
@Component(modules = arrayOf(ExampleNetModule::class))
interface ExampleNetComponent
