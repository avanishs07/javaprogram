class staticmemfunc
{
    int roll;
    String name;
    static String Cname="XYZ";
    staticmemfunc(int x,String y)
    {
        roll=x;
        name=y;
    }
    void display()
    {
        System.out.println("Roll ="+roll+"Name="+name+"College name="+Cname);
        
    }
    static void change()
    {
        Cname="ABC";
    }
    public static void main(String args[])
    {
        staticmemfunc aa=new staticmemfunc(101, "Ram");
        staticmemfunc bb=new staticmemfunc(102, "Shyam");
        aa.display();
        bb.display();
    }

}