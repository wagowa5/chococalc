package com.choco.calculator.domain

/**
 * キャラクターのステ振りステータス
 * ビタの計算に使用する
 */
data class CharacterStatus(
    // TODO ENUMにする
    val job: String,
    val level: Int,
    val pow: Int,
    val int: Int,
    val spd: Int,
    val vit: Int,
    val luk: Int,
)
