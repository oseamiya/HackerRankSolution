import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] =  scanner.nextInt();
        }
        int noOfNegativeSubArrays = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum = sum +  array[j];
                if(sum < 0 ){
                    noOfNegativeSubArrays++;
                }
            }
        }
        System.out.println(noOfNegativeSubArrays);
        
    }
}
