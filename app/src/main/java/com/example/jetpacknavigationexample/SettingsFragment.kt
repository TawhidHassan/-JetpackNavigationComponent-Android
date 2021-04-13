package com.example.jetpacknavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_settings.*


class SettingsFragment : Fragment(R.layout.fragment_settings){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        et_default_amount.setText(SampleData.defaultAmount.value.toString())

        btn_save_default_amount.setOnClickListener {
            val defaultAmount = et_default_amount.text.toString().toLong()
            SampleData.defaultAmount.value = defaultAmount
        }
        btn_about_app.setOnClickListener {
            val action = MainNavGraphDirections.actionGlobalAboutFragment()
            findNavController().navigate(action)
        }


    }
}