package com.xxx.service;

import com.xxx.mapper.CommodityMapper;
import com.xxx.pojo.Commodity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService{
    @Resource
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> SelectCommodity() {
        return commodityMapper.SelectCommodity();
    }

    @Override
    public int addCommodity(Commodity commodity) {
        return commodityMapper.addCommodity(commodity);
    }

    @Override
    public int updateCommodity(Commodity commodity) {
        return commodityMapper.updateCommodity(commodity);
    }

    @Override
    public Commodity SelectCommodityId(int id) {
        return commodityMapper.SelectCommodityId(id);
    }

    @Override
    public int deleteCommodityId(int id) {
        return commodityMapper.deleteCommodityId(id);
    }

    @Override
    public List<Commodity> shelvesY() {
        return commodityMapper.shelvesY();
    }

    @Override
    public List<Commodity> shelvesN() {
        return commodityMapper.shelvesN();
    }
}
