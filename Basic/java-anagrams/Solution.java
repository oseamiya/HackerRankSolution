import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        boolean ifAnagram = false;
        
        // first we check if length of them are same or not 
        // if length are not same then they can not be an anagram
        
        if(a.length() != b.length()){
            return false;
        }
        
        // We will change each string to uppercase then to character array then 
        // we will sort those array and check if they are same or not
        char[] aArray = a.toUpperCase().toCharArray();
        char[] bArray = b.toUpperCase().toCharArray();
        
        java.util.Arrays.sort(aArray);
        java.util.Arrays.sort(bArray);
        
        if(java.util.Arrays.equals(aArray, bArray)){
            ifAnagram = true;
        }
        
        return ifAnagram;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
