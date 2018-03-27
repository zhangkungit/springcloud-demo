package com.springcloud.demo.product.api;

import com.springcloud.demo.product.entity.Product;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangkun
 * @version 1.0
 * @date 2018/3/5
 * @description
 */

@FeignClient("demo-product")
public interface IProductService {
    //添加swagger



    @ApiOperation("product GET 请求")
    @RequestMapping(value = "/v1/pb/product", method = RequestMethod.GET)
    Product getProduct(@RequestParam("product") String product);


    @ApiOperation("product POST 请求")
    @RequestMapping(value = "/v1/pb/product", method = RequestMethod.POST)
    void newProduct(@RequestBody Product product);



}
