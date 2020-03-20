package com.transaction.txlcnmanager;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagerServer
public class TxLcnManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxLcnManagerApplication.class, args);
    }

}
