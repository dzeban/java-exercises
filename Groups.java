import java.util.Stack;
import java.util.EmptyStackException;

public class Groups
{
	public static boolean groupCheck(String s)
	{
		Stack<Character> stack = new Stack <Character>();
		
		for (char c : s.toCharArray())
		{
			switch (c)
			{
				case '(':
					stack.push(')');
					break;
				case '{':
					stack.push('}');
					break;
				case '[':
					stack.push(']');
					break;
				case ')':
				case '}':
				case ']':
					try
					{
						if (c != stack.pop())
							return false;
					}
					catch (EmptyStackException e)
					{
						return false;
					}
					break;
				default:
					return false;
			}
		}
		return stack.empty();
	}
	
	public static void main (String [] args)
	{
		System.out.println(groupCheck("(({}[]{}()))"));
		System.out.println(groupCheck("({}[]{}()))"));
		System.out.println(groupCheck("(({}[]{}())"));
		System.out.println(groupCheck("()"));
		System.out.println(groupCheck(""));
	}
}
