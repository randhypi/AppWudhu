package com.susanah.mywudhu.ui.kuis


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.KuisCerdasModel
import com.susanah.mywudhu.databinding.DialogResultNilaiBinding
import com.susanah.mywudhu.databinding.FragmentKuisBinding
import com.susanah.mywudhu.ui.surat.SuratPendekFragmentDirections
import com.susanah.mywudhu.viewModel.ViewModelFactory

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
                    setDialog(data)
                }
            })

        })


    }


    fun setDialog(data: List<KuisCerdasModel>) {

        binding.btnSelesai.setOnClickListener {
            Log.d("SetDialog",data.toString())
            val listNilai = mutableListOf<Int>()
            var nilai = 0.0

            if (data.isNullOrEmpty()){
                Toast.makeText(context,"Silahkan Jawab dahulu sebelum klik selesai",Toast.LENGTH_LONG).show()
            }else{
                for (i in 0 until data.size) {
                    listNilai.add(data[i]?.nilai!!)
                }
                nilai = ( listNilai.sum().toDouble() * 2 ) / 10
            }

            val mDialogView = layoutInflater.inflate(R.layout.dialog_result_nilai, null)
            val bindingDialog = DialogResultNilaiBinding.bind(
                mDialogView
            )

            val mBuilder = context?.let { context ->
                AlertDialog.Builder(context)
                    .setView(mDialogView)
                    .setTitle("Nilai :")
            }
            val mAlertDialog = mBuilder?.show()
            bindingDialog.tvResultNilai.text =  String.format("%.1f", nilai).toString()
            bindingDialog.btnResultOke.setOnClickListener {
                mAlertDialog?.dismiss()
                showGridAdapter()
            }
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}