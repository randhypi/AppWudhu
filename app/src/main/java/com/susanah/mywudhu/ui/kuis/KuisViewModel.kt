package com.susanah.mywudhu.ui.kuis

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.susanah.mywudhu.data.model.KuisCerdasModel
import com.susanah.mywudhu.utils.DummyKuisCerdas

@Suppress("UNCHECKED_CAST")
class KuisViewModel: ViewModel() {


    val _soal = MutableLiveData<List<KuisCerdasModel>>()

    fun getDummySoal() = _soal.postValue(DummyKuisCerdas.kuisCerdas())

    fun getSoal():LiveData<List<KuisCerdasModel>> = _soal



}