package fibinacirec;

import java.util.*;

public class FibinaciRec {

    public static void main(String[] args) {
        
        System.out.println("Enter n: ");
        int number = new Scanner(System.in).nextInt();
      
        System.out.println("\n" + fibonacci(number));
    } 
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }
}
