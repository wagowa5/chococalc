package com.choco.calculator.apiInterface.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * ステータス計算リクエスト用のJSONクラス
 * 「a + b」みたいな入力でも計算できるようにString型で受け取る
 */
data class InputStatus(
    @JsonProperty("inputLevel")
    val inputLevel: String,

    @JsonProperty("inputHp")
    val inputHp: String,

    @JsonProperty("inputSp")
    val inputSp: String,

    @JsonProperty("cPow")
    val cPow: String,

    @JsonProperty("cInt")
    val cInt: String,

    @JsonProperty("cSpd")
    val cSpd: String,

    @JsonProperty("cVit")
    val cVit: String,

    @JsonProperty("cLuk")
    val cLuk: String,

    @JsonProperty("inputPow")
    val inputPow: String,

    @JsonProperty("inputInt")
    val inputInt: String,

    @JsonProperty("inputSpd")
    val inputSpd: String,

    @JsonProperty("inputVit")
    val inputVit: String,

    @JsonProperty("inputLuk")
    val inputLuk: String,

    @JsonProperty("inputAtk")
    val inputAtk: String,

    @JsonProperty("inputDef")
    val inputDef: String,

    @JsonProperty("inputMat")
    val inputMat: String,

    @JsonProperty("inputMdf")
    val inputMdf: String,

)
