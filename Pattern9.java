import java.util.*;
class Pattern9
{
    public static void main(String[] args)

    {
        int j,i,k,num;
        System.out.println("enter size of peramid");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
       for(i=1;i<num;i++)
       {
            for(j=i;j<num;j++)
            {
             System.out.print(" ");
              }
            for(k=1;k<(i*2);k++)
            {
                 System.out.print("*");
                 
           }
                
           System.out.println();
             
       }
    }
}