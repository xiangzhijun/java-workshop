package org.zhijun.online.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ZhiJun
 * @Date 2023/2/5 19:58
 * @Version 1.0
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "org.zhijun.online.*")
public class WorkShopApplicationService {
    public static void main(String[] args) {
        SpringApplication.run(WorkShopApplicationService.class, args);
        log.info("WorkShopApplicationService Started ...");
    }
}
