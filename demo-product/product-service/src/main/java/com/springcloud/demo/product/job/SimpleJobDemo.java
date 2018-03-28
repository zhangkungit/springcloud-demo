package com.springcloud.demo.product.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.springcloud.framework.core.elasticjob.Simple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author zhangkun
 * @version 1.0
 * @date 2018/3/28
 * @description
 */
@Component
@Simple(cron = "/2 * * * * ? *", description = "test")
public class SimpleJobDemo implements SimpleJob {
    private static final Logger logger = LoggerFactory.getLogger(SimpleJobDemo.class);

    @Override
    public void execute(ShardingContext shardingContext) {
        logger.info("SimpleJobDemo.....");
    }
}
