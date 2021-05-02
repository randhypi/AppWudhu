package com.susanah.mywudhu.data.remote

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.widget.Toast
import com.susanah.mywudhu.data.api.ApiConfig
import com.susanah.mywudhu.data.api.ApiServices
import com.susanah.mywudhu.data.remote.response.ResponseAllSurah
import com.susanah.mywudhu.data.remote.response.ResponseDetailSurah
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource private constructor(private val context: Context) {

    companion object {

        val TAG = RemoteDataSource::class.java.simpleName

        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(context: Context): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(context).apply { instance = this }
            }
    }


    fun getSurah(callback: LoadSurahCallback){
        var service: ApiServices = ApiConfig.getApiService()
        val callSurah: Call<ResponseAllSurah> = service.getSurah()
        callSurah.enqueue(object : Callback<ResponseAllSurah> {
            override fun onResponse(
                call: Call<ResponseAllSurah>,
                response: Response<ResponseAllSurah>
            ) {
                try {
                    if (!response.isSuccessful) {
                        Log.d(TAG, response.code().toString())
                        return
                    }
                    response.body().let {
                        it?.let {
                            callback.onSurahReceived(it)
                        }
                    }
                } catch (e: Exception) {
                    Toast.makeText(context,"Data tidak ditemukan : $e\n ",Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<ResponseAllSurah>, t: Throwable) {
                    Toast.makeText(context,"Data tidak ditemukan : $call\n $t",Toast.LENGTH_SHORT).show()
            }
        })
    }

    fun getDetailSurah(id: String,callback: LoadDetailSurahCallback){
        var service: ApiServices = ApiConfig.getApiService()
        val callDetailSurah: Call<ResponseDetailSurah> = service.getSurahDetail(id)
        callDetailSurah.enqueue(object : Callback<ResponseDetailSurah> {
            override fun onResponse(
                call: Call<ResponseDetailSurah>,
                response: Response<ResponseDetailSurah>
            ) {
                try {
                    if (!response.isSuccessful) {
                        Log.d(TAG, response.code().toString())
                        return
                    }
                    response.body().let {
                        it?.let {
                            callback.onDetailSurahReceived(it)
                        }
                    }
                } catch (e: Exception) {
                    Toast.makeText(context,"Data tidak ditemukan : $e\n ",Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<ResponseDetailSurah>, t: Throwable) {
                Toast.makeText(context,"Data tidak ditemukan : $call\n $t",Toast.LENGTH_SHORT).show()
            }
        })
    }




    interface LoadSurahCallback{
        fun onSurahReceived(responseAllSurah: ResponseAllSurah)
    }

    interface LoadDetailSurahCallback{
        fun onDetailSurahReceived(responseDetailSurah: ResponseDetailSurah)
    }


}