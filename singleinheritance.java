import java.util.Scanner;
class A
{
    int a,b;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
    }
    void display()
    {
        System.out.println("Addition="+(a+b));
    }
}
class B extends A
{
    int c;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of c:");
        c=sc.nextInt();
    }
        void putdataa()
        {
            System.out.println("Addition="+(a+b+c));
        }

    }
class singleinheritance
{
    public static void main(String args[])
    {
        B aa=new B();
        aa.input();
        aa.getdata();
        aa.display();
        aa.putdataa();
    }
}