package com.susanah.mywudhu.data.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ResponseDetailSurah(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("status")
	val status: String? = null
) : Parcelable

@Parcelize
data class Data(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("englishName")
	val englishName: String? = null,

	@field:SerializedName("numberOfAyahs")
	val numberOfAyahs: Int? = null,

	@field:SerializedName("revelationType")
	val revelationType: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("ayahs")
	val ayahs: List<AyahsItem?>? = null,

	@field:SerializedName("englishNameTranslation")
	val englishNameTranslation: String? = null
) : Parcelable

@Parcelize
data class AyahsItem(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("hizbQuarter")
	val hizbQuarter: Int? = null,

	@field:SerializedName("ruku")
	val ruku: Int? = null,

	@field:SerializedName("manzil")
	val manzil: Int? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("sajda")
	val sajda: Boolean? = null,

	@field:SerializedName("numberInSurah")
	val numberInSurah: Int? = null,

	@field:SerializedName("juz")
	val juz: Int? = null
) : Parcelable
