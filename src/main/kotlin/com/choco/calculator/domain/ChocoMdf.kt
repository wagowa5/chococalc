package com.choco.calculator.domain

/**
 * MDFクラス
 * @param flat バフなしMDF
 * @param totalVit VIT合計値
 * @param totalInt INT合計値
 * @param scroll 巻物のMDF上昇値
 * @param eru 大天使の加護のMDF上昇値
 * @param liquid リキッドのMDF上昇値
 */
data class ChocoMdf(
    val flat: Int,
    val totalVit: Int,
    val totalInt: Int,
    val scroll: Int,
    val eru: Int,
    val liquid: Int,
) {
    fun getDisp(): Int {
        return flat + eru
    }
}
