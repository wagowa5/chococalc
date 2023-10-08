package com.choco.calculator.domain

/**
 * MOVクラス
 * @param flat バフなしMOV
 * @param scroll 巻物のMOV上昇値
 * @param sira 大妖怪の通力のMOV上昇値
 * @param tonzura トンズーラのMOV上昇値
 * @param liquid リキッドのMOV上昇値
 */
data class ChocoMov(
    val flat: Int,
    val scroll: Int,
    val sira: Int,
    val tonzura: Int,
    val liquid: Int,
) {
    fun getDisp(): Int {
        return flat
    }
}
