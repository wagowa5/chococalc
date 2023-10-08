package com.choco.calculator.`interface`.model

import com.fasterxml.jackson.annotation.JsonClassDescription
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 表示ステータス返却用のJSONクラス
 */
data class DisplayStatus(
    @JsonProperty("totalHp")
    val totalHp: Int,

    @JsonProperty("totalSp")
    val totalSp: Int,

    @JsonProperty("totalAtk")
    val totalAtk: Int,

    @JsonProperty("totalDef")
    val totalDef: Int,

    @JsonProperty("totalMat")
    val totalMat: Int,

    @JsonProperty("totalMdf")
    val totalMdf: Int,

    @JsonProperty("totalPow")
    val totalPow: Int,

    @JsonProperty("totalInt")
    val totalInt: Int,

    @JsonProperty("totalSpd")
    val totalSpd: Int,

    @JsonProperty("totalVit")
    val totalVit: Int,

    @JsonProperty("totalLuk")
    val totalLuk: Int,

    @JsonProperty("upHp")
    val upHp: Int,

    @JsonProperty("upSp")
    val upSp: Int,

    @JsonProperty("upAtk")
    val upAtk: Int,

    @JsonProperty("upDef")
    val upDef: Int,

    @JsonProperty("upMat")
    val upMat: Int,

    @JsonProperty("upMdf")
    val upMdf: Int,
)
