package com.example.assignment1

import android.content.Context

class DataSource(val context: Context) {
    fun getAlbumNameList(): Array<String>{
        return context.resources.getStringArray(R.array.album_name_array)
    }
    fun getFirstSingleList(): Array<String>{
        return context.resources.getStringArray(R.array.first_single_array)
    }

    fun getReleaseDateList(): Array<String>{
        return context.resources.getStringArray(R.array.release_date_array)
    }
    fun generateAlbumData(): MutableList<Album> {
        val albumNames = getAlbumNameList()
        val firstSingles = getFirstSingleList()
        val releaseDates = getReleaseDateList()

        val itemCount = minOf(albumNames.size, firstSingles.size, releaseDates.size)
        val albums = mutableListOf<Album>()

        for (i in 0 until itemCount) {
            val album = Album(albumNames[i], firstSingles[i], releaseDates[i])
            albums.add(album)
        }
        return albums
    }
}