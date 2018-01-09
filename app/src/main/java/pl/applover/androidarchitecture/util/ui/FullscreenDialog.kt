package pl.applover.androidarchitecture.util.ui

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import pl.applover.androidarchitecture.R

/**
 * Created by Janusz Hain on 2018-01-08.
 */
abstract class FullscreenDialog : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(R.style.FullscreenDialog, R.style.FullscreenDialog)
    }

    override fun onResume() {
        super.onResume()

        dialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window.navigationBarColor = Color.TRANSPARENT
    }
}