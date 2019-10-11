package com.example.cerego

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitData {


    val instance: Api by lazy{
        Retrofit.Builder()
                .baseUrl("https://cerego.com/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(Api::class.java)

    }

}