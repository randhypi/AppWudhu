package com.susanah.mywudhu.ui.surat.detail

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.SurahDetailModel
import com.susanah.mywudhu.data.model.SurahModel
import com.susanah.mywudhu.databinding.FragmentDetailSurahBinding
import com.susanah.mywudhu.ui.surat.SuratAdapter
import com.susanah.mywudhu.ui.surat.SuratPendekViewModel
import com.susanah.mywudhu.viewModel.ViewModelFactory

class DetailSurahFragment : Fragment() {
    private var _binding: FragmentDetailSurahBinding? = null
    private val binding get() = _binding!!
    private lateinit var detailSuratAdapter: DetailSuratAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailSurahBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val surat = DetailSurahFragmentArgs.fromBundle(arguments as Bundle).surat

        surat?.let {
            showGridAdapter(it)

        }
    }


    @SuppressLint("SetTextI18n")
    private fun showGridAdapter(surat: String) {
        val navController = findNavController()
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        activity?.onBackPressedDispatcher?.addCallback(requireActivity(),
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    if (navController.currentDestination?.id == R.id.action_suratPendekFragment_to_detailSurahFragment) {
                        navController.popBackStack()
                    } else {
                        navController.popBackStack()
                    }

                    // view.findNavController().navigate(R.id.action_detailFragment_to_homeFragment)
                }
            })
        binding.myToolbar.setNavigationIcon(R.drawable.ic_arrow_back_24)
        binding.myToolbar.setNavigationOnClickListener {
            navController.popBackStack()
        }


        val factory = ViewModelFactory.getInstance(requireActivity())
        val viewModel = ViewModelProvider(this, factory)[SurahDetailViewModel::class.java]

        detailSuratAdapter = DetailSuratAdapter()
        detailSuratAdapter.notifyDataSetChanged()
        binding.rvSurahList.layoutManager = LinearLayoutManager(context)
        binding.rvSurahList.adapter = detailSuratAdapter

        viewModel.getDetailSurah(surat).observe(viewLifecycleOwner,{surat ->
            // Log.d(TAG,"${movies[0].original_title} home list")
            detailSuratAdapter.setData(surat as ArrayList<SurahDetailModel>)
            Log.d(" DETAIL SURAH","$surat")
            binding.tvNamaSurat.text = surat[0].nameSurah
            binding.tvAyat.text = "${surat[0].jumlahAyat} Ayat"
            binding.tvJuz.text = "Juz ${surat[0].juz}"
            binding.tvNoSUrat.text = "Surat ke - ${surat[0].noSurat}"
        })

    }


}