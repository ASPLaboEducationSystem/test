import java.util.Random;

public class Dice{
    private int value;
    private Random random = new Random();
    public Dice(){
    }
    public void cast(){
        this.value = this.random.nextInt(6) + 1;
    }
    public int getValue(){
        return this.value;
    }
}