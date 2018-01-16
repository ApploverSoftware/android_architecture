package pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import pl.applover.androidarchitecture.R
import pl.applover.androidarchitecture.util.extensions.showToast
import pl.applover.androidarchitecture.util.ui.mvp.MvpFullscreenDialogFragment

/**
 * Created by Janusz Hain on 2018-01-16.
 */
class ExampleDialogFragment : MvpFullscreenDialogFragment<ExampleDialogFragmentContract.Presenter, ExampleDialogFragmentContract.View>(),
        ExampleDialogFragmentContract.View {

    private lateinit var message: String
    private var isSuccess: Boolean = false

    //remember to use after view creation! Before view is null and it will throw an Exception
    private val textViewMessage by lazy {
        view!!.findViewById(R.id.textViewMessage) as TextView
    }

    private val textViewStatus by lazy {
        view!!.findViewById(R.id.textViewStatus) as TextView
    }

    private val buttonComplete by lazy {
        view!!.findViewById(R.id.buttonComplete) as Button
    }

    companion object {
        private val KEY_MESSAGE = "KEY_MESSAGE"
        private val KEY_IS_SUCCESS = "KEY_IS_SUCCESS"

        fun newInstance(message: String, isSuccess: Boolean): ExampleDialogFragment {
            val exampleDialogFragment = ExampleDialogFragment()

            val bundle = Bundle()
            bundle.putString(KEY_MESSAGE, message)
            bundle.putBoolean(KEY_IS_SUCCESS, isSuccess)

            exampleDialogFragment.arguments = bundle

            return exampleDialogFragment
        }
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{
            message = it.getString(KEY_MESSAGE)
            isSuccess = it.getBoolean(KEY_IS_SUCCESS)
        }

        textViewMessage.text = message
        if (isSuccess){
            textViewStatus.text = "Success!" //it should be in R.strings, but it is an example and don't want to put example strings in resources
            buttonComplete.setOnClickListener {
                showToast("Complete, success")
                dismiss()
            }
        }
        else{
            textViewStatus.text = "Failure"
            buttonComplete.setOnClickListener {
                showToast("Complete, failure")
                dismiss()
            }
        }

    }

    override fun getLayoutResId(): Int = R.layout.fragment_example_dialog


}