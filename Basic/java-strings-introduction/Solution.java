import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        // Sum the lengths of A & B
        System.out.println(A.length() + B.length());
        
        // Determine if A is larger than B for that
        // Check if first character of A is larger or not, if true then print Yes else no
        System.out.println(A.charAt(0) > B.charAt(0) ? "Yes" : "No");
        
        // Capitalize first letter in both A & B and print on single line with space separated for that
        // we use substring method of string to get first character using str.substring(0,1) then add that to remaining string from index 1 ie substring(1)
        
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
        
    }
}
