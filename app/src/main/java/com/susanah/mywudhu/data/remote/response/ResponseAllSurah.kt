package com.susanah.mywudhu.data.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class ResponseAllSurah(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: String? = null
) : Parcelable

@Parcelize
data class DataItem(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("sequence")
	val sequence: Int? = null,

	@field:SerializedName("numberOfVerses")
	val numberOfVerses: Int? = null,

	@field:SerializedName("revelation")
	val revelation: RevelationSurat? = null,

	@field:SerializedName("name")
	val name: NameSurat? = null,

	@field:SerializedName("tafsir")
	val tafsir: TafsirSurat? = null
) : Parcelable

@Parcelize
data class TranslationSurat(

	@field:SerializedName("en")
	val en: String? = null,

	@field:SerializedName("id")
	val id: String? = null
) : Parcelable

@Parcelize
data class NameSurat(

	@field:SerializedName("translation")
	val translation: TranslationSurat? = null,

	@field:SerializedName("short")
	val jsonMemberShort: String? = null,

	@field:SerializedName("long")
	val jsonMemberLong: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: TransliterationSurat? = null
) : Parcelable

@Parcelize
data class TransliterationSurat(

	@field:SerializedName("en")
	val en: String? = null,

	@field:SerializedName("id")
	val id: String? = null
) : Parcelable

@Parcelize
data class RevelationSurat(

	@field:SerializedName("en")
	val en: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("arab")
	val arab: String? = null
) : Parcelable

@Parcelize
data class TafsirSurat(

	@field:SerializedName("id")
	val id: String? = null
) : Parcelable
