package com.example.springbootrabbitmq.mapper;

import com.example.springbootrabbitmq.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 @Description
 *@author kang.li
 *@date 2020/7/2 11:00   
 */
public interface EsProductMapper {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
