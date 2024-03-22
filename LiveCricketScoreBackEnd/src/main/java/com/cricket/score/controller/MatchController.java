package com.cricket.score.controller;

import com.cricket.score.entity.Match;
import com.cricket.score.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cricket")
@CrossOrigin("*")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
        return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
    }

    @GetMapping("/point-table/{year}")
    public ResponseEntity<?> getCWCPointTable(@PathVariable int year) {
        return new ResponseEntity<>(this.matchService.getCWCPointTable(year), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }
}
