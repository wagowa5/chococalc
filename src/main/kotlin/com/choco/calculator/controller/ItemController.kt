package com.choco.calculator.controller

import com.choco.calculator.apiInterface.model.CalculateRequest
import com.choco.calculator.apiInterface.model.DisplayStatus
import com.choco.calculator.apiInterface.model.InputStatus
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/item")
class ItemController {

    /**
     * 計算API
     */
    @RequestMapping(
        value = ["/calculate"],
        produces = ["application/json"],
        method = [RequestMethod.POST]
    )
    @ResponseStatus(org.springframework.http.HttpStatus.OK)
    fun calculate(
        @RequestBody calculateRequest: CalculateRequest
    ): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
        )
    }

    // TODO リキッド
    @RequestMapping(
        value = ["/atkLiquid"],
        produces = ["application/json"],
        method = [RequestMethod.POST]
    )
    @ResponseStatus(org.springframework.http.HttpStatus.OK)
    fun calculate(
        @RequestBody calculateRequest: CalculateRequest
    ): DisplayStatus {
        // TODO
        return DisplayStatus(
            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
        )
    }

//    /**
//     * ALLビタを使用
//     */
//    @RequestMapping(
//        value = ["/allVita"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useAllVita(
//        @RequestBody inputStatus: InputStatus
//    ): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
//        )
//    }
//
//    /**
//     * POWビタを使用
//     */
//    @RequestMapping(
//        value = ["/powVita"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun usePowVita(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
//        )
//    }
//
//    /**
//     * INTビタを使用
//     */
//    @RequestMapping(
//        value = ["/intVita"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useIntVita(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
//        )
//    }
//
//    /**
//     * SPDビタを使用
//     */
//    @RequestMapping(
//        value = ["/spdVita"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useSpdVita(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
//        )
//    }
//
//    /**
//     * VITビタを使用
//     */
//    @RequestMapping(
//        value = ["/vitVita"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useVitVita(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
//        )
//    }
//
//    /**
//     * LUKビタを使用
//     */
//    @RequestMapping(
//        value = ["/lukVita"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useLukVita(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0,
//        )
//    }
//
//    /**
//     * 魔獣缶Aを使用
//     */
//    @RequestMapping(
//        value = ["/beastCanA"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useBeastCanA(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0, 0,
//        )
//    }
//
//    /**
//     * 魔獣缶Bを使用
//     */
//    @RequestMapping(
//        value = ["/beastCanB"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useBeastCanB(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0, 0, 0,
//        )
//    }
//
//    /**
//     * POWシールを使用
//     */
//    @RequestMapping(
//        value = ["/powSeal"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun usePowSeal(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0,0,0, 0, 0, 0, 0, 0, 0, 0,
//        )
//    }
//
//    /**
//     * INTシールを使用
//     */
//    @RequestMapping(
//        value = ["/intSeal"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useIntSeal(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * SPDシールを使用
//     */
//    @RequestMapping(
//        value = ["/spdSeal"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useSpdSeal(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * VITシールを使用
//     */
//    @RequestMapping(
//        value = ["/vitSeal"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useVitSeal(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * LUKシールを使用
//     */
//    @RequestMapping(
//        value = ["/lukSeal"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useLukSeal(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * HP巻物を使用
//     */
//    @RequestMapping(
//        value = ["/hpScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useHpScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * SP巻物を使用
//     */
//    @RequestMapping(
//        value = ["/spScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useSpScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * POW巻物を使用
//     */
//    @RequestMapping(
//        value = ["/powScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun usePowScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * INT巻物を使用
//     */
//    @RequestMapping(
//        value = ["/intScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useIntScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * SPD巻物を使用
//     */
//    @RequestMapping(
//        value = ["/spdScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useSpdScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * VIT巻物を使用
//     */
//    @RequestMapping(
//        value = ["/vitScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useVitScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * LUK巻物を使用
//     */
//    @RequestMapping(
//        value = ["/lukScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useLukScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0, 0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * ATK巻物を使用
//     */
//    @RequestMapping(
//        value = ["/atkScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useAtkScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0, 0, 0, 0,0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * MAT巻物を使用
//     */
//    @RequestMapping(
//        value = ["/matScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useMatScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0, 0, 0,0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * DEF巻物を使用
//     */
//    @RequestMapping(
//        value = ["/defScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useDefScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0, 0, 0,0,0,0,0,0,0,0,
//        )
//    }
//
//    /**
//     * MDF巻物を使用
//     */
//    @RequestMapping(
//        value = ["/mdfScroll"],
//        produces = ["application/json"],
//        method = [RequestMethod.POST]
//    )
//    @ResponseStatus(org.springframework.http.HttpStatus.OK)
//    fun useMdfScroll(): DisplayStatus {
//        // TODO
//        return DisplayStatus(
//            0,0,0,0,0,0,0,0, 0, 0,0,0,0,0,0,0,0,
//        )
//    }

}
