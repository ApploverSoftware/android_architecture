package pl.applover.androidarchitecture.util

import android.content.Context
import com.novoda.merlin.Merlin
import com.novoda.merlin.MerlinsBeard
import pl.applover.androidarchitecture.di.App


/**
 * Created by kroll on 9/27/17.
 */
class IsInternetAvailable() {

    //Let you set internet status change listeners, onConnect and onDisconnect, for more informations check https://github.com/novoda/merlin
    fun buildMerlin(context: Context = App.instance): Merlin {
        return Merlin.Builder().withAllCallbacks().build(context)
    }

    // Let you check current internet status
    fun buildMerlinsBeard(context: Context = App.instance): MerlinsBeard {
        return MerlinsBeard.from(context)
    }
}