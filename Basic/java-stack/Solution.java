import java.util.*;
class Solution{
	
    static boolean isValid(String input){
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            /*
             * So, we check if character is ( { or [  . if true then we will push the character to the top of stack. if it is not true then there must be ) } or ]. So if not true then first we check if the stack is empty or not . If it is not true then we match the character with top of the stack 
            */
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top = stack.pop(); // we take char at top and remove that char from stack
                    if((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(') ){
                        return false;
                    }
                }
            }
            
        }
        return stack.isEmpty();
    }
    
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(isValid(input));
        }    
		
	}
}



