import  java.util.*;
class Fabbonacci
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=0,b=1,c,d,num;
    System.out.println(" Enter the length of Fabonacci series");
    num=sc.nextInt();
    System.out.println(" the  series of fobonacci series as follow");
    System.out.print(+a);
    System.out.print("\t "+b);
    for(d=2;d<num;d++)
    {
        
        c=a+b;
        System.out.print("\t"+c);
        a=b;
        b=c;
        
    }
}
}