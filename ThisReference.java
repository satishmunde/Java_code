class ThisReference
{
    void a()
    {
        System.out.println(this);
    }
    public static void main(String[] args)
    {
        ThisReference obj=new ThisReference();
        System.out.println(obj);
        obj.a();
        
    }
}