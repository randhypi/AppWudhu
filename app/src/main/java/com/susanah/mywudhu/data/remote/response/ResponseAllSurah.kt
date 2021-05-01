package com.susanah.mywudhu.data.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class ResponseAllSurah(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemSurah?>? = null,

	@field:SerializedName("status")
	val status: String? = null
) : Parcelable

@Parcelize
data class DataItemSurah(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("englishName")
	val englishName: String? = null,

	@field:SerializedName("numberOfAyahs")
	val numberOfAyahs: Int? = null,

) : Parcelable
