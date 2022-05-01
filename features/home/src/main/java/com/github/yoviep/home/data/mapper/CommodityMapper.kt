package com.github.yoviep.home.data.mapper

import com.github.yoviep.database.entity.CommodityEntity
import com.github.yoviep.home.domain.models.Commodity


/**
 * @created 01-05-2022 17:39
 * @author yoviekaputra
 * @project eFishery
 **/

fun CommodityEntity.asDomain() = Commodity(
    uuid, areaCity, areaProvince, commodity, price, size, tglParsed, timestamp
)

fun List<CommodityEntity>.asDomain() = map {
    it.asDomain()
}