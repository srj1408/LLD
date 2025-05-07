package SankeAndLadder;

public class Dice {
    private int diceCount;
    private int min=1;
    private int max=6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int sum = 0;
        int diceUsed = 0;
        int range = max-min+1;
        while(diceUsed<diceCount){
            sum += (int)(Math.random()*range)+min;
            diceUsed++;
        }
        return sum;
    }
}
