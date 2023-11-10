import java.util.ArrayList;

public class DiceCup {
    private Dice[] diceCup;
    private int sum;

    public DiceCup(int dices, int sides) {
        this.diceCup = new Dice[dices];
        for (int i = 0; i < dices; i++) {

            this.diceCup[i] = new Dice(sides);

        }

    }

    public void rollDices() {
        int tempSum = 0;
        for (int i = 0; i < diceCup.length; i++) {

            tempSum = tempSum + this.diceCup[i].rollDice();

        }

        this.sum = tempSum;

    }

    public int getSum() {
        return this.sum;
    }

}
