public class Stack
{
    private int maxSize;
    private long[] stackArray;
    private int top;
    public Stack(int s)
    {
        maxSize=s;
        stackArray=new long[maxSize];
        top=-1;
    }
    public void push(long j)
    {
        stackArray[++top]=j;
    }
    public long pop()
    {
        return stackArray[top--];
    }
    public long peek()
    {
        return stackArray[top];
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public boolean isFull()
    {
        return (top==maxSize-1);
    }
    public static void main(String[] args)
    {
        Stack s=new Stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        while (!s.isEmpty())
        {
            long value= s.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}