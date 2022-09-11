package com.taoyee.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZkMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(ZkMain8003.class,args);
        System.out.println("zookeeper client 生产者 payment 8003 is started ===>>>");
    }
}
/*
  eureka:
    instance:
      instance-id: cloud-rest-zk-payment-service8003 #显示实例ID
       prefer-ip-address: true  #显示IP
    client:
      fetch-registry: true
      register-with-eureka: true
      service-url:
        defaultZone: http://eureka7000.com:7000/eureka/  #单机
        #defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/  #集群
*/
