package com.xxx.mapper;

import com.xxx.pojo.Commodity;
import com.xxx.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityMapper {
    /**
     * 查询所有商品
     * @return
     */
    List<Commodity> SelectCommodity();

    /**
     * 添加
     * @param commodity
     * @return
     */
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
    /**
     * 根据id删除商品
     * @param id
     * @return
     */
    int deleteCommodityId(int id);
    /**
     * 筛选上架
     * @return
     */
    List<Commodity> shelvesY();
    /**
     * 筛选未上架
     * @return
     */
    List<Commodity> shelvesN();
}
