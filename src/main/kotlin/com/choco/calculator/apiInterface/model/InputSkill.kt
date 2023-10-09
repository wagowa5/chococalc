package com.choco.calculator.apiInterface.model

import com.fasterxml.jackson.annotation.JsonProperty

data class InputSkill(
    @JsonProperty("bloodScraper")
    val bloodScraper: Boolean,

    @JsonProperty("specialSkill")
    val specialSkill: SpecialSkill,
)

enum class SpecialSkill(specialSkill: String) {
    NONE("NONE"),

    ERU("ERU"),

    FAIRY_POW("FAIRY_POW"),

    FAIRY_INT("FAIRY_INT"),

    BENE("BENE"),

    FIS("FIS"),

    SIRA("SIRA");
}
