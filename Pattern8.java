import java.util.*;
class Pattern8
{
    public static void main(String[] args)
    {
        int num,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of pattern");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            for(j=num;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}