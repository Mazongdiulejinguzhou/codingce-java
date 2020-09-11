package cn.com.codingce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xzMa
 *
 * Ribbin和Eureka整合以后, 客户可以直接调用, 不用关心ip地址 和端口号
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer.class, args);
    }
}
