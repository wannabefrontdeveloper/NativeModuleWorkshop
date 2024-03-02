package com.nativemoduleworkshop

import com.facebook.react.ReactApplication
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.Collections

class BrightnessPackage: ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext):
            MutableList<NativeModule> {
        val modules = ArrayList<NativeModule>()
        modules.add(BrightnessModule(reactContext))
        return modules
    }

    override fun createViewManagers(reactContext: ReactApplicationContext):
            MutableList<ViewManager<*, ReactShadowNode<*>>> {
        return Collections.emptyList()
    }
}