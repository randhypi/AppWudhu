package com.susanah.mywudhu.ui.surat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.susanah.mywudhu.data.model.SurahModel
import com.susanah.mywudhu.databinding.FragmentSuratPendekBinding
import com.susanah.mywudhu.viewModel.ViewModelFactory

class SuratPendekFragment : Fragment() {


    private var _binding: FragmentSuratPendekBinding? = null
    private val binding get() = _binding!!
    private lateinit var suratAdapter: SuratAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSuratPendekBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        showGridAdapter()

    }

    private fun showGridAdapter() {
        val factory = ViewModelFactory.getInstance(requireActivity())
        val viewModel = ViewModelProvider(this, factory)[SuratPendekViewModel::class.java]

        suratAdapter = SuratAdapter()
        suratAdapter.notifyDataSetChanged()
        binding.rvSurahList.layoutManager = LinearLayoutManager(context)
        binding.rvSurahList.adapter = suratAdapter

        viewModel.getSurah().observe(viewLifecycleOwner,{surat ->
            // Log.d(TAG,"${movies[0].original_title} home list")
            suratAdapter.setData(surat as ArrayList<SurahModel>)
        })


        suratAdapter.setOnItemClickCallback(object : SuratAdapter.OnItemClickCallback{
            override fun onItemClicked(data: String?) {
                if (data != null) {
                    selectedSurat(data)
                }
            }
        })
    }
    private fun selectedSurat(surat: String){
        Toast.makeText(context,surat, Toast.LENGTH_SHORT).show()

        val toDetail = SuratPendekFragmentDirections.actionSuratPendekFragmentToDetailSurahFragment()
        toDetail.surat = surat

        view?.findNavController()?.navigate(toDetail)

    }
}