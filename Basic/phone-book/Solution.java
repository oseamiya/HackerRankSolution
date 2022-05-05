import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        
     // creating a hash map of String, Integer for Name and phone number respectively
    HashMap<String,Integer> map = new HashMap<>();
        
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            
            map.put(name, phone);
            
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            Integer phoneNumber = map.get(s);
            System.out.println(phoneNumber == null ? "Not found" : s + "=" + phoneNumber);
		}
	}
}



