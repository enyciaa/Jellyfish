package com.boundless.jellyfish.samples

import android.app.Activity
import android.os.Bundle
import com.boundless.jellyfish.libraryhelpers.rxjava.applyIOToMain
import io.reactivex.Observable

class RxActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    testThreadProvider()
  }

  private fun testThreadProvider() {
    Observable.just(1)
        .applyIOToMain(RxSchedulerProviderImpl())
  }
}
