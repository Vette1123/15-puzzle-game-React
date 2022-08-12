package com.example.bowlingbackend.facade;

import com.example.bowlingbackend.models.Player;
import com.example.bowlingbackend.requests.BowlingRequest;
import com.example.bowlingbackend.services.BowlingService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BowlingFacade {

    private final BowlingService bowlingService;
    public List<Player> calculate(BowlingRequest request) {
        return bowlingService.calculate(request);
    }
}
