

import java.io.*;

public class Fibonnaci {
    

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter n: ");
        int n = Integer.parseInt(br.readLine());
        
        int t1 = 0, t2 = 1;
        
        //System.out.print("First " + n + " terms: ");
        
        
        for (int i = 1; i <= n; ++i)
        {
            //System.out.print(t1 + " ");
            if(i==n){
                System.out.println("\nThe value is " + t1);
            }

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
          
        } 
    }
}
