package com.susanah.mywudhu.data.api

import com.susanah.mywudhu.data.remote.response.ResponseAllSurah
import com.susanah.mywudhu.data.remote.response.ResponseDetailSurah
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {

    @GET("/v1/surah/{noSurah}/id.muntakhab")
    fun getSurahDetail(@Path("noSurah") noSurah: String): Call<ResponseDetailSurah>

    @GET("/v1/surah/{noSurah}")
    fun getSurahDetailTranslate(@Path("noSurah") noSurah: String): Call<ResponseDetailSurah>

    @GET("/v1/surah")
    fun getSurah(): Call<ResponseAllSurah>

}