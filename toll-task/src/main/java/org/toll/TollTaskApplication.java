package org.toll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
public class TollTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TollTaskApplication.class, args);
    }
}
