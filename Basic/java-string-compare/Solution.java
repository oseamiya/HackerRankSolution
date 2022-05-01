import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        /* You can do something like this by using compareTo method
          smallest = s.substring(0,k); 
          largest = s.substring(0,k);
          for(int i=0; i<=s.length()-k; i++ ){ 
            String str = s.substring(i,k+i);
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            if(largest.compareTo(str)<0){
                largest=str;
            }
        }  
        
        However, I am here creating a list where i will put each ordered substrings, then i will sort the list in ascending order using Collections.sort method and finally will print smallest as first item and largest as last item.
        */
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        
        for(int i=0; i<= s.length()-k; i++){
            list.add(s.substring(i,i+k));
        }
        java.util.Collections.sort(list);
        smallest = list.get(0);
        largest = list.get(list.size() - 1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
