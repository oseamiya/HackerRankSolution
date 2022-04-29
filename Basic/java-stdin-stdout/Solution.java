import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.
        /*
        In Scanner class if we call nextLine() method after any one of the seven nextXXX() method then the nextLine() doesn’t not read values from console and cursor will not come into console it will skip that step. The nextXXX() methods are nextInt(), nextFloat(), nextByte(), nextShort(), nextDouble(), nextLong(), next().
        That's because the Scanner class' nextInt() method does not consume the last newline character of your input, and thus that newline is consumed in the next call to Scanner class' nextLine().
        You can fire a blank Scanner class' nextLine() call after Scanner#nextInt to consume the rest of that line including newline 
        Source : https://stackoverflow.com/a/45101132
        */
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
