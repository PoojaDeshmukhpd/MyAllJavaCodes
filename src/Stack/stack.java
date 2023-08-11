package Stack;
class StackMain{
    static final int MAX=10;
    int[] a;
    int top=-1;
    int capacity;
    StackMain(int capacity)
    {
        a=new int[capacity];
        this.capacity=capacity;
    }
    boolean push(int x)
    {
        if(top>=(MAX-1))
        {
            System.out.println("Stack overflow");
            return false;
        }else{
            a[++top]=x;
            return true;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow");
            return -1;
        }else{
            return a[top--];
        }
    }
    int peek()
    {
        if(top<0)
        {
            System.out.println("Underflow");
            return -1;
        }else{
            return a[top];
        }
    }
}
public class stack {
    public static void main(String[] args) {
               StackMain st=new StackMain(20);
               System.out.println(st.push(10));
        System.out.println(st.push(10));
        System.out.println(st.push(20));

        System.out.println(st.push(30));

        System.out.println(st.push(40));
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());   System.out.println(st.pop());



    }
}
