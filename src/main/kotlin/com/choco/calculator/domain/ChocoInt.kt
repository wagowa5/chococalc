package com.choco.calculator.domain

/**
 * INTクラス
 * @param charcter キャラクターステ振りのINT
 * @param flat バフなしINT
 * @param sync シンクロソウルのINT上昇値
 * @param allBita ALLビタのINT上昇値
 * @param intBita INTビタのINT上昇値
 * @param can 魔獣缶・シールのINT上昇・減少値
 * @param eru 大天使の加護のINT上昇値
 * @param mana 妖精王の祝福(魔法)のINT上昇値
 */
data class ChocoInt(
    val charcter: Int,
    val flat: Int,
    val sync: Int,
    val allBita: Int,
    val intBita: Int,
    val can: Int,
    val eru: Int,
    val mana: Int,
) {
    fun getDisp(): Int {
        return flat + sync + eru
    }
}
