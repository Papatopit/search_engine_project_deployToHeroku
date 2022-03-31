package org.example.controllers;


import lombok.RequiredArgsConstructor;
import org.example.services.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @GetMapping("/statistics")
    public ResponseEntity<Object> getStatistics() {

        return ResponseEntity.ok(statisticsService.getStatistics());
    }
}
