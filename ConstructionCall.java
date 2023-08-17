class ConstructionCall
{
    Con1 obj;
    ConstructionCall(Con1 obj)
    {
        this.obj=obj;

    }
    void show()
    {
        System.out.println(obj.a);
        System.out.println(obj.a);
    }
    class Con1
    {
        int a=100;
        Con1()
        {
            ConstructionCall obj=new ConstructionCall(this);
            obj.show();
        }
        public static void main(String[] args)
        {
            Con1 c=new Con1();
        }
    }
}