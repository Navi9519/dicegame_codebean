import java.util.Random;

public class Dice {
    Random ran;
    private int sides;
    private int lastThrow;

    public Dice(int sides) {
        this.sides = sides;

    }

    public int rollDice() {

        ran = new Random();
        this.lastThrow = ran.nextInt(this.sides) + 1;
        return lastThrow;

    }

    public int getSides() {
        return this.sides;
    }

    public int getLastThrow() {
        return this.lastThrow;
    }

}
