package com.nproj

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class Foo(val reactContext: ReactApplicationContext?) : ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "Foo"
    }

    @ReactMethod
    fun show() {
        Toast.makeText(reactApplicationContext, "OKOK!", Toast.LENGTH_LONG).show()
    }
}