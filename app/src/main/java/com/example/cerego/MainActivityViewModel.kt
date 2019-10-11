package com.example.cerego

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback

class MainActivityViewModel : ViewModel() {

    private var list: MutableLiveData<List<com.example.cerego.Set?>> = MutableLiveData()

    init {
        fetchData()
    }

    fun getData(): LiveData<List<com.example.cerego.Set?>> {

        return list
    }


    private fun fetchData() {

        RetrofitData.instance.getData().enqueue(object : Callback<ceregoResponse> {
            override fun onFailure(call: Call<ceregoResponse>, t: Throwable) {

                println("@@@@@@@@" + t.message)
            }

            override fun onResponse(
                call: Call<ceregoResponse>,
                response: retrofit2.Response<ceregoResponse>
            ) {
                list.value = response?.body()?.response?.sets
                println("@@@@@@@" + response?.body()?.response?.sets?.get(0)?.image?.url)
            }


        })

    }
}