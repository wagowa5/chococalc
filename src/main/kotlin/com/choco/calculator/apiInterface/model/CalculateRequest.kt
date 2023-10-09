package com.choco.calculator.apiInterface.model

import com.fasterxml.jackson.annotation.JsonProperty

data class CalculateRequest(
    @JsonProperty("inputStatus")
    val inputStatus: InputStatus,

    @JsonProperty("inputItem")
    val inputItem: InputItem,

    @JsonProperty("inputSkill")
    val inputSkill: InputSkill,

    @JsonProperty("liquid")
    val liquid: Liquid,
)

enum class Liquid(liquidType: String) {
    ATK("ATK"),

    MAT("MAT"),

    DEF("DEF"),

    MDF("MDF");
}
