package com.sourcecs.scsapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/stats")
@AllArgsConstructor
public class StatsController {

    @GetMapping("/leaderboard")
    public ResponseEntity<Object> findLeaderboard() {
        // Return top 10 winners

        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }

}
