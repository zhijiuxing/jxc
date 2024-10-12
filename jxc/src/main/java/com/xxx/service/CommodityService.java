package com.xxx.service;

import com.xxx.pojo.Commodity;

import java.util.List;

public interface CommodityService {
    List<Commodity> SelectCommodity();

    int addCommodity(Commodity commodity);
    /**
     * 修改
     * @param commodity
     * @return
     */
    int updateCommodity(Commodity commodity);

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    Commodity SelectCommodityId(int id);

    int deleteCommodityId(int id);

    List<Commodity> shelvesY();

    List<Commodity> shelvesN();
}
