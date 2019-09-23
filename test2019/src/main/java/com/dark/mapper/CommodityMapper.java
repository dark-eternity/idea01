package com.dark.mapper;

import com.dark.domain.Commodity;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CommodityMapper {
    @Select("select * from commodity")
    List<Commodity> findAll();

    @Select("select * from commodity where id = #{id}")
    Commodity findById(Integer id);

    @Update("update commodity set name = #{name},price = #{price},birthday = #{birthday},describes = #{describes} where id = #{id}")
    void update(Commodity commodity);
}
