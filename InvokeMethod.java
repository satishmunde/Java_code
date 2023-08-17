class InvokeMethod
{
    //int x;
    void m()
    {
      //  x=n;
        System.out.println("Inside M function");
        // System.out.println("value of x="+x);
        
    }
    void n()
    {
        System.out.println("Inside N function");
        this.m();
    }

    public static void main(String[] args)
    {
        InvokeMethod i=new InvokeMethod();
        i.n();

    }
}