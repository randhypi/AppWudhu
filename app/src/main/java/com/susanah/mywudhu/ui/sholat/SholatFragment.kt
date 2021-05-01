package com.susanah.mywudhu.ui.sholat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.susanah.mywudhu.R
import com.susanah.mywudhu.databinding.FragmentSholatBinding
import com.susanah.mywudhu.databinding.FragmentWudhuBinding

class SholatFragment : Fragment() {

    private var _binding: FragmentSholatBinding? = null
    private val binding get() = _binding!!



    private lateinit var sholatViewModel: SholatViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSholatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}

