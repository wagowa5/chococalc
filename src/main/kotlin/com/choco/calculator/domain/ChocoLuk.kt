package com.choco.calculator.domain

/**
 * LUKクラス
 * @param character キャラクターステ振りのLUK
 * @param flat バフなしLUK
 * @param sync シンクロソウルのLUK上昇値
 * @param allBita ALLビタのLUK上昇値
 * @param lukBita LUKビタのLUK上昇値
 * @param can 魔獣缶・シールのLUK上昇・減少値
 * @param eru 大天使の加護のLUK上昇値
 * @param fis 邪神の呪詛のLUK上昇値
 */
data class ChocoLuk(
    val character: Int,
    val flat: Int,
    val sync: Int,
    val allBita: Int,
    val lukBita: Int,
    val can: Int,
    val eru: Int,
    val fis: Int,
) {
    fun getDisp(): Int {
        return flat + sync + eru
    }
}
