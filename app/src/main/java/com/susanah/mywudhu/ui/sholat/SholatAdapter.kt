package com.susanah.mywudhu.ui.sholat

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.susanah.mywudhu.R
import com.susanah.mywudhu.data.model.SholatModel
import com.susanah.mywudhu.databinding.ItemsSholatBinding


class SholatAdapter(private val lifecycleOwner: LifecycleOwner) : RecyclerView.Adapter<SholatAdapter.ListViewHolder>() {


    private val mData = ArrayList<SholatModel>()

    fun setData(items: ArrayList<SholatModel>) {
        mData.clear()
        mData.addAll(items)
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.items_sholat, viewGroup, false)

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

        private val binding = ItemsSholatBinding.bind(itemView)

        fun bind(sholatItem: SholatModel) {
            Glide.with(itemView.context)
                .load(sholatItem.gambar1)
                .into(binding.imgGerakan1)

            Glide.with(itemView.context)
                .load(sholatItem.gambar2)
                .into(binding.imgGerakan2)

            Glide.with(itemView.context)
                .load(sholatItem.gambar3)
                .into(binding.imgGerakan3)

            Glide.with(itemView.context)
                .load(sholatItem.gambar4)
                .into(binding.imgGerakan4)

            Glide.with(itemView.context)
                .load(sholatItem.gambar5)
                .into(binding.imgGerakan5)

            Glide.with(itemView.context)
                .load(sholatItem.gambar6)
                .into(binding.imgGerakan6)

            if (sholatItem.gambar7 == null){
                binding.imgGerakan7.visibility = View.GONE
            }else{
                Glide.with(itemView.context)
                    .load(sholatItem.gambar7)
                    .into(binding.imgGerakan7)
            }


            val youTubePlayerView: YouTubePlayerView = binding.wvUrlYoutubeGerakan1
            lifecycleOwner.lifecycle.addObserver(youTubePlayerView)

            binding.tvSholatGerakan1.text = sholatItem.deskripsi
            youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = sholatItem.url1
                    if (videoId != null){
                        youTubePlayer.cueVideo(videoId, 0f)
                    }else{
                        binding.wvUrlYoutubeGerakan1.visibility = View.GONE
                    }
                }
            })


            val youTubePlayerView2: YouTubePlayerView = binding.wvUrlYoutubeGerakan2
            lifecycleOwner.lifecycle.addObserver(youTubePlayerView2)

            binding.tvSholatGerakan2.text = sholatItem.deskripsi2
            youTubePlayerView2.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = sholatItem.url2
                    if (videoId != null){
                        youTubePlayer.cueVideo(videoId, 0f)
                    }else{
                        binding.wvUrlYoutubeGerakan2.visibility = View.GONE
                    }
                }
            })


            val youTubePlayerView3: YouTubePlayerView = binding.wvUrlYoutubeGerakan3
            lifecycleOwner.lifecycle.addObserver(youTubePlayerView3)

            binding.tvSholatGerakan3.text = sholatItem.deskripsi3
            youTubePlayerView3.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = sholatItem.url3
                    if (videoId != null){
                        youTubePlayer.cueVideo(videoId, 0f)
                    }else{
                        binding.wvUrlYoutubeGerakan3.visibility = View.GONE
                    }
                }
            })


            val youTubePlayerView4: YouTubePlayerView = binding.wvUrlYoutubeGerakan4
            lifecycleOwner.lifecycle.addObserver(youTubePlayerView4)

            binding.tvSholatGerakan4.text = sholatItem.deskripsi4
            youTubePlayerView4.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = sholatItem.url4
                    if (videoId != null){
                        youTubePlayer.cueVideo(videoId, 0f)
                    }else{
                        binding.wvUrlYoutubeGerakan4.visibility = View.GONE
                    }
                }
            })



            val youTubePlayerView5: YouTubePlayerView = binding.wvUrlYoutubeGerakan5
            lifecycleOwner.lifecycle.addObserver(youTubePlayerView5)

            binding.tvSholatGerakan5.text = sholatItem.deskripsi5
            youTubePlayerView5.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = sholatItem.url5
                    if (videoId != null){
                        youTubePlayer.cueVideo(videoId, 0f)
                    }else{
                        binding.wvUrlYoutubeGerakan5.visibility = View.GONE
                    }
                }
            })


            val youTubePlayerView6: YouTubePlayerView = binding.wvUrlYoutubeGerakan6
            lifecycleOwner.lifecycle.addObserver(youTubePlayerView6)

            binding.tvSholatGerakan6.text = sholatItem.deskripsi6
            youTubePlayerView6.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = sholatItem.url6
                    if (videoId != null){
                        youTubePlayer.cueVideo(videoId, 0f)
                    }else{
                        binding.wvUrlYoutubeGerakan6.visibility = View.GONE
                    }
                }
            })

            val youTubePlayerView7: YouTubePlayerView = binding.wvUrlYoutubeGerakan7
            lifecycleOwner.lifecycle.addObserver(youTubePlayerView7)

            binding.tvSholatGerakan7.text = sholatItem.deskripsi7
            youTubePlayerView7.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = sholatItem.url7
                    if (videoId != null){
                        youTubePlayer.cueVideo(videoId, 0f)
                    }else{
                        binding.wvUrlYoutubeGerakan7.visibility = View.GONE
                        binding.tvSholatGerakan7.visibility = View.GONE
                    }
                }
            })

        }
    }



}