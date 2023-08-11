import java.util.Stack;
import java.util.Scanner;
public class BalancedParenthesis {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String br=sc.nextLine();
        boolean flag=false;
        System.out.println(br);
        for(int i=0;i<br.length();i++)
        {
            if (br.charAt(i)=='{' || br.charAt(i)=='[' || br.charAt(i)=='(') {
                s.push(br.charAt(i));
                continue;
            }
                if((s.peek()=='{' && br.charAt(i)=='}') || (s.peek()=='[' && br.charAt(i)==']') || (s.peek()=='(' && br.charAt(i)==')'))
                    s.pop();
                else
                    break;

        }
if(s.size()==0)
    System.out.println("Balanced Parenthesis so it is good"  );
else
    System.out.println("Not Balanced Parenthesis");

    }
}
