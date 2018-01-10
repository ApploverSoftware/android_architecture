package pl.applover.androidarchitecture.util.extensions

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import pl.applover.androidarchitecture.App
import java.util.concurrent.TimeUnit

/**
 * Created by Janusz Hain on 2018-01-08.
 */

fun showToast(rId: Int, isLong: Boolean = true, context: Context = App.instance) {
    Toast.makeText(context, rId, if (isLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT).show()
}

fun showToast(text: String, isLong: Boolean = true, context: Context = App.instance) {
    Toast.makeText(context, text, if (isLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT).show()
}

fun getString(resId: Int, context: Context = App.instance) = context.getString(resId)

fun TimeUnit.delayed(delay: Long, closure: () -> Unit) {
    Handler(Looper.getMainLooper()).postDelayed(closure, this.toMillis(delay))
}