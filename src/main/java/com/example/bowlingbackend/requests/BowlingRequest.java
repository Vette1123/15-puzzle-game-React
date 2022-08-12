package com.example.bowlingbackend.requests;

import java.util.Map;

public record BowlingRequest (Map<String, byte[]> game) {
}
