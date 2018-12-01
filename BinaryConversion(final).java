package binaryconversion;

import java.io.*;

public class BinaryConversion {
public static BufferedReader br;

    public static void main(String[] args)throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        Menu();
    }    
    public static void Menu()throws IOException{
        
    
        System.out.println("******** BINARY CONVERSION *********");
        
        System.out.println("[1] Decimal to Binary\n"
                + "[2] Octal to Binary\n"
                + "[3] Hexadecimal to Binary\n"
                + "[4] Exit\n");
        System.out.print("Enter your choice : ");
        
        int choose = Integer.parseInt(br.readLine());
        
        switch(choose){           
            case 1:
                Decimal();
                
                break;            
            case 2:
                Octal();
                
                break;
            case 3:
                hexa();
                
                break;
            case 4:
                System.out.println("Thank You!");
                System.exit(0);
                break;
        }
    
    }
        
    public static void Decimal()throws IOException{
        System.out.print("Enter a decimal number : ");
        int no=Integer.parseInt(br.readLine());
        
        
        if(no > 0) {
            int container[] = new int[100];
            int i = 0;
            while (no > 0){
                container[i] = no%2;
                no = no/2;
                i++;
            }
            for (int j = i-1 ; j >= 0 ; j--){
                System.out.print(container[j]);
            }  
        }
 
        
        System.out.println("\nDo you want to convert again?\n"
            + "y/n");
        String end = br.readLine();
        if(end.equalsIgnoreCase("y")){
            Menu();            
        }
        else if(end.equalsIgnoreCase("n")){
            System.out.println("Thank you!!!");
        }
            
    }        
    public static void hexa()throws IOException{          
        System.out.print("Enter HexaNumber :");
        String hexa = br.readLine();
            
        int b = Integer.parseInt(hexa,16);
            
        String hex = Integer.toBinaryString(b);
        System.out.println("The hexaNumber converted to binary is " +hex);
            
        System.out.println("Do you want to try again?\n"
            + "y/n");
        String end = br.readLine();
        if(end.equalsIgnoreCase("y")){
            Menu();            
        }
        else if(end.equalsIgnoreCase("n")){
            System.out.println("Thank you");
        } 
    }
    public static void Octal()throws IOException{
        System.out.print("Enter Octal Number :");
        String oc = br.readLine();
            
        int b = Integer.parseInt(oc,8);
           
        String octal = Integer.toBinaryString(b);
        System.out.println("The Octal number converted to Binary is " +octal);
            
            
        System.out.println("Do you want to try again?\n"
            + "y/n");
        String end = br.readLine();
        if(end.equalsIgnoreCase("y")){
            Menu();            
        }
        else if(end.equalsIgnoreCase("n")){
            System.out.println("Thank you!!!");
        }
    }  
}