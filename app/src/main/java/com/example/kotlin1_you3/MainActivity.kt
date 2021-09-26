package com.example.kotlin1_you3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    var responseDTO = arrayListOf<DataDTO>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            callApi()
        }
    }

    private fun callApi() {
       var apiClient:ApiClient= Network.getRetrofitInstance().create(ApiClient::class.java)
        apiClient.getUser(2).enqueue(object : retrofit2.Callback<ResponseDTO>{
            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {
              response.body()?.let {
                 textView.text = it.data?.email
                 textView2.text = it.data?.id.toString()
              }





            }

            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {

            }

        })
    }
}


