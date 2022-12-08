package com.cathaybk.dbs.cathaymvp.mvvm

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import kotlin.concurrent.timer

/**
 * Created by Ricky on 2022/12/8.
 */
data class ShakiraAlbum(
    val title: String,
    val initScore: Int
) : BaseObservable() {
    private var totalScore: Int = initScore
    private val totalScoreContainer = ObservableField(initScore.toString())
    fun updateAlbumScore() {
        timer(initialDelay = 1000, period = 2000) {
            totalScore += 1
            totalScoreContainer.set(totalScore.toString())
        }
    }

    @Bindable
    fun getTotalScore() = totalScoreContainer
}
