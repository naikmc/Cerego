package com.example.cerego

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface Api {

    @Headers( "Authorization:Bearer tK6rfo9t6Ux/TYnKk8mWu4gcA9XlAlWLosJwAH0jZmt1ck1GlTi4Z6AnJBDfqjdc")
    @GET("my/sets")
    fun getData(): Call<ceregoResponse>
}