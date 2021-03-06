package com.mkeeper.mapper.two;

import com.mkeeper.entity.Stock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TwoStockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}