import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int index = 1;
        while(scanner.hasNext()){
            System.out.println(index + " " + scanner.nextLine());
            index++;
        }
        /*
        You can also use
        for(int i = 1; scanner.hasNext(); i++){
        System.out.println(i + " " + scanner.nextLine());
        }
        */
    }
}
