package com.course.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TopicController {

    private TopicService topicService;

    public TopicController(@Autowired TopicService topicService) {
        this.topicService = topicService;
    }

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
