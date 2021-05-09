package com.susanah.mywudhu.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class KuisCerdasModel(
    val soal: String? = "Tidak ada soal",
    val a: String? = "tidak ada pilihan",
    val b: String? = "tidak ada pilihan",
    val c: String? = "tidak ada pilihan",
    val d: String?= "tidak ada pilihan",
    val jawaban: String? = "tidak ada jawaban"

): Parcelable
