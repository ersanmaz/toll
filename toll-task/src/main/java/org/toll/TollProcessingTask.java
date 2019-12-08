package org.toll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Slf4j
@Component
public class TollProcessingTask implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        // parameters stationId, license plate, timestamp
        Optional.ofNullable(args)
                .ifPresent(strings -> Arrays.stream(strings).forEach(param -> log.info("Parameter is {}", param)));
    }
}
