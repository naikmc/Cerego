package com.example.cerego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.cerego.adapter.Adapter

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myAdapter: Adapter

    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel =  ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        myAdapter  = Adapter()
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = myAdapter

        }

        viewModel.getData().observe(this, Observer {


            myAdapter.setCampaignList(it)
        })
    }
}
