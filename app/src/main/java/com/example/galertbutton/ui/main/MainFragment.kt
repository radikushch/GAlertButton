package com.example.galertbutton.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import com.example.galertbutton.R
import com.example.galertbutton.databinding.FragmentMainBinding
import com.example.galertbutton.ui.main.base.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {
  companion object {
    fun newInstance() = MainFragment()
  }

  private lateinit var viewModel: MainViewModel

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    binding.viewModel = viewModel
  }
}