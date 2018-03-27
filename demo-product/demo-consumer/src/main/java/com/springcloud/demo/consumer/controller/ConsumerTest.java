package com.springcloud.demo.consumer.controller;

import com.springcloud.demo.product.api.IProductService;
import com.springcloud.demo.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangkun
 * @version 1.0
 * @date 2018/3/5
 * @description
 */
@RestController
@RequestMapping("/test")
public class ConsumerTest {

    @Autowired
    private IProductService productService;

    @GetMapping(value = "/p1")
    public Product test(@RequestParam("name") String name) {
        Product product = productService.getProduct(name);
        return product;
    }

}
