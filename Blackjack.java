//package blackjack;

import java.io.*;
import java.util.Scanner;

public class Blackjack {
    
    public static BufferedReader br;

    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        
        Menu();
        
    }
    public static void Menu()throws IOException{
        System.out.println("**********BLACKJACK**********");
        System.out.println("[1] Play\n"
                + "[2] Rules\n"
                + "[3] Exit\n"
                + "Enter your choice: ");
        int choose = Integer.parseInt(br.readLine());
        
        switch(choose){
            case 1:
                Play();
                End();
                break;
            case 2:
                Rules();
                break;
            case 3:
                System.out.println("Nice game!!!");
                System.exit(0);
                break;
        }
    }
    public static void Play()throws IOException{
        int player_random1 = 100;
        int player_random2 = 100;

        while(player_random1 >= 12 || player_random2 >= 12  || player_random1 < 3 || player_random2 <3)
        {
            player_random1 = (int)(Math.random()*100);
            player_random2 = (int)(Math.random()*100);
        }
        
        int player_total = player_random1 + player_random2;
        
        System.out.println("==================================================================================================");
        
        System.out.println("**********BLACKJACK**********");
        
        System.out.println("You get a "+player_random1+" and a "+player_random2);
        System.out.println("Your total is "+player_total);
        
        if(player_total==21)
        {
            System.out.println("Blackjack! Player Wins!");
            System.out.println("==================================================================================================");
        return;
        }
        System.out.println();
        
        int dealer_random1 = 100;
        int dealer_random2 = 100;
        
        while(dealer_random1 >= 12 || dealer_random2 >= 12 || dealer_random1 < 3 || dealer_random2 < 3)
        {
            dealer_random1 = (int)(Math.random()*100);
            dealer_random2 = (int)(Math.random()*100);
        }
        
        int dealer_total = dealer_random1 + dealer_random2;
        
        boolean hidden = Math.random() < 0.5; // to decide whether to hide one card or not
        
        if(hidden==true)
        {
            System.out.println("The dealer has a "+dealer_random1+" showing and a hidden card");
            System.out.println("His total is hidden too");
            System.out.println();
        }
        else{
            System.out.println("The dealer has a "+dealer_random1+" showing  and a "+dealer_random2);
            System.out.println("Dealer total is "+dealer_total);
            System.out.println();
            if(dealer_total==21){
                System.out.println("Blackjack! Dealer Wins!");
                return;
            }
        }

        int player_preference;
        Scanner in = new Scanner(System.in);

        System.out.println("Would you like to hit or stay?\n"
                + "[1]Hit\n"
                + "[2]Stay\n"
                + "[3]Surrender");
        player_preference = in.nextInt();

        while(player_preference==1){
            int player_random3 = 100;
            while(player_random3 >= 12  || player_random3 < 3)
            {
                player_random3 = (int)(Math.random()*100);
            }
            player_total = player_total + player_random3;
            System.out.println("You drew a " + player_random3);
            System.out.println("Your total is " + player_total);
            System.out.println();

            if(player_total>21)
            {
                System.out.println("Dealer's total cards is " + dealer_total);
                System.out.println("Busted! Dealer wins!");
                System.out.println("==================================================================================================");
                return;
            }
            else if(player_total==21){
                System.out.println("Dealer's total cards is " + dealer_total);
                System.out.println("You Win!");
                System.out.println("==================================================================================================");
                return;
            }
            System.out.println("Would you like to hit or stay?\n"
                    + "[1]Hit\n"
                    + "[2]Stand\n"
                    + "[3]Surrender");
            player_preference = in.nextInt();
        }
        
        if (player_preference==2){
            System.out.println();
            System.out.println("Okay, dealer's turn.");
            int dealer_random3 = 100;
            while(dealer_random3 >= 12 || dealer_random3 <3)
            {
                dealer_random3 = (int)(Math.random()*100);
            }

            System.out.println("His hidden card was "+dealer_random2);
            System.out.println("His total was "+dealer_total);
            System.out.println();

            if(dealer_total>16)
            {
                System.out.println("Dealer stays");
            }
            else
            {
                while(dealer_total<=16)
                {
                    dealer_total = dealer_total + dealer_random3;
                    System.out.println("Dealer choses to hit.");
                    System.out.println("He draws "+dealer_random3);
                    System.out.println("His total is "+dealer_total);
                }
            }

            System.out.println();
            System.out.println("Dealer total is "+dealer_total);
            System.out.println("Your total is "+player_total);

            if((player_total>dealer_total && player_total<21)||dealer_total>21)
            {
                System.out.println("Your total card is " + player_total + "\n"
                        + "Dealer's total card is " + dealer_total);
                System.out.println("YOU WIN!");
                System.out.println("==================================================================================================");
            }
            else if((dealer_total<21 && player_total<dealer_total)||player_total>21)
            {
                System.out.println("Dealer number is " + dealer_total + "\n"
                    + "Your total card is " + player_total);
                System.out.println("Dealer wins!");
            }
            
            System.out.println("==================================================================================================");
        }
        else if(player_preference==3){
            System.out.println("Do you really want to surrender?\n"
                    + "y/n");
            String opt = br.readLine();
            if(opt.equals("y")){
                End();
            }
            else if(opt.equals("n")){
                int player_random3 = 100;
            while(player_random3 >= 12  || player_random3 < 3)
            {
                player_random3 = (int)(Math.random()*100);
            }
            player_total = player_total + player_random3;
            System.out.println("You drew a " + player_random3);
            System.out.println("Your total is " + player_total);
            System.out.println();

            if(player_total>21)
            {
                System.out.println("Dealer's total cards is " + dealer_total);
                System.out.println("Busted! Dealer wins!");
                System.out.println("==================================================================================================");
                return;
            }
            else if(player_total==21){
                System.out.println("Dealer's total cards is " + dealer_total);
                System.out.println("You Win!");
                System.out.println("==================================================================================================");
                return;
            }
            
            System.out.println("==================================================================================================");
            }
        }
           
        
    }
    public static void Rules()throws IOException{
        System.out.println("==================================================================================================");
        System.out.println("**********RULES**********\n"
                + "1.Dealer shuffles the cards.\n"
                + "2.Give 2 cards to the player;2 cards for the dealer.\n"
                + "3.Check player has 21 or have high cards.\n"
                + "4.If so,stand Player wins.\n"
                + "5.If not,option 1:\n"
                + "surender Player loses.\n"
                + "6.If not,option 2:\n"
                + "hit.\n"
                + "7.Repeat 3.");
        
        System.out.println("Press enter to go back to the main menu.");
        br.readLine();
        System.out.println("==================================================================================================");
        
        Menu();
    }
    public static void End()throws IOException{
        System.out.println("Do you want to play again?\n"
                + "y/n");
        String end = br.readLine();
        if(end.equals("y")){
            Play();
            End();
        }
        else if(end.equals("n")){
            Menu();
        }
    }
}