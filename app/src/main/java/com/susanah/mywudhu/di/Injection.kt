package com.susanah.mywudhu.di

import android.content.Context
import com.susanah.mywudhu.data.WudhuRepository
import com.susanah.mywudhu.data.remote.RemoteDataSource

object Injection {
    fun provideRepository(context: Context): WudhuRepository {

        val remoteDataSource = RemoteDataSource.getInstance(context)

        return WudhuRepository.getInstance(remoteDataSource)
    }
}