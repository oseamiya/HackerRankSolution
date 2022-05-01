import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Here we are using BigInteger class and use isProbablePrime method with certainty of 1.
        String n = bufferedReader.readLine();
        BigInteger bigInteger = new BigInteger(n);
        boolean isPrime = bigInteger.isProbablePrime(1);
        System.out.println(isPrime ? "prime" : "not prime");
        
        bufferedReader.close();
    }
}
