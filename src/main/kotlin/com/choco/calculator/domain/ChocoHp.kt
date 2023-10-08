package com.choco.calculator.domain

/**
 * HPクラス
 * @param flatHp バフなしHP
 * @param gunguHp グンググーン・シンクロソウルのHP上昇値
 * @param eruHp 大天使の加護のHP上昇値
 */
data class ChocoHp(
    val flatHp: Int,
    val gunguHp: Int,
    val eruHp: Int,
) {
    fun getDispHp(): Int {
        return flatHp + gunguHp + eruHp
    }
}
