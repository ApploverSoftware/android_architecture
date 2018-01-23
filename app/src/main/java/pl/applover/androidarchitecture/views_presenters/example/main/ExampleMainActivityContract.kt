package pl.applover.androidarchitecture.views_presenters.example.main

import com.stfalcon.mvphelper.IPresenter

/**
 * Created by Janusz Hain on 2018-01-08.
 */
interface ExampleMainActivityContract {

    interface View {
        fun onResponseSuccess()
        fun onResponseFailure(code: Int?)
    }

    interface Presenter : IPresenter<View> {
        fun onViewCreated()
    }
}