import java.util.Scanner;
class ArrayP
{
    int a[];
    int n;
    int p;
    int size;
    ArrayP()
    {
        a=new int [10];
        n=0;
        size=9;
        p=size;
    }
    void input()
    {
        try (Scanner sc = new Scanner(System.in))
         {
            System.out.println("enter 9 sorted elements :");

            for(int s=0;s<size;s++)
            {
                a[s]=sc.nextInt();
            }
            System.out.println("enter the no to be inserted : ");
            n=sc.nextInt();
        }
    }
    void insert()
    {
        for(int i=0;i<size;i++)
        {
            if(n<a[i])
            {p=i;
                break;
            }
        }
        for(int i=size;i>p;i--)
        {
            a[i]=a[i-1];
        }
        a[p]=n;
    }
    void display(int sz)
    {
        for(int u=0;u<sz;u++)
        {
            System.out.println(a[u]);
        }
    }
    public static void main(String arg[])
    {
        ArrayP R=new ArrayP();
        R.input();
        System.out.println("\n array before insertion:");
        R.display(R.size);
        R.insert();
        System.out.println("\n array after insertion:");
        R.display(R.size+1);
    }
}
