package org.toll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TollConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TollConfigServerApplication.class, args);
    }

}
