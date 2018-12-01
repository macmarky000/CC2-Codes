

import java.io.*;

public class Factorial {

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter n: ");
        int num = Integer.parseInt(br.readLine());
        
        int f = 1;
        for(int a = num;a>=1;a--){
            //System.out.print(a + " ");
            f = a*f;
            
        }
        System.out.println("\nThe factorial of " + num + " is " + f);
    }
    
}
