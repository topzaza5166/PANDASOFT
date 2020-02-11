package com.example.pandasoft.data.model

import com.google.gson.annotations.SerializedName

data class LikeRequest(
    @SerializedName("newsId")
    val newsId: Int
)