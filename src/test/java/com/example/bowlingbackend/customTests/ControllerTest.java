package com.example.bowlingbackend.customTests;

import com.example.bowlingbackend.controllers.BowlingController;
import com.example.bowlingbackend.facade.BowlingFacade;
import com.example.bowlingbackend.models.Player;
import com.example.bowlingbackend.requests.BowlingRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {

    @InjectMocks
    private BowlingController bowlingController;

    @Mock
    private BowlingFacade bowlingFacade;

    private List<Player> players;
    private Map<String, byte[]> scoresMap;

    @BeforeEach
    void setUp() {
      players = new ArrayList<>();
        players.add(new Player("John",23,false));
        players.add(new Player("Jane",24,false));
        players.add(new Player("Jack",25,false));
        players.add(new Player("Jill",26,true));
        scoresMap = new HashMap<>();
        scoresMap.put("John", new byte[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    }

    @Test
    void testControllerBehaviour() {
//    given
        when(bowlingFacade.calculate(new BowlingRequest(scoresMap))).thenReturn(players);
//    when
        List<Player> result = bowlingController.calculate(new BowlingRequest(scoresMap));
//    then
        assertEquals(players, result);

    }
}
