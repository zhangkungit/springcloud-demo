package com.springcloud.demo.product.entity;

import java.io.Serializable;

/**
 * @author zhangkun
 * @version 1.0
 * @date 2018/3/5
 * @description
 */
public class Product implements Serializable {
    private String name;

    public Product() {
    }

    private Product(Builder builder) {
        setName(builder.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static final class Builder {
        private String name;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
