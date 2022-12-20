package com.sourcecs.scsapi.controller;

import com.sourcecs.scsapi.model.request.QuestionRequest;
import com.sourcecs.scsapi.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/question")
@AllArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping
    public ResponseEntity<Object> findQuestions() {

        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findQuestionById(@PathVariable long id) {
        questionService.findQuestionByIdNative(id);
        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Object> createQuestion(QuestionRequest questionRequest) {
        questionService.createQuestionNative(questionRequest);
        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }

    @PutMapping
    public ResponseEntity<Object> updateQuestionById(QuestionRequest questionRequest) {
        questionService.updateQuestionByIdNative(questionRequest);
        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteQuestionById(@PathVariable long id) {
        questionService.deleteQuestionNative(id);
        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }


}
