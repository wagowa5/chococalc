package com.choco.calculator.domain

/**
 * SPDクラス
 * @param character キャラクターステ振りのSPD
 * @param flat バフなしSPD
 * @param sync シンクロソウルのSPD上昇値
 * @param allBita ALLビタのSPD上昇値
 * @param spdBita SPDビタのSPD上昇値
 * @param can 魔獣缶・シールのSPD上昇・減少値
 * @param eru 大天使の加護のSPD上昇値
 */
data class ChocoSpd(
    val character: Int,
    val flat: Int,
    val sync: Int,
    val allBita: Int,
    val spdBita: Int,
    val can: Int,
    val eru: Int,
) {
    fun getDisp(): Int {
        return flat + sync + eru
    }
}
