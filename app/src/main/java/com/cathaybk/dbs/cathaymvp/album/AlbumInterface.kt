package com.cathaybk.dbs.cathaymvp.album

/**
 * Created by Ricky on 2022/11/29.
 */
interface AlbumInterface {
    fun getAlbumTitle(): String
    fun getAlbumDescription(): String
    fun getBaseAlbumPrice(): Int {
        return 15
    }
}