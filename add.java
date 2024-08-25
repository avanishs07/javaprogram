import java.util.Scanner;
class add
{
    int a,b;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter seconnd number:");
        System.out.println("Radhe Radhe");
        System.out.println("Radhe Radhe");
        System.out.println("Radhe Radhe");
        System.out.println("Radhe Radhe");
        System.out.println("Radhe Radhe ji");

        b=sc.nextInt();
    }
    void putdata()
    {
        System.out.println("Addition="+(a+b));
    }
    public static void main(String args[]){
    add aa=new add();
    aa.getdata();
    aa.putdata();
    }
}