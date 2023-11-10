public class Player {
    private String playerName;
    private int totalPoints;
    private DiceCup diceCup;

    public Player(String playerName, DiceCup diceCup) {
        this.playerName = playerName;
        this.diceCup = diceCup;

    }

    public void rollDice() {
        this.diceCup.rollDices();
        this.totalPoints = this.totalPoints + this.diceCup.getSum();
    }

    public int getTotalPoints() {

        return this.totalPoints;

    }

    public String getPlayerName() {

        return this.playerName;

    }

}
