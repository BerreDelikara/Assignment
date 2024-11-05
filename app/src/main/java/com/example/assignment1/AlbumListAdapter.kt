package com.example.assignment1
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlbumListAdapter(val data: MutableList<Album>) : RecyclerView.Adapter<AlbumListAdapter.ItemViewHolder>(){
    class ItemViewHolder(val item: View): RecyclerView.ViewHolder(item){
        val textView  = item.findViewById<TextView>(R.id.textView)

        private val ALBUM_KEY = "ALBUM"
        lateinit var album: Album

        init {
            item.setOnClickListener {
                val showDetailIntent = Intent(itemView.context, AlbumInfoActivity::class.java)
                showDetailIntent.putExtra(ALBUM_KEY, album)
                itemView.context.startActivity(showDetailIntent)
            }
        }
        fun bind(album: Album){
            this.album = album
            textView.text = album.albumName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.album_layout, parent, false)
        return  ItemViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val album = data[position]
        holder.bind(album)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}