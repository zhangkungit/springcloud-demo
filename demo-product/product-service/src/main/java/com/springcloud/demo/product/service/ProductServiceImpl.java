package com.springcloud.demo.product.service;

import com.alibaba.fastjson.JSON;
import com.springcloud.demo.product.api.IProductService;
import com.springcloud.demo.product.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangkun
 * @version 1.0
 * @date 2018/3/5
 * @description
 */
@RestController
public class ProductServiceImpl implements IProductService {

    @Autowired
    private DiscoveryClient client;

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);


    @Override
    public Product getProduct(String product) {
        Product.Builder builder = new Product.Builder();
        builder.name("hello world, " + product);
        List<String> services = client.getServices();
        logger.info("getProduct result: {}", JSON.toJSONString(product));
        logger.info("service_id: {}", services);
        return builder.build();
    }

    @Override
    public void newProduct(Product product) {
        logger.info("newProduct: {}", product);
    }
}
