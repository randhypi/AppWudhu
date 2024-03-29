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

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: String? = null
) : Parcelable

@Parcelize
data class Data(

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
	val tafsir: TafsirSurat? = null,

	@field:SerializedName("preBismillah")
	val preBismillah: PreBismillah? = null,

	@field:SerializedName("verses")
	val verses: List<VersesItem?>? = null
) : Parcelable

@Parcelize
data class Name(

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
data class Sajda(

	@field:SerializedName("obligatory")
	val obligatory: Boolean? = null,

	@field:SerializedName("recommended")
	val recommended: Boolean? = null
) : Parcelable

@Parcelize
data class Text(

	@field:SerializedName("transliteration")
	val transliteration: TransliterationSurat? = null,

	@field:SerializedName("arab")
	val arab: String? = null
) : Parcelable

@Parcelize
data class Revelation(

	@field:SerializedName("en")
	val en: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("arab")
	val arab: String? = null
) : Parcelable

@Parcelize
data class Meta(

	@field:SerializedName("hizbQuarter")
	val hizbQuarter: Int? = null,

	@field:SerializedName("ruku")
	val ruku: Int? = null,

	@field:SerializedName("manzil")
	val manzil: Int? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("sajda")
	val sajda: Sajda? = null,

	@field:SerializedName("juz")
	val juz: Int? = null
) : Parcelable

@Parcelize
data class Translation(

	@field:SerializedName("en")
	val en: String? = null,

	@field:SerializedName("id")
	val id: String? = null
) : Parcelable

@Parcelize
data class Transliteration(

	@field:SerializedName("en")
	val en: String? = null
) : Parcelable

@Parcelize
data class PreBismillah(

	@field:SerializedName("translation")
	val translation: TranslationSurat? = null,

	@field:SerializedName("text")
	val text: Text? = null,

	@field:SerializedName("audio")
	val audio: Audio? = null
) : Parcelable

@Parcelize
data class VersesItem(

	@field:SerializedName("number")
	val number: Number? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("translation")
	val translation: TranslationSurat? = null,

	@field:SerializedName("text")
	val text: Text? = null,

	@field:SerializedName("audio")
	val audio: Audio? = null
) : Parcelable

@Parcelize
data class Number(

	@field:SerializedName("inQuran")
	val inQuran: Int? = null,

	@field:SerializedName("inSurah")
	val inSurah: Int? = null
) : Parcelable

@Parcelize
data class Id(

	@field:SerializedName("short")
	val jsonMemberShort: String? = null,

	@field:SerializedName("long")
	val jsonMemberLong: String? = null
) : Parcelable

@Parcelize
data class Audio(

	@field:SerializedName("secondary")
	val secondary: List<String?>? = null,

	@field:SerializedName("primary")
	val primary: String? = null
) : Parcelable

@Parcelize
data class Tafsir(

	@field:SerializedName("id")
	val id: Id? = null
) : Parcelable
