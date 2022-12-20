package com.sourcecs.scsapi.controller;

import com.sourcecs.scsapi.model.request.TopicRequest;
import com.sourcecs.scsapi.service.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/topic")
@AllArgsConstructor
public class TopicController {

    private final TopicService topicService;
    @GetMapping("/{id}")
    public ResponseEntity<Object> findTopicById(@PathVariable long id) {
        return new ResponseEntity<>(topicService.findTopicByIdNative(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createTopic(@RequestBody TopicRequest topicRequest) {
        topicService.createTopicNative(topicRequest);
        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTopicById(@PathVariable long id) {
        topicService.deleteTopicByIdNative(id);
        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }

}
