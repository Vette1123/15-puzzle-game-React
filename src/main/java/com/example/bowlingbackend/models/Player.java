package com.example.bowlingbackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Player {
    private String name;
    private int totalScore;
    private boolean isPerfectGame;
}
