package com.susanah.mywudhu.ui.kuis

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.recyclerview.widget.RecyclerView
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.KuisCerdasModel
import com.susanah.mywudhu.databinding.ItemsKuisBinding

class KuisAdapter : RecyclerView.Adapter<KuisAdapter.ListViewHolder>() {


    private val mData = ArrayList<KuisCerdasModel>()
    private val mJawaban = mutableListOf<KuisCerdasModel>()

    fun setData(items: ArrayList<KuisCerdasModel>) {
        mData.clear()
        mData.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.items_kuis, viewGroup, false)

        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, position: Int) {
        listViewHolder.bind(mData[position])
        val _binding = ItemsKuisBinding.bind(listViewHolder.itemView)
        val model = mData.get(position)
        val no = model.no
        model.no?.let { _binding.rgSoal.check(it) }
        _binding.rgSoal.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(rg: RadioGroup?, i: Int) {
                model.no = i

                if (model.no == R.id.a) {
                    _binding.a.isChecked = true
                    setAnswer(model.a?.get(0).toString(), model?.jawaban, no, model)
                } else if (model.no == R.id.b) {
                    _binding.b.isChecked = true
                    setAnswer(model.b?.get(0).toString(), model?.jawaban, no, model)
                } else if (model.no == R.id.c) {
                    _binding.c.isChecked = true
                    setAnswer(model.c?.get(0).toString(), model?.jawaban, no, model)
                } else if (model.no == R.id.d) {
                    _binding.d.isChecked = true
                    setAnswer(model.d?.get(0).toString(), model?.jawaban, no, model)
                }
            }
        })
    }

    override fun getItemCount(): Int = mData.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemsKuisBinding.bind(itemView)
        fun bind(userItem: KuisCerdasModel) {
            binding.tvSoal.text = userItem.soal
            val soalGroup: RadioGroup = binding.rgSoal

            val a = binding.a
            val b = binding.b
            val c = binding.c
            val d = binding.d


            a.text = userItem.a
            b.text = userItem.b
            c.text = userItem.c
            d.text = userItem.d

            soalGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
                override fun onCheckedChanged(radioGroup: RadioGroup?, i: Int) {
                }
            })
        }
    }

    fun setAnswer(myAnswer: String?, answer: String?, no: Int?, model: KuisCerdasModel?) {

        if (myAnswer == answer) {
            no?.let { nomor ->
                model?.myAnswer = myAnswer
                model?.no = nomor
                model?.nilai = 1
                model?.let { data ->
                  var dataNo = mJawaban.find { it.no == nomor }
                    if(dataNo?.no == nomor){
                        dataNo?.myAnswer = myAnswer
                    }else{
                        mJawaban.add(data)
                    }
                    for (m in 0 until mJawaban.size){
                        Log.d("Kuis Adapter", "$no = ${myAnswer}   ${model.jawaban}\n ${mJawaban}")
                    }
                }
            }
        } else if (myAnswer != answer) {
            no?.let {nomor->
                model?.myAnswer = myAnswer
                model?.no = no
                model?.nilai = 0
                model?.let {data->
                    var dataNo = mJawaban.find { it.no == nomor }
                    if(dataNo?.no == nomor){
                        dataNo?.myAnswer = myAnswer
                    }else{
                        mJawaban.add(data)
                    }
                    for (m in 0 until mJawaban.size){
                        Log.d("Kuis Adapter", "$no = ${myAnswer}   ${model.jawaban}\n ${mJawaban}")
                    }
                }
            }
        }
    }

}