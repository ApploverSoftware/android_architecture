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