package com.choco.calculator.apiInterface.model

import com.fasterxml.jackson.annotation.JsonProperty

data class CalculateResponse(
    @JsonProperty("displayStatus")
    val displayStatus: DisplayStatus,
)
