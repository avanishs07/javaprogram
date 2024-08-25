import java.util.Scanner;
class A
{
     int a,b;
    void input()
    {
    Scanner ac=new Scanner(System.in);
    System.out.println("Enter the value of a:");
    a=ac.nextInt();
    }
}
class B extends A
{
    void getdata()
    {
        int b;
        Scanner ac =new Scanner(System.in);
        System.out.println("Enter the value of b:");
        b=ac.nextInt();
    }
}
class C extends B
{
    void inputdata()
    {
        int c;
        c=a+b;
        System.out.println("Addition="+(c));
    }
}
class multilevelinheritance
{
    public static void main(String args[])
    {
        C aa= new C();
        aa.input();
        aa.getdata();
        aa.inputdata();
    }
}
