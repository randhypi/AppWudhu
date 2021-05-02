package com.susanah.mywudhu.ui.surat.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.SurahDetailModel
import com.susanah.mywudhu.data.model.SurahModel
import com.susanah.mywudhu.databinding.ItemsSurahBinding
import com.susanah.mywudhu.databinding.ItemsSurahDetailBinding
import com.susanah.mywudhu.ui.surat.SuratAdapter

class DetailSuratAdapter : RecyclerView.Adapter<DetailSuratAdapter.ListViewHolder>() {

    private val mData = ArrayList<SurahDetailModel>()

    fun setData(items: ArrayList<SurahDetailModel>) {
        mData.clear()
        mData.addAll(items)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.items_surah_detail, viewGroup, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, position: Int) {
        listViewHolder.bind(mData[position])
    }

    override fun getItemCount(): Int = mData.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemsSurahDetailBinding.bind(itemView)
        fun bind(userItem: SurahDetailModel) {
            binding.surah.text = userItem.textArab
            binding.ayat.text = userItem.ayat
            binding.tvBacaan.text = userItem.textId
            binding.tvTerjemahan.text = userItem.translate
        }
    }


}