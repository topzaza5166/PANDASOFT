package com.example.pandasoft.data

import com.example.pandasoft.data.model.LikeRequest
import com.example.pandasoft.data.model.LoginRequest
import com.example.pandasoft.data.model.LoginResponse
import com.example.pandasoft.data.model.NewsList
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {

    @POST("login")
    fun login(@Body body: LoginRequest): Single<LoginResponse>

    @GET("news")
    fun getNews(): Single<NewsList>

    @POST("like")
    fun postLike(@Body body: LikeRequest)
}