package com.susanah.mywudhu.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SurahModel(

    val number: Int? = null,

    val englishName: String? = null,

    val numberOfAyahs: Int? = null,

): Parcelable
