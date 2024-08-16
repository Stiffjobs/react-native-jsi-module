package com.jsimodule

import com.facebook.react.bridge.ReactApplicationContext

abstract class JsiModuleSpec internal constructor(context: ReactApplicationContext) :
  NativeJsiModuleSpec(context) {
}
