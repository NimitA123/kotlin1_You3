package com.example.kotlin1_you3


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class SupportDTO(

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("text")
	val text: String? = null
)