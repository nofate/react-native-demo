package com.nproj;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by nofate on 24.11.16.
 */
public class Bar extends ReactContextBaseJavaModule {
    private ReactApplicationContext reactContext;

    public Bar(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Bar";
    }

    @ReactMethod
    public void show() {
        Toast.makeText(getReactApplicationContext(), "OK", Toast.LENGTH_LONG).show();
    }
}
