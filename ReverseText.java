import java.util.Scanner;

/**
 * ACS-1903 Lab5 Q7
 *
 * @author (your name and student number)
 */

public class ReverseText{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String userInput;

        // enter your code here
        System.out.println("ener some words, stop to quit");
        
        userInput = kb.next();
        
        while(!userInput.equalsIgnoreCase("stop")){
            //System.out.println(userInput);
            
            for(int i = userInput.length() - 1; i >= 0; i--)
                System.out.print(userInput.charAt(i));
                
            System.out.print(" ");
            userInput = kb.next();
        }
      

    }
}
