package pl.applover.androidarchitecture.util

import android.content.Context
import android.widget.Toast

/**
 * Created by Janusz Hain on 2018-01-08.
 */

fun showToast(text: CharSequence, isLong: Boolean = true, context: Context) {
    if (isLong) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    } else {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}