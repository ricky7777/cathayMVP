package com.cathaybk.dbs.cathaymvp.album

import android.content.Context

/**
 * Created by Ricky on 2022/11/29.
 */
class AlbumPresenter(val view: AlbumInfoContract.View, val context: Context) : AlbumInfoContract.Presenter {
    override fun getAlbumInfo() {
        val album = Album("國泰-錢的聲音")
        view.showAlbumInfo(album)
    }
}