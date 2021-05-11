package com.susanah.mywudhu.ui.kuis

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.KuisCerdasModel
import com.susanah.mywudhu.data.model.SurahModel
import com.susanah.mywudhu.databinding.FragmentKuisBinding
import com.susanah.mywudhu.ui.surat.SuratAdapter
import com.susanah.mywudhu.viewModel.ViewModelFactory
import okhttp3.internal.addHeaderLenient

class KuisFragment : Fragment() {

    private var _binding: FragmentKuisBinding? = null
    private val binding get() = _binding!!
    private lateinit var kuisAdapter: KuisAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKuisBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        showGridAdapter()



    }


    private fun showGridAdapter() {
        val factory = ViewModelFactory.getInstance(requireActivity())
        val viewModel = ViewModelProvider(this, factory)[KuisViewModel::class.java]

        kuisAdapter = KuisAdapter()
        kuisAdapter.notifyDataSetChanged()

        binding.rvKuisList.layoutManager = LinearLayoutManager(context)
        binding.rvKuisList.adapter = kuisAdapter

        viewModel.getDummySoal()
        viewModel.getSoal().observe(viewLifecycleOwner, { soal ->
            kuisAdapter.setData(soal as ArrayList<KuisCerdasModel>)
            kuisAdapter.setOnItemClickCallback(object : KuisAdapter.OnItemClickCallback {
                override fun onBottomReached(position: Int) {
                    Log.d("Posistion", position.toString())
                    if (position + 1 >= soal.size - 6) {
                        binding.btnSelesai?.visibility = View.VISIBLE
                        Log.d("Posistion", position.toString())
                    } else if (position < soal.size) {
                        binding.btnSelesai?.visibility = View.GONE

                    }
                }

                override fun onDataAnswer(data: List<KuisCerdasModel>) {
                    binding.btnSelesai.setOnClickListener {
                        val listNilai = mutableListOf<Int>()
                        for (i in 0 until data.size) {
                           listNilai.add(data[i]?.nilai!!)
                        }
                        val nilai = listNilai.sum() / 3
                        Log.d("Nilai list", listNilai.toString())
                        Log.d("Nilai", nilai.toString())
                    }
                }

            })

        })


    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}