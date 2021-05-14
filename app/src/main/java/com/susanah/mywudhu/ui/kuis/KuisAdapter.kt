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
    private lateinit var onItemClickCallback: OnItemClickCallback
    var posisi: Int = 0

    fun setData(items: ArrayList<KuisCerdasModel>) {
        mData.clear()
        mData.addAll(items)
        notifyDataSetChanged()
    }



    interface OnItemClickCallback {
        fun onBottomReached(position: Int)
        fun onDataAnswer(data: List<KuisCerdasModel>)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.items_kuis, viewGroup, false)

        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, position: Int) {
        listViewHolder.bind(mData[position])
        val _binding = ItemsKuisBinding.bind(listViewHolder.itemView)
        posisi = position
        val soalGroup = _binding.rgSoal

        val a = _binding.a
        val b = _binding.b
        val c = _binding.c
        val d = _binding.d

        val model = mData.get(posisi)
        val no = model.no
        soalGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(rg: RadioGroup?, i: Int) {
                model.no = i
                when(model.no){
                    R.id.a -> {
                        a.isChecked = true
                        setAnswer(model.a?.get(0).toString(), model?.jawaban, no, model)
                    }
                    R.id.b -> {
                        b.isChecked = true
                        setAnswer(model.b?.get(0).toString(), model?.jawaban, no, model)
                    }
                    R.id.c ->{
                        c.isChecked = true
                        setAnswer(model.c?.get(0).toString(), model?.jawaban, no, model)
                    }
                    R.id.d ->  {
                        d.isChecked = true
                        setAnswer(model.d?.get(0).toString(), model?.jawaban, no, model)
                    }
                    null -> {
                        setAnswer(null, model?.jawaban, no, model)
                    }
                }
            }
        })

        onItemClickCallback.onBottomReached(position)
    }

    override fun getItemCount(): Int = mData.size

    override fun getItemViewType(position: Int): Int {
        return position
    }


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
                        Log.d("Kuis Adapter", "$no = ${myAnswer}  ${model.jawaban}\n ${mJawaban}")
                    }
                }
            }
        }

        onItemClickCallback.onDataAnswer(mJawaban)
    }



}