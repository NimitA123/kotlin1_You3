package com.example.kotlin1_you3

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {
    @GET("/api/users/{ID}")
  fun  getUser(@Path ("ID") id:Int) : Call<ResponseDTO>


}