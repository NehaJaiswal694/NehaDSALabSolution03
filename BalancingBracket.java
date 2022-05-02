package labassignment03;
import java.util.Stack;
public class BalancingBracket {
	static boolean check(String bracketExpression)
	{
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i< bracketExpression.length(); i++) {
			char character = bracketExpression.charAt(i);
			if (character == '{' || character =='[' || character == '{') {
				stack.push(character);
				continue;
				
			}
			if(stack.isEmpty())
				return false;
			char c;
			switch(character) 
			{
				case '}' : 
					c = stack.pop();
					if(c == '(' || c == '[')
						return false;
					break;
				case ')' : 
					c= stack.pop();
					if(c == '{' || c == '[')
						return false;
					break;
				case ']' :
					c= stack.pop();
					if (c == '(' || c == '{')
						return false;
					break;
				
			}
	}
		return(stack.isEmpty());
	}
	public static void main(String[] args) {
		String bracketExpression = "([[{}]]))";
		Boolean result;
		result = check(bracketExpression);
		if(result)
			System.out.println("Entered string have balanced brackets");
		else
			System.out.println("Entered string have not balanced brackets");
			

	}

}
