import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        
        List<List<Integer>> listOfList = new ArrayList<>();
        
        for(int i =0; i< numberOfLines; i++){
            int numberOfDataInOneLine = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<numberOfDataInOneLine; j++){
                list.add(scanner.nextInt());
            }
            listOfList.add(list);
        }
        /*
         * Now listOfList will have
         * 41 77 74 22 44
         * 12
         * 37 34 36 52
         * 
         * 20 22 33
        */
        int numberOfLinesForIndex = scanner.nextInt();
        for(int i=0; i< numberOfLinesForIndex; i++){
            int firstIndex = scanner.nextInt() - 1;
            int secondIndex = scanner.nextInt() - 1;
            
            try{
                System.out.println(listOfList.get(firstIndex).get(secondIndex));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
