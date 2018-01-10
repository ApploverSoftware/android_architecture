package pl.applover.androidarchitecture.di.internet.example

import javax.inject.Singleton

import dagger.Component

@Singleton
@Component(modules = arrayOf(ExampleNetModule::class))
interface ExampleNetComponent
