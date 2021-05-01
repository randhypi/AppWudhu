package com.susanah.mywudhu.ui.surat.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.susanah.mywudhu.data.WudhuRepository
import com.susanah.mywudhu.data.model.SurahDetailModel

class SurahDetailViewModel(private val wudhuRepository: WudhuRepository) : ViewModel() {
    fun getDetailSurah(surat: String): LiveData<List<SurahDetailModel>> = wudhuRepository.getDetailSurah(id = surat )
}