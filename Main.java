public class Main {
    public static void main(String[] args) {

        // Fem tärningar per DiceCup
        int nmbrOfDices = 5;

        // Varje tärning av 6 sidor i detta exempel
        int nmbrOfSides = 6;

        // Hittar på tre namn på
        String[] names = { "Emil", "Gustav", "Ellen" };

        // En array med alla spelare
        Player[] players = new Player[3];

        // Skapar spelarna med givet namn och ger varje spelare en ny DiceCup.
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i], new DiceCup(nmbrOfDices, nmbrOfSides));
        }

        // Skapar ett objekt av klassen logic och skicar in spelarna till konstruktorn
        Logic logic = new Logic(players);

        System.out.println(logic.isSameScore());

        // Kollar först om det finns en vinnare. Om det ej finns en vinnare kasta
        // tärningarna på nytt
        while (!logic.checkIsWinner()) {
            logic.doRound();
        }

        // Kolla vem som är vinnaren och skriv ut
        Player winner = logic.highestScore();
        System.out.println("The winner is: " + winner.getPlayerName() + " with score: " + winner.getTotalPoints());

    }
}
