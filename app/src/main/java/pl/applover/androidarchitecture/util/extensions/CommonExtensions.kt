package pl.applover.androidarchitecture.util.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
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

infix fun Int.with(x: Int) = this.or(x)

fun <T> Activity.goToActivity(className: Class<T>, bundle: Bundle? = null, saveActivityOnBackstack: Boolean = true) {
    val intent = Intent(this, className).apply {
        bundle?.let {
            putExtras(it)
        }
    }

    if (!saveActivityOnBackstack) {
        intent.flags = intent.flags with Intent.FLAG_ACTIVITY_NO_HISTORY
    }

    startActivity(intent)
}

fun AppCompatActivity.showFragment(fragment: Fragment, into: Int, push: Boolean = true, animIn: Int? = android.R.anim.fade_in, animOut: Int? = android.R.anim.fade_out, tag: String? = null) {
    if(push) {
        supportFragmentManager.beginTransaction()
                .addToBackStack(tag)
                .setCustomAnimations(
                        animIn ?: 0,
                        animOut ?: 0)
                .replace(into, fragment)
                .commit()
    }
    else{
        supportFragmentManager.beginTransaction()
                .setCustomAnimations(
                        animIn ?: 0,
                        animOut ?: 0)
                .replace(into, fragment)
                .commit()
    }
}

fun <T : Fragment> FragmentManager.onStackTop(closure: T.() -> Unit, onFailure: (() -> Unit)? = null) {
    (peekBackStack() as? T)?.closure() ?: onFailure?.invoke()
}

fun FragmentManager.peekBackStack() {
    getBackStackEntryAt(backStackEntryCount - 1).name?.let {
        findFragmentByTag(it)
    }
}


fun FragmentManager.clearBackstack() {
    if (backStackEntryCount > 0) {
        val entry = getBackStackEntryAt(0)
        popBackStack(entry.id, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        executePendingTransactions()
    }
}

fun isValidEmail(target: CharSequence): Boolean {
    return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches()
}