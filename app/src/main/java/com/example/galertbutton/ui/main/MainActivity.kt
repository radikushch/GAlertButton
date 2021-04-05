package com.example.galertbutton.ui.main

import android.os.Bundle
import com.example.galertbutton.R
import com.example.galertbutton.databinding.ActivityMainBinding
import com.example.galertbutton.ui.main.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
          .replace(R.id.container, MainFragment.newInstance())
          .commitNow()
    }
  }
}