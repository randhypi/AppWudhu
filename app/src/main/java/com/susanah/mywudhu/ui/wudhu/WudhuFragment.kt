package com.susanah.mywudhu.ui.wudhu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.susanah.mywudhu.data.model.WudhuModel
import com.susanah.mywudhu.databinding.FragmentWudhuBinding
import com.susanah.mywudhu.viewModel.ViewModelFactory

class WudhuFragment : Fragment() {

    private var _binding: FragmentWudhuBinding? = null
    private val binding get() = _binding!!
    private lateinit var wudhuAdapter: WudhuAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWudhuBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showList()
    }

    private fun showList() {
        val factory = ViewModelFactory.getInstance(requireActivity())
        val viewModel = ViewModelProvider(this, factory)[WudhuViewModel::class.java]

        wudhuAdapter = WudhuAdapter(viewLifecycleOwner)
        wudhuAdapter.notifyDataSetChanged()

        binding.rvWudhuList.layoutManager = LinearLayoutManager(context)
        binding.rvWudhuList.adapter = wudhuAdapter

        viewModel.getDummyWudhu()
        viewModel.getWudhu().observe(viewLifecycleOwner, { wudhu ->
            wudhuAdapter.setData(wudhu as ArrayList<WudhuModel>)
        })


    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}