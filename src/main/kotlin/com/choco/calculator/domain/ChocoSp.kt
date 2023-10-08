package com.choco.calculator.domain

/**
 * SPクラス
 * @param flatSp バフなしSP
 * @param syncSp シンクロソウルのSP上昇値
 * @param eruSp 大天使の加護のSP上昇値
 */
data class ChocoSp(
    val flatSp: Int,
    val syncSp: Int,
    val eruSp: Int,
) {
    fun getDispSp(): Int {
        return flatSp + syncSp + eruSp
    }
}
