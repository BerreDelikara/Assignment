package com.example.assignment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val myRecyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)

    myRecyclerView.layoutManager = LinearLayoutManager(this)

    val albums = DataSource(this).generateAlbumData()
    myRecyclerView.adapter = AlbumListAdapter(albums)
}
}

