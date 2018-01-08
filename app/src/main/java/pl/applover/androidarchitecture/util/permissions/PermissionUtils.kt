package pl.applover.androidarchitecture.util.permissions

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.support.v4.app.ActivityCompat

/**
 * Created by Janusz Hain on 2017-08-28.
 */

fun checkPermissionGPSAndRequestIfNotGranted(activity: Activity) {
    // Here, thisActivity is the current activity
    if (!checkPermissionGPS(activity)) {
        requestPermissionsGPS(activity)
    }
}

fun checkPermissionGPS(activity: Activity): Boolean {
    return ActivityCompat.checkSelfPermission(activity,
            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(activity,
                    Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
}

private fun requestPermissionsGPS(activity: Activity) {
    ActivityCompat.requestPermissions(activity, arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION), 0)
}

