package com.susanah.mywudhu.data

import androidx.lifecycle.LiveData
import com.susanah.mywudhu.data.model.SurahDetailModel
import com.susanah.mywudhu.data.model.SurahModel

interface WudhuDataSource {
    fun getSurah(): LiveData<List<SurahModel>>
    fun getDetailSurah(id: String): LiveData<List<SurahDetailModel>>
}