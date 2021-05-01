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
                    val name = response?.englishName
                    val ayat = response?.numberOfAyahs

                    val surah =
                        SurahModel(number = numberSurah, englishName = name, numberOfAyahs = ayat)

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
                remoteDataSource.getTranslate(id, object : RemoteDataSource.LoadTranslateCallback {
                    override fun onTranslateReceived(responseTranslate: ResponseDetailSurah) {
                        val surahArrayList = ArrayList<SurahDetailModel>()
                        for (response in responseDetailSurah?.data?.ayahs!!){
                            for (responseTranslate in responseTranslate?.data?.ayahs!!){
                                val ayat = response?.numberInSurah.toString()
                                val textArab = response?.text
                                val textId = responseTranslate?.text
                                val nameSurah = responseDetailSurah?.data?.englishName
                                val jmlAyat = responseDetailSurah?.data?.numberOfAyahs.toString()
                                val juz = response?.juz.toString()

                                val surah = SurahDetailModel(nameSurah,jmlAyat,textArab,textId,ayat,juz)

                                surahArrayList.add(surah)
                            }
                        }
                        surah.postValue(surahArrayList)
                    }
                })
            }
        })
        return surah
    }


}