package com.test.spring.boot.topic;

import com.test.spring.boot.TopicRepository;
import com.test.spring.boot.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        return topicRepository.findById(topicId).get();
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
