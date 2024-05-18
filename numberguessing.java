import java.util.Scanner;
import java.util.Random;

public class numberguessing {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        String play="yes";

        while(play.equals("yes")){
            Random R =new Random();  
            int Rnum=R.nextInt(100);
            int guess=-1;
            int tries=0;

          while(guess!=Rnum){
            System.out.println("GUESS THE NUMBER BETWEEN 1 AND 100");
            guess=reader.nextInt();
            tries++;

            if(guess==Rnum){
                System.out.println("YOU GUESSED THE NUMBER");
                System.out.println("IT ONLY TOOK YOU "+tries+"GUESSES");
                System.out.println("WOULD YOU LIKE TO CONTINUE?YES OR NO");
                play=reader.next().toLowerCase();

            }
            else if(guess>Rnum){
                System.out.println("your guess is too high");
            }
            else{
                System.out.println("your guess is too low");
            }
            }}
            reader.close();
    }
    
}
