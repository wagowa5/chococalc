package com.choco.calculator.controller

import com.choco.calculator.apiInterface.model.DisplayStatus
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/item")
class ItemController {
    /**
     * ALLビタを使用
     */
    @RequestMapping("/allVita")
    fun useAllVita(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
        )
    }

    /**
     * POWビタを使用
     */
    @RequestMapping("/powVita")
    fun usePowVita(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
        )
    }

    /**
     * INTビタを使用
     */
    @RequestMapping("/intVita")
    fun useIntVita(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
        )
    }

    /**
     * SPDビタを使用
     */
    @RequestMapping("/spdVita")
    fun useSpdVita(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
        )
    }

    /**
     * VITビタを使用
     */
    @RequestMapping("/vitVita")
    fun useVitVita(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
        )
    }

    /**
     * LUKビタを使用
     */
    @RequestMapping("/lukVita")
    fun useLukVita(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
        )
    }

    /**
     * 魔獣缶Aを使用
     */
    @RequestMapping("/beastCanA")
    fun useBeastCanA(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0, 0,
        )
    }

    /**
     * 魔獣缶Bを使用
     */
    @RequestMapping("/beastCanB")
    fun useBeastCanB(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0, 0, 0,
        )
    }

    /**
     * POWシールを使用
     */
    @RequestMapping("/powSeal")
    fun usePowSeal(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0, 0, 0, 0, 0, 0, 0, 0,
        )
    }

    /**
     * INTシールを使用
     */
    @RequestMapping("/intSeal")
    fun useIntSeal(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
        )
    }

    /**
     * SPDシールを使用
     */
    @RequestMapping("/spdSeal")
    fun useSpdSeal(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
        )
    }

    /**
     * VITシールを使用
     */
    @RequestMapping("/vitSeal")
    fun useVitSeal(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
        )
    }

    /**
     * LUKシールを使用
     */
    @RequestMapping("/lukSeal")
    fun useLukSeal(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
        )
    }

    /**
     * HP巻物を使用
     */
    @RequestMapping("/hpScroll")
    fun useHpScroll(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
        )
    }

    /**
     * SP巻物を使用
     */
    @RequestMapping("/spScroll")
    fun useSpScroll(): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
        )
    }

    // TODO 巻物

    // TODO リキッド

}
