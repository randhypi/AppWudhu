package com.susanah.mywudhu.ui.surat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.susanah.mywudhu.data.WudhuRepository
import com.susanah.mywudhu.data.model.SurahModel

class SuratPendekViewModel(private val wudhuRepository: WudhuRepository) : ViewModel() {
fun getSurah(): LiveData<List<SurahModel>> = wudhuRepository.getSurah()
}