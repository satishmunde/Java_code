class  ConstructorPara
{
    int x;
    String y;

    ConstructorPara(int x,String y)
    {
        this.x=x;
        this.y=y;
    }
    void show()
    {
        System.out.println("Value of X="+x);
        System.out.println("Value of Y="+y);
    }

    public static void main(String[] args)
    {
        ConstructorPara c1=new ConstructorPara(007,"Satish Munde");
        c1.show();
    }
}