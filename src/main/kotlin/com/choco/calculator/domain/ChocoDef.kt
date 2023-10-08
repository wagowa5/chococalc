package com.choco.calculator.domain

/**
 * DEFクラス
 * @param flat バフなしDEF
 * @param totalVit VIT合計値
 * @param scroll 巻物のDEF上昇値
 * @param eru 大天使の加護のDEF上昇値
 * @param liquid リキッドのDEF上昇値
 */
data class ChocoDef(
    val flat: Int,
    val totalVit: Int,
    val scroll: Int,
    val eru: Int,
    val liquid: Int,
) {
    fun getDisp(): Int {
        return flat + eru
    }
}
