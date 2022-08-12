package com.example.bowlingbackend.customTests;

import com.example.bowlingbackend.models.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTesting {

    @Autowired
    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    public void canScoreZeros() {
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertEquals(0, game.score());
    }

    @Test
    public void canScoreOnes() {
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertEquals(20, game.score());
    }

    @Test
    public void canScoreSpares() {
        game.roll(5,5, 3,7, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertEquals(40, game.score());
    }
    @Test
    public void canScoreStrikes() {
        game.roll(10,3, 7,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertEquals(47, game.score());
    }
    @Test
    public void canScorePerfectGame() {
        game.roll(10,10, 10,10, 10,10, 10,10, 10,10, 10,10, 10,10, 10,10, 10,10, 10,10);
        assertEquals(300, game.score());
    }

    @Test
    public void canScoreSpareAndStrike() {
        game.roll(5,5, 10,3, 7,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertEquals(65, game.score());
    }

    @Test
    public void canScoreStrikeAndSpare() {
        game.roll(10,3, 5,5, 7,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertEquals(52, game.score());
    }

}
