import java.util.Stack;

public class InfixPostfix {
    public static int precedence(char c)
    {
        switch(c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static boolean checkIfOperand(Character x)
    {
        return (x<='a' && x>='z') || (x<='A' && x>='Z');
    }
    public static void convertInfixTopostfix(String expr)
    {
        int i,j;
        Stack<Character>  s=new Stack<>();
        StringBuilder r=new StringBuilder((new String("")));
        for(i=0,j=-1;i<expr.length();++i) {
            if (checkIfOperand(expr.charAt(i)))
                r.append(expr.charAt(i));

            else if (expr.charAt(i) == '(')
                s.push(expr.charAt(i));
            else if (expr.charAt(i) == ')') {
                while (!s.empty() && s.peek() != ')') {
                    r.append(s.peek());
                    s.pop();
                }
                if (!s.empty() && s.peek() != '(')
                    return;
                else s.pop();
            } else {
                //opertaor
                while (!s.empty() && precedence(expr.charAt(i)) <= precedence(s.peek())) {
                    r.append(s.peek());
                    s.pop();
                }
                s.push(expr.charAt(i));
            }
        }
        while(!s.empty())
        {
            r.append(s.peek());
            s.pop();
        }
        System.out.println(r);
    }
    public static void main(String[] args) {
        String expr="a+b*(c^d-e)^(f+g*h)-i";
        convertInfixTopostfix(expr);
    }
}
