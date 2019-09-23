package com.dark.service.impl;

import com.dark.domain.Commodity;
import com.dark.mapper.CommodityMapper;
import com.dark.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> findAll() {
        List<Commodity> list = commodityMapper.findAll();
        return list;
    }

    @Override
    public Commodity findById(Integer id) {
        Commodity commodity = commodityMapper.findById(id);
        return commodity;
    }

    @Override
    public void update(Commodity commodity) {
        commodityMapper.update(commodity);
    }
}
