import java.util.StringTokenizer;
import java.util.ArrayDeque;;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Calc 
{
    public double evaluate(String expr) 
    {
        double a, b, result = 0.0;
        String operators = "+-*/";

        Deque<Double> stack = new ArrayDeque<Double>();

        StringTokenizer st = new StringTokenizer(expr);
        while (st.hasMoreTokens()) 
        {
            try 
            {
                String t = st.nextToken();

                // It is an operator
                if (operators.contains(t))
                {
                    b = stack.pop();
                    a = stack.pop();
                    switch (t)
                    {
                        case "+":
                            result = a + b;
                            break;
                        case "-":
                            result = a - b;
                            break;
                        case "*":
                            result = a * b;
                            break;
                        case "/":
                            result=  a / b;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid operator");
                    }

                    stack.push(result);
                }
                else // It's an operand
                {
                    double e = Double.parseDouble(t);
                    stack.push(e);
                }
            }
            catch (Exception e)
            {
                throw new IllegalArgumentException("Invalid expression");
            }
        }

        try
        {
            return stack.pop();
        }
        catch (NoSuchElementException e)
        {
            return 0.0;
        }
    }

    public static void main (String [] args)
    {
        String expr = "";
        for (String s : args)
        {
            expr += s + " ";
        }

        System.out.printf("'%s'\n", expr);
        Calc c = new Calc();
        System.out.println(c.evaluate(expr));
    }
}
