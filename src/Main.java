public class Main {
    public static void main(String [] args){
    calculateScore("Saket",400 );
    calculateScore(500);
    calculateScore();


    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player name is " + playerName + " and the score is = " + score);
        return score+1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unknown player and score = " + score);
        return score+1000;
    }

    public static int calculateScore(){
        System.out.println("No player name and No player score ");
         return 0;
    }
}
