package com.susanah.mywudhu.ui.sholat

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.WudhuModel
import com.susanah.mywudhu.databinding.ItemsWudhuBinding


class SholatAdapter(private val lifecycleOwner: LifecycleOwner) : RecyclerView.Adapter<SholatAdapter.ListViewHolder>() {


    private val mData = ArrayList<WudhuModel>()

    fun setData(items: ArrayList<WudhuModel>) {
        mData.clear()
        mData.addAll(items)
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.items_wudhu, viewGroup, false)

        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, position: Int) {
        listViewHolder.bind(mData[position])
    }

    override fun getItemCount(): Int = mData.size

    override fun getItemViewType(position: Int): Int {
        return position
    }


    @SuppressLint("SetJavaScriptEnabled")
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ItemsWudhuBinding.bind(itemView)

        fun bind(wudhuItem: WudhuModel) {
            val youTubePlayerView: YouTubePlayerView = binding.wvUrlYoutube
        lifecycleOwner.lifecycle.addObserver(youTubePlayerView)

            binding.tvWudhu.text = wudhuItem.deskripsi
            youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = wudhuItem.url
                    if (videoId != null){
                        youTubePlayer.loadVideo(videoId, 0f)
                    }else{
                        binding.wvUrlYoutube.visibility = View.GONE
                    }
                }
            })
        }
    }



}