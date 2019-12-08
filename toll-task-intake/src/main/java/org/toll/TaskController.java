package org.toll;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskProcessor taskProcessor;

    @ResponseBody
    @PostMapping("/tasks")
    public String launchTask(@RequestBody String s) {
        taskProcessor.publishRequest(s);
        log.info("Request made.");
        return "success";
    }
}
