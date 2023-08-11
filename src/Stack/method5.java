package Stack;

import java.util.Stack;

public class method5 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(10);
        s.push(30);
         System.out.println(s.push(40));
        s.push(20);

        System.out.println(s.contains(20)); //return true or false
        System.out.println(s.search(10));
        System.out.println(s.search(40));
        System.out.println(s.search(20));

        while(s.size()>0)
        {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.size());

    }
}
