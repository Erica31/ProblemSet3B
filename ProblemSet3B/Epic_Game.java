
/**
 * THE INTENSE EPIC GAME OF ROCK, PAPER, CROSSBLADES.
 *
 * @author Erica Lee
 * @version Oct 7, 2023
 */
import java.util.Scanner;
public class Epic_Game
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Boolean AiWin = false;
        int human = -10, Ai = -10;
        
        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades!");
        System.out.println(" ");
        System.out.print("You: ");
        String humanChoice = input.nextLine();
        System.out.println(" ");
        String r ="rock", p = "paper", s = "crossblades";
        
        
        if(humanChoice.length()>=4 && r.equalsIgnoreCase(humanChoice.substring(humanChoice.length()-4))){
            human = 0;
        }else if(humanChoice.length()>=5 && p.equalsIgnoreCase(humanChoice.substring(humanChoice.length()-5))){
            human = 1;
        }else if(humanChoice.length()>=11 && s.equalsIgnoreCase(humanChoice.substring(humanChoice.length()-11))){
            human = 2;
        }

        
        if (humanChoice.length() >= 50 && human >= 0){
            
            Ai = (int)(Math.random()*2);
            System.out.print("Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course: ");
            if (Ai == 0)System.out.println("ROCK!");
            if (Ai == 1)System.out.println("PAPER!");
            if (Ai == 2)System.out.println("CROSSBLADES!");
            System.out.println(" ");
            
        }else if(humanChoice.length() < 50 && human >= 0){
            
            AiWin = true;
            System.out.print("Me: Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose ");
            if (human == 2)System.out.println("ROCK!");
            if (human == 0)System.out.println("PAPER!");
            if (human == 1)System.out.println("CROSSBLADES!");
            System.out.println(" ");
            
        }
        
        if (Ai == human + 1 || human == 2 && Ai == 0){
            AiWin = true;
        }else if(human == Ai+1 || Ai == 2 && human == 0){
            AiWin = false;
        }else if(human == -10){
            System.out.println("Me: You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
            System.out.println(" ");
            AiWin = true;
        }else if(Ai == human){
            System.out.println("Result: Unbelievable! We have tied! *Eye twitches*");
        }
        
        if (AiWin == true){
            System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
        }else if(AiWin == false && Ai != human){
            System.out.println("Result: I desprately failed to predict such power from a mere mortal...");
        }
        
    }
}
