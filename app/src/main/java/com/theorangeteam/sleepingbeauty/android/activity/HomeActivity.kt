package com.theorangeteam.sleepingbeauty.android.activity

import android.Manifest
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.theorangeteam.sleepingbeauty.PermissionControl
import com.theorangeteam.sleepingbeauty.R

class HomeActivity : PermissionActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onResume()
    {
        super.onResume()
        if(PermissionControl.allPermissionsAreGranted(this))
        {
            //FIXME call the service and be happy
        }
    }

    override fun permissionList(): Array<String> = arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION)
}