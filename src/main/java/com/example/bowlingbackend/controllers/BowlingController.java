package com.example.bowlingbackend.controllers;

import com.example.bowlingbackend.facade.BowlingFacade;
import com.example.bowlingbackend.models.Player;
import com.example.bowlingbackend.requests.BowlingRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bowling")
public class BowlingController {
    private final BowlingFacade bowlingFacade;

    @GetMapping("/calculate")
    public List<Player> calculate(@RequestBody BowlingRequest request) {
        return bowlingFacade.calculate(request);
    }
}
