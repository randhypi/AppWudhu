package com.susanah.mywudhu.ui.surat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.SurahModel
import com.susanah.mywudhu.databinding.ItemsSurahBinding

class SuratAdapter : RecyclerView.Adapter<SuratAdapter.ListViewHolder>() {

    private val mData = ArrayList<SurahModel>()

    fun setData(items: ArrayList<SurahModel>) {
        mData.clear()
        mData.addAll(items)
        notifyDataSetChanged()
    }


    private var onItemClickCallback: OnItemClickCallback? = null
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.items_surah, viewGroup, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, position: Int) {
        listViewHolder.bind(mData[position])
    }

    override fun getItemCount(): Int = mData.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemsSurahBinding.bind(itemView)
        fun bind(userItem: SurahModel) {
            binding.ayat.text = userItem.number.toString()
            binding.surah.text = userItem.englishName

            itemView.setOnClickListener { onItemClickCallback?.onItemClicked(userItem.number.toString()) }
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: String)
    }
}