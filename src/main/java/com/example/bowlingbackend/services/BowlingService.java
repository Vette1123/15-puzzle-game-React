package com.example.bowlingbackend.services;

import com.example.bowlingbackend.models.Game;
import com.example.bowlingbackend.models.Player;
import com.example.bowlingbackend.requests.BowlingRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BowlingService {


    private Game game;
    public List<Player> calculate(BowlingRequest request) {
            List<Player> result = new ArrayList<>();
            List<String> names = new ArrayList<String>(request.game().keySet());

            for (int i = 0; i < names.size(); i++) {
                boolean isPerfectGame;
                game = new Game();
                game.roll(fromByteArray(request.game().get(names.get(i))));
                int score = game.score();
                if (score == 300) {
                    isPerfectGame = true;
                } else {
                    isPerfectGame = false;
                }
               Player player = new Player(names.get(i), score, isPerfectGame);
                result= sortPlayers(result, player);
            }
            return result;
        }

        public int [] fromByteArray(byte[] bytes) {
            int[] ints = new int[bytes.length];
            for (int i = 0; i < bytes.length; i++) {
                ints[i] = bytes[i];
            }
            return ints;
        }

        public List<Player> sortPlayers(List<Player> players , Player player) {
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getTotalScore() < player.getTotalScore()) {
                    players.add(i, player);
                    return players;
                }
            }
            players.add(player);
            return players;
        }

}
