package com.susanah.mywudhu.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.susanah.mywudhu.data.WudhuRepository
import com.susanah.mywudhu.di.Injection
import com.susanah.mywudhu.ui.kuis.KuisViewModel
import com.susanah.mywudhu.ui.sholat.SholatViewModel
import com.susanah.mywudhu.ui.surat.SuratPendekViewModel
import com.susanah.mywudhu.ui.surat.detail.SurahDetailViewModel
import com.susanah.mywudhu.ui.wudhu.WudhuViewModel

class ViewModelFactory private constructor(private val mWudhuRepository: WudhuRepository) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context)).apply {
                    instance = this
                }
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(SuratPendekViewModel::class.java) -> {
                return SuratPendekViewModel(mWudhuRepository) as T
            }
            modelClass.isAssignableFrom(SurahDetailViewModel::class.java) -> {
                return SurahDetailViewModel(mWudhuRepository) as T
            }
            modelClass.isAssignableFrom(KuisViewModel::class.java) -> {
                return KuisViewModel() as T
            }
            modelClass.isAssignableFrom(WudhuViewModel::class.java) -> {
                return WudhuViewModel() as T
            }

            modelClass.isAssignableFrom(SholatViewModel::class.java) -> {
                return SholatViewModel() as T
            }

            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }

    }
}