package com.nativemoduleworkshop

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class BrightnessModule(reactContext: ReactApplicationContext):
ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "BrightnessModule"
    }
    override fun getConstants(): MutableMap<String,Any> {
        val constants = HashMap<String, Any>()
        constants.put("SAMPLE_VALUE", "HELLO World")
        return constants
    }

    @ReactMethod
    fun getBrightness() {
        // TODO: get Brightness
    }

    @ReactMethod
    fun setBrightness(brightness: Float) {
        // TODO: set brightness
    }
}