import java.util.*;
class Pattern10
{
    public static void main(String[] args)
    {
    int num,i,j,k;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of pattern");
    num=sc.nextInt();
    for(i=num;i>=0;i--)
    {
        for(j=i;j<=num;j++)
        {
            System.out.print(" ");
        }
        for(k=(i*2);k>=0;k--)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}