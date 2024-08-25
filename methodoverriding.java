class A
{
    void message()
    {
        System.out.println("Welcome to derived  class");
    }
}
class B extends A
{
    void message()
    {
        System.out.println("Welcome to derived class");
    }
}
class methodoverriding
{
    public static void main(String avanish[])
    {
        B aa=new B();
        aa.message();
    }
}