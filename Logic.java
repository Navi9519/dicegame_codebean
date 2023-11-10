import java.util.ArrayList;
import java.util.Collections;

public class Logic {
    // Klassvariabler
    private Player[] players;

    // Konstruktor
    Logic(Player[] players) {
        this.players = players;
    }

    // Gå igenom alla spelarna och kasta deras tärningsbägare
    public void doRound() {
        for (Player player : players) {
            player.rollDice();
            System.out.println(player.getPlayerName() + ": " + player.getTotalPoints());
        }
    }

    /*
     * Kolla om det finns en vinnare genom att gå igenom alla spelare
     * och kolla om någon av spelarna har mer än 100 poäng. Metoden isSameScore
     * kollar om de två spelarna med högst poäng har samma poäng
     */
    public boolean checkIsWinner() {
        for (Player player : players) {
            if (player.getTotalPoints() > 100 && !isSameScore()) {
                return true;
            }
        }
        return false;
    }

    // Undersöker om spelarna med högst poäng har samma poäng
    public boolean isSameScore() {
        // Spara alla poängen i en lista
        ArrayList<Integer> scores = new ArrayList<>();
        for (Player player : players) {
            scores.add(player.getTotalPoints());
        }
        // Sortera listan från minsta till högsta tal
        Collections.sort(scores);

        // Om de två spelarna med högst poäng har samma värde så finns det ingen
        // vinnare.
        if (scores.get(scores.size() - 1) == (scores.get(scores.size() - 2))) {
            return true;
        } else {
            return false;
        }
    }

    // returnerar spelaren med högst poäng
    public Player highestScore() {
        int bestScore = 0;
        int bestIndex = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getTotalPoints() > bestScore) {
                bestScore = players[i].getTotalPoints();
                bestIndex = i;
            }
        }
        return players[bestIndex];
    }
}