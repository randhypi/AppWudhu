package com.susanah.mywudhu.ui.kuis

import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.KuisCerdasModel
import com.susanah.mywudhu.databinding.ItemsKuisBinding

class KuisAdapter : RecyclerView.Adapter<KuisAdapter.ListViewHolder>() {


    private val mData = ArrayList<KuisCerdasModel>()

    var position: Int = 0
    var mSelectedItem:Int = -1

    private var lastCheckedRadioGroup: RadioGroup? = null

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
        model.no?.let { _binding.rgSoal.check(it) }
        _binding.rgSoal.setOnCheckedChangeListener(object :RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(rg: RadioGroup?, i: Int) {
                model.no = i
                if (model.no == R.id.a ){
                    _binding.a.isChecked = true
                }else if (model.no == R.id.b){
                    _binding.b.isChecked = true
                }else if (model.no == R.id.c){
                    _binding.c.isChecked = true
                }else if (model.no == R.id.d){
                    _binding.d.isChecked = true
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



            a.setOnClickListener {

            }

            b.setOnClickListener {

            }
            c.setOnClickListener {

            }
            d.setOnClickListener {

            }
            soalGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
                override fun onCheckedChanged(radioGroup: RadioGroup?, i: Int) {
                }
            })



        }
    }


}