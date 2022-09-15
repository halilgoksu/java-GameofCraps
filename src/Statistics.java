import java.util.Arrays;

public class Statistics {
    public static int[] wins=new int[22];
    public static int[] loses =new int[22];


    public double averageLength(){
        double avg;
        int sumOfRounds=0;
        for (int i=1;i<=21;i++){
            sumOfRounds +=(wins[i] *i)+(loses[i]*i);
        }
        avg=(double) sumOfRounds/(Arrays.stream(wins).sum()+Arrays.stream(loses).sum());
        return avg;
    }

    
    public void setStats(int round, CrapsGame.GameStatus result){
    
        if (result==CrapsGame.GameStatus.WIN){
            if (round<=20){
                wins[round]+=1;
            }else {
                wins[21]+=1;
                
            }
        } else if (result==CrapsGame.GameStatus.LOSE) {
            if (round<=20){
                loses[round]+=1;
            }else {
                loses[21]+=1;
            }
            
        }
    }

    public double probabilityOfWinning(){
        return (double)Arrays.stream(wins).sum()/(Arrays.stream(wins).sum()
        +Arrays.stream(loses).sum());

    }
    public void displayStatic(){
        double probability;
        double avg;
        for (int i=1;i<=21;i++){
            if (i==21){
                System.out.println("Round 21 or more wins "+ wins[i]);
            }else {
                System.out.println("Round "+ i+" Wins "+wins[i]);
            }
        }
        for (int i=1;i<=21;i++){
            if (i==21){
                System.out.println("Round 21 or more loses "+ loses[i]);
            }else {
                System.out.println("Round "+ i+" loses "+loses[i]);
            }
        }
        probability =probabilityOfWinning();
        System.out.println("Chances of winning the game of Craps are "+ probability*100+ "%");
        System.out.println("Average  length of a game of Craps is "+ averageLength()+" rounds ");



    }

}
