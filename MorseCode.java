package morsecode;

import java.util.*;
import java.io.*;


public class MorseCode {
    public static BufferedReader br;
    public static Scanner sc;
    public static String sentence = "",answer = "",answer1 = "";
    public static char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
             'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
             'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
             ',', '.', '?' };   //Defining a Character Array of the English Letters numbers and Symbols so that we can compare and convert later 

    public static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };  //Defining an Array of String to hold the Morse Code value of Every English Letter,Number and Symbol in the same order as that of the character Array 

    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        
        
        Menu();
        
        
        
        
        
    }
    public static void Menu()throws IOException{
        int option = 0;
        while(option!=3){
            System.out.println("CHOOSE YOUR OPTION");
            System.out.println("[1]English to Morse Code\n"
                    + "[2]Morse Code to English\n"
                    + "[3]Exit ");
            System.out.print("->");
            try{
                option = Integer.parseInt(br.readLine());

                switch(option){
                    case 1:
                        MctoEng();
                        Menu();
                        break;
                    case 2:
                        EngtoMc();
                        Menu();
                        break;
                    case 3:
                        System.out.println("Thank you!!!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Option is 1 2 3 only");
                        Menu();
                }
            }
            catch(Exception e){
                System.out.println("Please number only");
                Menu();
            }
            
        }
    }
    public static void MctoEng()throws IOException{
        System.out.println("");
        System.out.println("-->Enter the Sentence that you want to Transmit Using the Morse Code ");
        System.out.print("->");
        sentence = br.readLine();
        System.out.println("");
        sentence = sentence.toLowerCase(); //Because morse code is defined only for the lower case letters and the numbers and the Symbols will remain the Same
        char[] morsec = sentence.toCharArray();
        for(int i = 0; i < morsec.length;i++)  //The loop will run till i is less than the number of characters in the Sentence because Every Character needs to Be Converted into the Respective Morse Code 
        {//For Every Letter in the User Input Sentence
            for(int j = 0;j<english.length;j++)   //For Every Character in the morsec array we will have to traverse the entire English Array and find the match so that it can be represented 
            {
                if(english[j] == morsec[i])  //If the Character Present in English array is equal to the character present in the Morsec array then Only Execute 
                {//Always remember that the condition in the Inner loop will be the first to be Equated in the If Statement because that will change until the characters match 
                    answer = answer + morse[j] + " ";  //After Every Letter is generated in the Morse Code we will give a Space 
                }  //Since the Letters in the English char and the symbols present in the morse array are at the Same Index 
            }
        }
        System.out.println("-->The Morse Code Translation is: ");
        System.out.print(">> ");
        System.out.println(answer);
        System.out.println("");
        
      
    }
    public static void EngtoMc()throws IOException{
        System.out.println("");
        System.out.println("-->Enter the Morse Code and After Every Letter add Space in Between ");
        System.out.print("-> ");
        sentence = br.readLine();
        System.out.println("");
        String[] morsec = sentence.split(" ");   //To use the split function to Convert Every Morse Code String as a Separate Entry in the STring array 
        for(int i = 0;i < morsec.length;i++)
        {//For Every morse code Letter Entered 
        //Remember - We are Splitting on the Basis of the space     
            for(int j = 0;j < morse.length;j++)
            {
                if(morse[j].equals(morsec[i]))  //When you are comparing the String you have to Do this and not == 
                {
                    answer1 = answer1 + english[j];  //Since the characters in the Morse array and the English Array are in the Same Index
                }
            }
        }
        System.out.println("-->The English Language Translation is: ");
        System.out.print(">> ");
        System.out.println(answer1);
        System.out.println("");
    }
}
