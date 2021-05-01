package com.susanah.mywudhu.ui.wudhu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.susanah.mywudhu.R
import com.susanah.mywudhu.databinding.FragmentWudhuBinding

class WudhuFragment : Fragment() {

    private var _binding: FragmentWudhuBinding? = null
    private val binding get() = _binding!!



    private lateinit var wudhuViewModel: WudhuViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWudhuBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}