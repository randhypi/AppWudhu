package com.susanah.mywudhu.ui.wudhu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.susanah.mywudhu.data.model.KuisCerdasModel
import com.susanah.mywudhu.data.model.WudhuModel
import com.susanah.mywudhu.utils.DummyKuisCerdas
import com.susanah.mywudhu.utils.DummyWudhu

class WudhuViewModel : ViewModel() {

    val _wudhu = MutableLiveData<List<WudhuModel>>()

    fun getDummyWudhu() = _wudhu.postValue(DummyWudhu.getWudhu())

    fun getWudhu():LiveData<List<WudhuModel>> = _wudhu
}