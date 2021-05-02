package com.susanah.mywudhu.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class SurahDetailModel(
        val nameSurah: String? = "",
        val jumlahAyat: String? = "",
        val textArab: String?= "",
        val textId: String? = "",
        val ayat: String? ="",
        val juz: String? = "",
        val translate: String? = "",
        val noSurat:String? = ""
): Parcelable
