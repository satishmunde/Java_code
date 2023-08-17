class PassArgMethod
{
    void m(PassArgMethod obj)
    {
        System.out.println("This in invoked");
    }
    void n()
    {
        m(this);
    }
    public static void main(String[] args)
    {
        PassArgMethod p1=new PassArgMethod();
        p1.n();
    }

}
