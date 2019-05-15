package com.course.controller.rest.topic;

import com.course.topic.TopicService;
import com.course.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getTopics();
    }

    @GetMapping("/topics/{topicId}")
    public Topic getTopic(@PathVariable String topicId) {
        return topicService.getTopic(topicId);
    }

    @PostMapping(value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping(value = "/topics/{topicId}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String topicId) {
        topicService.updateTopic(topic, topicId);
    }

    @DeleteMapping(value = "/topics/{topicId}")
    public void deleteTopic(@PathVariable Topic topicId) {
        topicService.deleteTopic(topicId);
    }
}
