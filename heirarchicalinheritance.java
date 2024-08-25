import java.util.Scanner;
class A 
{
    int a,b;
    void input()
    {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the value of a:");
    a=sc.nextInt();
    System.out.println("Enter the value of b:");
    b=sc.nextInt();
    }
}
class B extends A
{
    int c;
    void getdata()
    {
    c=a+b;
    System.out.println("Addition="+c);
}
}
class C extends A
{
    int d ;
    void display()
    {
        d=a-b;
        System.out.println("Subtraction="+b);
    }
}
class heirarchicalinheritance
{
    public static void main(String args[])
    {
        B aa=new B();
        C bb =new C();
        aa.input();
        aa.getdata();
        bb.display();
    }
}

