import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        // Palindrome is condition when string equals to reversed string like madam
        // Here i will go from last character to first character of the string and add it to the reversedString variable
        String reversedString = "";
        for(int i= A.length()-1; i>=0; i-- ){
            reversedString = reversedString + String.valueOf(A.charAt(i));
        }
        System.out.println(A.equals(reversedString) ? "Yes" : "No");
        
    }
}


