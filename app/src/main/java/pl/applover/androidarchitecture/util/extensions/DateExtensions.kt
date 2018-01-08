package pl.applover.androidarchitecture.util.extensions

import java.util.*

/**
 * Created by Janusz Hain on 2018-01-08.
 */

fun Calendar.setStartOfTheDay(): Calendar {
    set(Calendar.HOUR_OF_DAY, 0)
    set(Calendar.MINUTE, 0)
    set(Calendar.SECOND, 0)
    return this
}

fun Calendar.setEndOfTheDay(): Calendar {
    set(Calendar.HOUR_OF_DAY, 23)
    set(Calendar.MINUTE, 59)
    set(Calendar.SECOND, 59)
    return this
}