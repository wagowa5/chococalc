package com.choco.calculator.`interface`.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * ステータス計算リクエスト用のJSONクラス
 */
data class InputStatus(
    // TODO ここにJSONのパラメータを追加していく

    @JsonProperty("cPow")
    val cPow: Int,

)
