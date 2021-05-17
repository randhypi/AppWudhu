package com.susanah.mywudhu.ui.sholat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.susanah.mywudhu.data.model.KuisCerdasModel
import com.susanah.mywudhu.data.model.SholatModel
import com.susanah.mywudhu.utils.DummyKuisCerdas
import com.susanah.mywudhu.utils.DummySholat

class SholatViewModel : ViewModel() {

    val _sholat = MutableLiveData<List<SholatModel>>()

    fun getDummySholat() = _sholat.postValue(DummySholat.getSholat())

    fun getSholat():LiveData<List<SholatModel>> = _sholat
}