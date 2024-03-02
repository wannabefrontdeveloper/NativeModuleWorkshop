package com.nativemoduleworkshop;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.widget.Toast;

public class ToastModule extends ReactContextBaseJavaModule {
  ToastModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  public String getName() {
    return "ToastModule";
  }

  @ReactMethod
  public void show(String message, double duration) {
    ReactApplicationContext context = getReactApplicationContext();
    Toast toast = Toast.makeText(context, message, duration);
    toast.show();
  }

}
