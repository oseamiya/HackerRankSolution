import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int val = a;
            for (int j = 0; j < n; j++){
                val = val + (int)(Math.pow(2, j) * b);
                System.out.print(Integer.toString(val)  + ' ');
            }
            System.out.print('\n');
        }
        
        in.close();
    }
    
}
