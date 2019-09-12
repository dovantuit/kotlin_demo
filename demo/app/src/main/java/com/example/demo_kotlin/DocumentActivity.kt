package com.example.demo_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DocumentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_document)
        // xu ly main

        ///

    }
    /// funciton define

    /*
    // hàm api bình thường
    fun run(url: String) {
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) = println(response.body()?.string())
        })
    }
    */
}
