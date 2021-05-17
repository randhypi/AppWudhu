package com.susanah.mywudhu.ui.sholat

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.susanah.mywudhu.data.model.KuisCerdasModel
import com.susanah.mywudhu.data.model.SholatModel
import com.susanah.mywudhu.databinding.FragmentSholatBinding
import com.susanah.mywudhu.ui.kuis.KuisAdapter
import com.susanah.mywudhu.ui.kuis.KuisViewModel
import com.susanah.mywudhu.viewModel.ViewModelFactory

class SholatFragment : Fragment() {

    private var _binding: FragmentSholatBinding? = null
    private val binding get() = _binding!!
    private lateinit var sholatAdapter: SholatAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSholatBinding.inflate(inflater, container, false)
        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()

        showListAdapter()

    }


    private fun showListAdapter() {
        val factory = ViewModelFactory.getInstance(requireActivity())
        val viewModel = ViewModelProvider(this, factory)[SholatViewModel::class.java]

        sholatAdapter = SholatAdapter(viewLifecycleOwner)
        sholatAdapter.notifyDataSetChanged()

        binding.rvSholatList.layoutManager = LinearLayoutManager(context)
        binding.rvSholatList.adapter = sholatAdapter

        viewModel.getDummySholat()
        viewModel.getSholat().observe(viewLifecycleOwner, { sholat ->
            sholatAdapter.setData(sholat as ArrayList<SholatModel>)

        })


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}

