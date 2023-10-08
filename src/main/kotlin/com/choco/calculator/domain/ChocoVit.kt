package com.choco.calculator.domain

/**
 * VITクラス
 * @param character キャラクターステ振りステータス
 * @param flat バフなしVIT
 * @param sync シンクロソウルのVIT上昇値
 * @param allBita ALLビタのVIT上昇値
 * @param vitBita VITビタのVIT上昇値
 * @param can 魔獣缶・シールのVIT上昇・減少値
 * @param eru 大天使の加護のVIT上昇値
 * @param bene 祝福の蒼盾のVIT上昇値
 */
data class ChocoVit(
    val character: Int,
    val flat: Int,
    val sync: Int,
    val allBita: Int,
    val vitBita: Int,
    val can: Int,
    val eru: Int,
    val bene: Int,
) {
    fun getDisp(): Int {
        return flat + sync + eru
    }
}
