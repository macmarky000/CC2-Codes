


import java.util.*;  
import java.util.Random; 

public class Guess {

    public static int cm;

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);  
    
        System.out.println("Guess the number(1-100)");
        int guess;
        
        Random rand = new Random();
        rand.nextInt(100);
        cm = rand.nextInt(100) + 1; 

        for(int a = 5;a>0;a--){
            
            
        
            try{
		System.out.println("You have " + a + " tries left");
                System.out.println("Enter your guess: ");
                guess = sc.nextInt();

                //int cm = 7;
                if(guess>cm){
                    //System.out.println("Opppss wrong!!!!");
                    System.out.println("Too High!!!");
                    if(a==2){
                        System.out.println("THIS IS YOUR LAST CHANCE");
		    }
		    else if(guess>100){
		    	System.out.println("Number should 1-100 only");
		    }
                }
                else if(guess<cm){
                    //System.out.println("Opppss wrong!!!!");
                    System.out.println("Too Low!!!");
                    if(a==2){
                    	System.out.println("THIS IS YOUR LAST CHANCE");
		    }
		    else if(guess>100){
		    	System.out.println("Number should 1-100 only");
		    }
                }
                else{
                    System.out.println("You got it right;)");
                    System.exit(0);
                }

            }
            catch(InputMismatchException e){
                System.out.println("Invalid input");
                sc.next();
            }
           
        }
        System.out.println("Finished!!!");
	System.out.println("The correct answer: " + cm);
	
	
    }
    
}
