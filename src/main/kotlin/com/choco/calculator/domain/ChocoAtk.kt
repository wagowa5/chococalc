package com.choco.calculator.domain

/**
 * ATKクラス
 * @param flat バフなしATK
 * @param totalPow POW合計値
 * @param scroll 巻物のATK上昇値
 * @param eru 大天使の加護のATK上昇値
 * @param rena 妖精王の祝福(物理)のATK上昇値
 * @param liquid リキッドのATK上昇値
 */
data class ChocoAtk(
    val flat: Int,
    val totalPow: Int,
    val scroll: Int,
    val eru: Int,
    val rena: Int,
    val liquid: Int,
) {
    fun getDisp(): Int {
        return flat + eru
    }
}
