import java.util.Scanner;
class primenumber
{
    int n,i,count=0;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check:");
        n=sc.nextInt();   
    }
void putdata() 
{
    i=1;
    while(i<=n)
    {
        
        if(n%i==0)
        count=count+1;
        i=i+1;
    }
    if(count==2)
    System.out.println("The Entered number is prime");
    else
    System.out.println("The entered number is not prime");
}
public static void main(String args[])
{
    primenumber aa=new primenumber();
    aa.getdata();
    aa.putdata();
}
}