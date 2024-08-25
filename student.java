class student
{
    int roll;
    String name;
    static String Cname="XYZ College";
    student(int x,String y)
    {
        roll=x;
        name=y;
    }
    void display()
    {
        System.out.println("Roll="+roll+"Name="+name+"College name="+Cname);
    }
    
    public static void main(String args[])
    {
        student aa=new student(101,"Ram");
        student bb=new student(102,"Shyam");
        aa.display();
        bb.display();
    }
}