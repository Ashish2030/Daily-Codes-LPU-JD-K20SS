import java.util.Stack;

// Java program to find duplicate parenthesis in a
// balanced expression
public class Duplicateparenthesis{


	static boolean findDuplicateparenthesis(String s) {
		// create a stack of characters
		Stack<Character> Stack = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)!=')')
		    {
		         Stack.push(s.charAt(i));
		    }
		    else
		    {
		        int top= Stack.pop();
		        int count=0;
		        while(top!='(')
		        {
		            top= Stack.pop();
		            count++;
		        }
		        if(count<1)
		        {
		            return true;
		        }
		    }
		}
		return false;

	
	}

// Driver code
public static void main(String[] args) {

		// input balanced expression
		String str = "(a)";

		System.out.println(findDuplicateparenthesis(str)); 


	}
}
