package com.example.cerego

import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback

class MainActivityViewModel : ViewModel() {




    fun fetchData(){

        RetrofitData.instance.getData().enqueue(object : Callback<ceregoResponse>{
            override fun onFailure(call: Call<ceregoResponse>, t: Throwable) {

                println("@@@@@@@@"+t.message)
            }

            override fun onResponse(
                call: Call<ceregoResponse>,
                response: retrofit2.Response<ceregoResponse>
            ) {

                println("@@@@@@@"+response?.body()?.response?.sets?.get(0)?.image?.url)
            }


        })

    }
}