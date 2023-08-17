class ParaToDef
{
    ParaToDef()
    {
        System.out.println("Inside the default constructor");
    }
    ParaToDef(int x)
    {
        this();
        System.out.println(x);
               
    }
    public static void main(String[] args)
    {
        ParaToDef p=new ParaToDef(10);
    }
}