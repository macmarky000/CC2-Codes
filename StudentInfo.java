

import java.util.*;  

public class StudentInfo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println("Enter your sex: ");
        char sex = sc.next().charAt(0);
        
        System.out.println("Enter your height: ");
        double pie = sc.nextDouble();
        
        System.out.println("Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Sex: " + sex + "\n"
                + "Pie: " + pie);
    }
    
}
