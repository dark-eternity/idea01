package com.dark.service;

import com.dark.domain.Commodity;

import java.util.List;

public interface CommodityService {
    List<Commodity> findAll();

    Commodity findById(Integer id);

    void update(Commodity commodity);
}
