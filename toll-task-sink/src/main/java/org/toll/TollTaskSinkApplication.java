package org.toll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@EnableTaskLauncher
@SpringBootApplication
public class TollTaskSinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(TollTaskSinkApplication.class, args);
    }

}
