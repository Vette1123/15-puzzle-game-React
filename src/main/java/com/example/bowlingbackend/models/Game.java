package com.example.bowlingbackend.models;

import org.springframework.stereotype.Service;

@Service
public class Game {
    private int roll = 0;
    private int[] rolls = new int[21];
    private void roll(int pins) {
        rolls[roll++] = pins;
    }
    public void roll(int...rolls) {
        for (int pins : rolls) {
            roll(pins);
        }
    }
    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                score += sumOfBallsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }
    private int sumOfBallsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }
    private int spareBonus(int frameIndex) {
        return rolls[frameIndex + 2];
    }
    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }
    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }
    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

}
