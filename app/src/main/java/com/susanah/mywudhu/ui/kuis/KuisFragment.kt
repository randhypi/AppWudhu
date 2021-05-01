package com.susanah.mywudhu.ui.kuis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.susanah.mywudhu.R
import com.susanah.mywudhu.databinding.FragmentKuisBinding
import com.susanah.mywudhu.databinding.FragmentSholatBinding
import com.susanah.mywudhu.databinding.FragmentWudhuBinding

class KuisFragment : Fragment() {

    private var _binding: FragmentKuisBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKuisBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}