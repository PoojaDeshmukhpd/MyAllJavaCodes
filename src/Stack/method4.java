package Stack;
import java.util.*;
public class method4 {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek="+stack.peek());
        System.out.println("Size"+stack.size());

        System.out.println("Popped"+stack.pop());

           for(Integer integer:stack)
           {
               System.out.println(integer);
           }

        System.out.println("Contains 20"+stack.contains(20));

        System.out.println(stack.isEmpty());
        System.out.println("Popped="+stack.pop());
        System.out.println("Popped="+stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println("Peek="+stack.peek());
        System.out.println("Popped="+stack.pop());
        System.out.println("Popped="+stack.pop());

    }

}
