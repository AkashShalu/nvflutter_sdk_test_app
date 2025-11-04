package com.notifyvisitors.nvflutter_sdk_test_app

import android.app.Application
import com.flutter.notifyvisitors.NotifyvisitorsPlugin

class MyApplication : Application() {

    // NOTE: Replace the below with your own NOTIFYVISITORS_BRAND_ID & NOTIFYVISITORS_BRAND_ENCRYPTION_KEY
    private val NOTIFYVISITORS_BRAND_ENCRYPTION_KEY: String = "DB52A5B00BB0D3BF426639A1B9FCF2F7"
    private val NOTIFYVISITORS_BRAND_ID: Int = 8115

    override fun onCreate() {
        super.onCreate()

        NotifyvisitorsPlugin.register(this, NOTIFYVISITORS_BRAND_ID, NOTIFYVISITORS_BRAND_ENCRYPTION_KEY);

    }
}
