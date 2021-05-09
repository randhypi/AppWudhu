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
import com.susanah.mywudhu.ui.surat.SuratAdapter

class KuisAdapter : RecyclerView.Adapter<KuisAdapter.ListViewHolder>() {


    private val mData = ArrayList<KuisCerdasModel>()

    private val lastCheckedRadioGroup: RadioGroup? = null


    fun setData(items: ArrayList<KuisCerdasModel>) {
        mData.clear()
        mData.addAll(items)
        notifyDataSetChanged()
    }

    private lateinit var onItemClickCallback: OnItemClickCallBack

    interface OnItemClickCallBack {
        fun onItemClicked(data: KuisCerdasModel)
    }

    fun setOnCLickCallBack(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallback = onItemClickCallback
    }




    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.items_kuis, viewGroup, false)

        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, position: Int) {
        listViewHolder.bind(mData[position])

    }

    override fun getItemCount(): Int = mData.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemsKuisBinding.bind(itemView)
        fun bind(userItem: KuisCerdasModel) {
            binding.tvSoal.text = userItem.soal

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


}