package com.susanah.mywudhu.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.susanah.mywudhu.data.model.SurahDetailModel
import com.susanah.mywudhu.data.model.SurahModel
import com.susanah.mywudhu.data.remote.RemoteDataSource
import com.susanah.mywudhu.data.remote.response.ResponseAllSurah
import com.susanah.mywudhu.data.remote.response.ResponseDetailSurah

class WudhuRepository private constructor(private val remoteDataSource: RemoteDataSource) :
    WudhuDataSource {
    companion object {
        @Volatile
        private var instance: WudhuRepository? = null
        fun getInstance(remoteData: RemoteDataSource): WudhuRepository =
            instance ?: synchronized(this) {
                instance ?: WudhuRepository(remoteData).apply { instance = this }
            }
    }

    override fun getSurah(): LiveData<List<SurahModel>> {
        val listSurah = MutableLiveData<List<SurahModel>>()
        remoteDataSource.getSurah(object : RemoteDataSource.LoadSurahCallback {
            override fun onSurahReceived(responseAllSurah: ResponseAllSurah) {
                val surahArrayList = ArrayList<SurahModel>()
                for (response in responseAllSurah.data!!) {

                    val numberSurah = response?.number
                    val name = response?.name?.transliteration?.id

                    val surah =
                        SurahModel(number = numberSurah, englishName = name)

                    surahArrayList.add(surah)
                }
                listSurah.postValue(surahArrayList)
            }
        })
        return listSurah
    }

    override fun getDetailSurah(id: String): LiveData<List<SurahDetailModel>> {
        val surah = MutableLiveData<List<SurahDetailModel>>()

        remoteDataSource.getDetailSurah(id, object : RemoteDataSource.LoadDetailSurahCallback {
            override fun onDetailSurahReceived(responseDetailSurah: ResponseDetailSurah) {
                val surahArrayList = ArrayList<SurahDetailModel>()
                for (response in responseDetailSurah?.data?.verses!!) {
                    val ayat = response?.number?.inSurah?.toString()
                    val textArab = response?.text?.arab
                    val textId = response?.text?.transliteration?.en
                    val translate = response?.translation?.id
                    val nameSurah = responseDetailSurah?.data?.name?.transliteration?.id
                    val jmlAyat = responseDetailSurah?.data?.numberOfVerses.toString()
                    val juz = response?.meta?.juz.toString()
                    val noSurat = response?.number.toString()

                    val surah = SurahDetailModel(nameSurah,jmlAyat,textArab,textId,ayat,juz,translate,noSurat)

                    surahArrayList.add(surah)
                }
                surah.postValue(surahArrayList)
            }
        })
        return surah
    }


}