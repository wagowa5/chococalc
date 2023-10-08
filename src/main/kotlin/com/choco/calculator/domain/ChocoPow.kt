package com.choco.calculator.domain

/**
 * POWクラス
 * @param charcter キャラクターステ振りのPOW
 * @param flat バフなしPOW
 * @param sync シンクロソウルのPOW上昇値
 * @param allBita ALLビタのPOW上昇値
 * @param powBita POWビタのPOW上昇値
 * @param can 魔獣缶・シールのPOW上昇・減少値
 * @param scraper ブラッドスクレイパーのPOW上昇値
 * @param eru 大天使の加護のPOW上昇値
 * @param rena 妖精王の祝福(物理)のPOW上昇値
 */
data class ChocoPow(
    val charcter: Int,
    val flat: Int,
    val sync: Int,
    val allBita: Int,
    val powBita: Int,
    val can: Int,
    val scraper: Int,
    val eru: Int,
    val rena: Int,
) {
    fun getDisp(): Int {
        return flat + sync + eru
    }
}
