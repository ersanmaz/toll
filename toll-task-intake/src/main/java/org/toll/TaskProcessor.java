package org.toll;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
@EnableBinding(Source.class)
@RequiredArgsConstructor
public class TaskProcessor {

    private final Source source;

    public void publishRequest(String payload) {
        String url = "maven://org.toll:toll-task:jar:0.0.1-SNAPSHOT";
        List<String> input = Arrays.asList(payload.split(","));

        TaskLaunchRequest request = new TaskLaunchRequest(url, input, null, null, null);
        log.info("Created task request.");

        GenericMessage<TaskLaunchRequest> message = new GenericMessage<>(request);
        boolean isSent = source.output().send(message);
        log.info("Message published? {}", isSent);
    }
}
