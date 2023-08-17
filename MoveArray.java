import java.util.*;
class MoveArray
{
    public static void main(String[] args)
    {
        int[] arr1=new int[10];
        int[] arr2=new int[4];
        int a,b,c,d,s,n,i,loc;
         
         System.out.println("Enter the size of first array");
         Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
         for(a=0;a<n;a++)
         {
            arr1[a]=sc.nextInt();
         }
        System.out.println("element of first elements is");
        for(b=0;b<n;b++)
        {
            System.out.println(arr1[b]);
        }
        System.out.println("Enter element of second array");
        for(c=0;c<4;c++)
        {
            arr2[c]=sc.nextInt();
        }
        System.out.println("elements of second array");
        for(d=0;d<4;d++)
        {
            System.out.println(arr2[d]);
        }

        System.out.println("Enter a loc for you want ot add a second array in first array");
        loc=sc.nextInt();

        for(i=n-1;i>=loc;i--)
        {
            arr1[i+4]=arr1[i];
        	
	  }
        for(int j=0;j<4;j++)
        {
            arr1[loc+j]=arr2[i];
  System.out.println(arr1[loc+j]);
        }
      
        for(int f=0;f>10;f++)
        {
            System.out.println(arr1[f]);
        }
    }   
}