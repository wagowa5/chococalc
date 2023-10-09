package com.choco.calculator.apiInterface.model

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

    @JsonProperty("eruHp")
    val eruHp: Int,

    @JsonProperty("eruSp")
    val eruSp: Int,

    @JsonProperty("eruAtk")
    val eruAtk: Int,

    @JsonProperty("eruDef")
    val eruDef: Int,

    @JsonProperty("eruMat")
    val eruMat: Int,

    @JsonProperty("eruMdf")
    val eruMdf: Int,

    @JsonProperty("eruPow")
    val eruPow: Int,

    @JsonProperty("eruInt")
    val eruInt: Int,

    @JsonProperty("eruSpd")
    val eruSpd: Int,

    @JsonProperty("eruVit")
    val eruVit: Int,

    @JsonProperty("eruLuk")
    val eruLuk: Int,

    @JsonProperty("fairyPow")
    val fairyPow: Int,

    @JsonProperty("fairyAtk")
    val fairyAtk: Int,

    @JsonProperty("fairyInt")
    val fairyInt: Int,

    @JsonProperty("fairyMat")
    val fairyMat: Int,

    @JsonProperty("beneVit")
    val beneVit: Int,

    @JsonProperty("fisLuk")
    val fisLuk: Int,

    @JsonProperty("siraMov")
    val siraMov: Int,

    @JsonProperty("liquidAtk")
    val liquidAtk: Int,

    @JsonProperty("liquidDef")
    val liquidDef: Int,

    @JsonProperty("liquidMat")
    val liquidMat: Int,

    @JsonProperty("liquidMdf")
    val liquidMdf: Int,

)
