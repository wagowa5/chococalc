package com.choco.calculator.apiInterface.model

import com.fasterxml.jackson.annotation.JsonProperty

data class InputItem(
    @JsonProperty("allVita")
    val allVita: Boolean,

    @JsonProperty("powVita")
    val powVita: Boolean,

    @JsonProperty("intVita")
    val intVita: Boolean,

    @JsonProperty("spdVita")
    val spdVita: Boolean,

    @JsonProperty("vitVita")
    val vitVita: Boolean,

    @JsonProperty("lukVita")
    val lukVita: Boolean,

    @JsonProperty("can")
    val can: CanType,

    @JsonProperty("scroll")
    val scroll: Scroll,
)

enum class CanType(canType: String) {
    NONE("NONE"),

    BEAST_CAN_A("BEAST_CAN_A"),

    BEAST_CAN_B("BEAST_CAN_B"),

    POW_SEAL("POW_SEAL"),

    INT_SEAL("INT_SEAL"),

    SPD_SEAL("SPD_SEAL"),

    VIT_SEAL("VIT_SEAL"),

    LUK_SEAL("LUK_SEAL");
}

data class Scroll(
    @JsonProperty("scrollType")
    val scrollType: ScrollType,

    @JsonProperty("scrollRank")
    val scrollRank: Int,
)

enum class ScrollType(scrollType: String) {
    NONE("NONE"),

    HP("HP"),

    SP("SP"),

    POW("POW"),

    INT("INT"),

    SPD("SPD"),

    VIT("VIT"),

    LUK("LUK"),

    ATK("ATK"),

    MAT("MAT"),

    DEF("DEF"),

    MDF("MDF"),

    MOV("MOV");
}
