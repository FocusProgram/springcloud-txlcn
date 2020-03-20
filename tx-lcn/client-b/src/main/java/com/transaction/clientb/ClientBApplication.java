package com.transaction.clientb;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDistributedTransaction
@EnableDiscoveryClient
public class ClientBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientBApplication.class, args);
    }

}
