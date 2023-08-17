import java.util.*;
class Pattern91
{
    public static void main(String[] args)
    {
        int num,i,j,k,l;
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
                System.out.print("*");
            }
            for(l=2;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
         
    }
}