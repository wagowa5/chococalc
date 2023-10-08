package com.choco.calculator.domain

/**
 * ステータスクラス
 */
data class Status (
    // TODO ENUMにする
    val job: String,
    val level: Int,
    val hp: ChocoHp,
    val sp: ChocoSp,
    val pow: ChocoPow,
    val int: ChocoInt,
    val spd: ChocoSpd,
    val vit: ChocoVit,
    val luk: ChocoLuk,
    val atk: ChocoAtk,
    val mat: ChocoMat,
    val def: ChocoDef,
    val mdf: ChocoMdf,
    val mov: ChocoMov,
)
