package com.choco.calculator.domain

/**
 * MATクラス
 * @param flat バフなしMAT
 * @param totalInt INT合計値
 * @param scroll 巻物のMAT上昇値
 * @param eru 大天使の加護のMAT上昇値
 * @param mana 妖精王の祝福(魔法)のMAT上昇値
 * @param liquid リキッドのMAT上昇値
 */
data class ChocoMat(
    val flat: Int,
    val totalInt: Int,
    val scroll: Int,
    val eru: Int,
    val mana: Int,
    val liquid: Int,
) {
    fun getDisp(): Int {
        return flat + eru
    }
}
