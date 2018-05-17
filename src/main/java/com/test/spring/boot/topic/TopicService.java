package com.test.spring.boot.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring FrameworkDescription"),
            new Topic("Java", "Core Java", "Core Java Description"),
            new Topic("Javascript", "Javascript", "Description Javascript"));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String topicId) {
        Optional<Topic> topicOptionalObject = topics.stream().filter(t -> t.getId().endsWith(topicId)).findFirst();
        return topicOptionalObject.orElse(new Topic());
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

}
