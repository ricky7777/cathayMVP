package com.cathaybk.dbs.cathaymvp.album

/**
 * Created by Ricky on 2022/11/29.
 */
interface AlbumInfoContract {
    interface Presenter {
        fun getAlbumInfo()
    }

    interface View {
        fun showAlbumInfo(album: Album)
    }
}