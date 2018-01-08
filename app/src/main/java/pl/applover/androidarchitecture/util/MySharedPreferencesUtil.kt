package pl.applover.androidarchitecture.util

import android.content.Context
import android.content.SharedPreferences
import pl.applover.dateanddrive.MainApp

/**
 * Created by Janusz Hain on 05/07/2017.
 */

object MySharedPreferencesUtil {

    private val packageName: String = "pl.applover.dateanddrive"

    /**
     * Saves int to SharedPreferences
     *
     * Default context is Application context
     */
    fun setIntToSharedPreferences(key: String, value: Int, context: Context = MainApp.instance) {
        val sharedPreferences = getSharedPreferences(context)
        val editor = sharedPreferences.edit()
        editor.putInt(key, value)
        editor.commit()
    }

    /**
     * Gets int from SharedPreferences
     *
     * Default context is Application context
     */
    fun getIntFromSharedPreferences(key: String, defaultValue: Int, context: Context = MainApp.instance): Int {
        val sharedPreferences = getSharedPreferences(context)
        return sharedPreferences.getInt(key, defaultValue)
    }

    /**
     * Saves int to SharedPreferences
     *
     * Default context is Application context
     */
    fun setDoubleToSharedPreferences(key: String, value: Double, context: Context = MainApp.instance) {
        val sharedPreferences = getSharedPreferences(context)
        val editor = sharedPreferences.edit()
        editor.putString(key, value.toString())
        editor.commit()
    }

    /**
     * Gets int from SharedPreferences
     *
     * Default context is Application context
     */
    fun getDoubleFromSharedPreferences(key: String, defaultValue: Double, context: Context = MainApp.instance): Double {
        val sharedPreferences = getSharedPreferences(context)
        return (sharedPreferences.getString(key, defaultValue.toString())).toDouble()
    }

    /**
     * Saves String to SharedPreferences
     *
     * Default context is Application context
     */
    fun setStringToSharedPreferences(key: String, value: String, context: Context = MainApp.instance) {
        val sharedPreferences = getSharedPreferences(context)
        val editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.commit()
    }

    /**
     * Gets String from SharedPreferences
     *
     * Default context is Application context
     */
    fun getStringFromSharedPreferences(key: String, defaultValue: String, context: Context = MainApp.instance): String {
        val sharedPreferences = getSharedPreferences(context)
        return sharedPreferences.getString(key, defaultValue)
    }

    /**
     * Saves Boolean to SharedPreferences
     *
     * Default context is Application context
     */
    fun setBooleanToSharedPreferences(key: String, value: Boolean, context: Context = MainApp.instance) {
        val sharedPreferences = getSharedPreferences(context)
        val editor = sharedPreferences.edit()
        editor.putBoolean(key, value)
        editor.commit()
    }

    /**
     * Gets boolean from SharedPreferences
     * Default context is Application context
     */
    fun getBooleanFromSharedPreferences(key: String, defaultValue: Boolean, context: Context = MainApp.instance): Boolean {
        val sharedPreferences = getSharedPreferences(context)
        return sharedPreferences.getBoolean(key, defaultValue)
    }

    /**
     * Removes param from SharedPreferences
     *
     * Default context is Application context
     */
    fun removeFromSharedPreferences(key: String, context: Context = MainApp.instance) {
        val sharedPreferences = getSharedPreferences(context)
        val editor = sharedPreferences.edit()
        editor.remove(key)
        editor.commit()
    }

    /**
     * Gets "global" SharedPreferences
     *
     * Default context is Application context
     */
    fun getSharedPreferences(context: Context = MainApp.instance): SharedPreferences {
        return context.getSharedPreferences(
                packageName, Context.MODE_PRIVATE)
    }

    /**
     * Saves StringSet to SharedPreferences
     *
     * Default context is Application context
     */
    fun setStringSetToSharedPreferences(key: String, value: Set<String>, context: Context = MainApp.instance) {
        val sharedPreferences = getSharedPreferences(context)
        val editor = sharedPreferences.edit()
        editor.putStringSet(key, value)
        editor.commit()
    }

    /**
     * Gets StringSet from SharedPreferences
     *
     * Default context is Application context
     */
    fun getStringSetFromSharedPreferences(key: String, defaultValue: Set<String>, context: Context = MainApp.instance): Set<String> {
        val sharedPreferences = getSharedPreferences(context)
        return sharedPreferences.getStringSet(key, defaultValue)
    }

    fun defaultContains(vararg keys: String) = with(getSharedPreferences()) {
        keys.all { contains(it) }
    }
}
