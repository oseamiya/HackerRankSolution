import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    
    public static int getMaxSum(List<List<Integer>> array){
        int rowLength = array.size();
        int columnLength = array.get(rowLength-1).size();
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<rowLength - 2; i++){
            for(int j=0; j<columnLength - 2; j++){
                
                int sum = array.get(i).get(j) + array.get(i).get(j+1) + array.get(i).get(j+2) + array.get(i+1).get(j+1) + array.get(i+2).get(j) + array.get(i+2).get(j+1) + array.get(i+2).get(j+2);
                maxValue = Math.max(maxValue, sum);
            }
        }
        
        
        return maxValue;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        System.out.println(getMaxSum(arr));

        bufferedReader.close();
    }
}
