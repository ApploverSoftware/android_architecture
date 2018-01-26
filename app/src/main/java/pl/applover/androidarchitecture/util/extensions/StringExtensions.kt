package pl.applover.androidarchitecture.util.extensions

import android.text.SpannableString
import android.text.Spanned
import android.text.style.ClickableSpan

/**
 * Created by Janusz Hain on 2018-01-23.
 */

/**
 * Makes first occurrence of [text] clickable. To color it, use [clickableSpan.updateDrawState]
 */
fun SpannableString.setClickableSpannable(clickableSpan: ClickableSpan, text: String) {

    val startIndex = indexOf(text)
    val endIndex = startIndex + text.length

    setSpan(clickableSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
}

inline fun <reified T : Any> ArrayList<T>.print(): String {
    var arrayString = "ArrayList<${T::class.java.simpleName}> Number of items: $size\n"
    forEachIndexed { index: Int, e: T -> arrayString += "$index : [${e.toString()}]\n" }
    return arrayString
}
