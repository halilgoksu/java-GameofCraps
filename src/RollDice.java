import java.util.Random;

public class RollDice {

    private Random rand=new Random() ;
    private int die1;
    private int die2;


    public  int diceRoll(){
        die1=rand.nextInt(6)+1;
        die2=rand.nextInt(6)+1;
        //generate a number till 7
        return  die1+die2;
    }




}
