package com.cathaybk.dbs.cathaymvp.album

/**
 * Created by Ricky on 2022/11/29.
 */
abstract class MyAbstract {
    abstract fun getAlbumScore(): Float
    fun getAlbumTitle(albumTitleSrc: String): String {
        return "$albumTitleSrc Ricky原創"
    }

    abstract fun getMyRecord(): String

    fun getSpecialRecord(): String {
        return getMyRecord() + "_Special"
    }
}