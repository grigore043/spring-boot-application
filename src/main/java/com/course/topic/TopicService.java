package com.course.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String topicId) {
        Optional<Topic> topic = topicRepository.findById(topicId);
        return topic.orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic updateTopic, String topicId) {
        topicRepository.save(updateTopic);
    }

    public void deleteTopic(Topic topicId) {
        topicRepository.delete(topicId);
    }
}
