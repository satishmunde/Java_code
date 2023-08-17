class DefToPara
{
    DefToPara()
    {
        this(10);
        System.out.println("Inside the deFault Constructor");
        
    }

    DefToPara(int x)
    {
        System.out.println("Inside the Parameterized Constructor");
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        DefToPara d1=new DefToPara();
    }
}
