import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // we will take input as string, then convert them into BigInteger where we will be doing sum and product using .add and .multiply method of BigInteger
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        
        BigInteger sum;
        BigInteger product;
        
        sum = bigA.add(bigB);
        product = bigA.multiply(bigB);
        
        System.out.println(sum);
        System.out.println(product);
    }
}
