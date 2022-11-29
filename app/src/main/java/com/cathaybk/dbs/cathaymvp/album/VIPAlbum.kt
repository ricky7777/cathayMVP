package com.cathaybk.dbs.cathaymvp.album

/**
 * Created by Ricky on 2022/11/29.
 */
class VIPAlbum : AlbumInterface {
    override fun getAlbumTitle(): String {
        return getBaseAlbumPrice().toString()
    }

    override fun getAlbumDescription(): String {
        TODO("Not yet implemented")
    }
}

data class Album(val title: String)