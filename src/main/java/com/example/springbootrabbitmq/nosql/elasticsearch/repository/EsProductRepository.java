package com.example.springbootrabbitmq.nosql.elasticsearch.repository;

import com.example.springbootrabbitmq.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/*
 @Description
 *@author kang.li
 *@date 2020/7/2 10:50   
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {
        /**
         * 搜索查询
         *
         * @param name              商品名称
         * @param subTitle          商品标题
         * @param keywords          商品关键字
         * @param page              分页信息
         * @return
         */
        Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
}
