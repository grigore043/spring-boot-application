package com.test.spring.boot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Spring Framework", "Spring FrameworkDescription"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("Javascript", "Javascript", "Description Javascript")
        );
    }
}
