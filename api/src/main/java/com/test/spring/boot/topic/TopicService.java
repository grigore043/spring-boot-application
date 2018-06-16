package com.test.spring.boot.topic;

import com.test.spring.boot.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Core Java", "Core Java Description"),
            new Topic("Javascript", "Javascript", "Description Javascript")));

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

    public void updateTopic(Topic updateTopic, String topicId) {
        for (Topic topic : topics) {
            if (topic.getId().endsWith(topicId)) {
                topic.setName(updateTopic.getName());
                topic.setDescription(updateTopic.getDescription());
                break;
            }
        }
    }

    public void deleteTopic(String topicId) {
        topics.removeIf(topic -> topic.getId().equals(topicId));
    }
}
