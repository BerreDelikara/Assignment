package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.assignment1.databinding.ActivityAlbumInfoBinding


class AlbumInfoActivity : AppCompatActivity() {
    private val ALBUM_KEY = "ALBUM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityAlbumInfoBinding = DataBindingUtil.setContentView(this, R.layout.activity_album_info)
        val selectedAlbum = intent.getSerializableExtra(ALBUM_KEY) as Album

        binding.album = selectedAlbum

    }
}