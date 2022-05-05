import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        int totalSize = arr.size();
        double positiveSize = 0, negativeSize = 0, zeroSize = 0;
        for(int item : arr){
            if(item < 0){
                negativeSize++ ;
            }else if(item > 0){
                positiveSize++ ;
            }else{
                zeroSize++ ;
            }
        }
        DecimalFormat decimalFormat= new DecimalFormat("0.000000");
        System.out.println(decimalFormat.format(positiveSize / totalSize));
        System.out.println(decimalFormat.format(negativeSize / totalSize));
        System.out.println(decimalFormat.format(zeroSize / totalSize));
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
