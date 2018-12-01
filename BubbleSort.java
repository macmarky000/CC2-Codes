package bubblesort;

import java.io.*;

public class BubbleSort {

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Enter how many number to be input 
        
        System.out.println("Enter how many numbers to be input: ");
        int p1 = Integer.parseInt(br.readLine());
        
        //Entering the numbers
        System.out.println("Enter the numbers");
        int arr[] = new int[p1];
	for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
	}
        
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
        
        //Sorting the numbers
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }       
            }  
        }  
        
        //Display the sorted numbers(Ascending)
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    } 
}