package Stack;
import java.util.*;
public class method3 {
    ArrayList<Integer> a=new ArrayList<>();
    void push(int x)
    {
        a.add(x);
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }else{
            int res=a.get(a.size()-1);
            a.remove(a.size()-1);
            return res;
        }
    }
    int peek(){
        if(isEmpty())
        {
            return Short.MIN_VALUE;
        }
        else{
            return  a.get(a.size()-1);
        }

    }
    boolean isEmpty()
    {
        if(a.size()-1<0)
        {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] ar){
        method3 s=new method3();
        s.push(10);
       System.out.println( s.peek());
        s.push(20);
        s.push(30);
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.pop());
        System.out.println( s.peek());
    }
}
