package array;

import java.util.Arrays;
public class IntToArray{

     public static void main(String []args){
    	 
    	 // First method
         int number = 190181; 
String temp = Integer.toString(number);
int[] numbers = new int[temp.length()];
for (int i = 0; i < temp.length(); i++) {
    numbers[i] = temp.charAt(i) - '0'; // ch -ch (ASCII) 0->48,1->49 so 49-48,57-48,48-48,49-48,56-48,49-48->1,9,0,1,8,1
}
        System.out.println(Arrays.toString(numbers));
        
        // Second method
        int num = 1234567;
        int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
        for(int d : digits)
            System.out.print(d);
        
        System.out.println(Arrays.toString(digits));
     }
}