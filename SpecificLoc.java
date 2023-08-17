import java.util.*;
class SpecificLoc
{
    public static void main(String[] args)
    {
        int[] arr=new int[10];
	  int a,key,loc,i,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num=sc.nextInt();
        System.out.println("enter the "+num );
        System.out.print("elements");
        for(a=0;a<num;a++)
        {
            arr[a]=sc.nextInt();
        }   
        System.out.println("Enter a element to be inserted");
        key=sc.nextInt();
        System.out.println("Enter the location to be inserted the above element");
        loc=sc.nextInt();

        for(i=num-1;i>=loc;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[loc]=key;
		System.out.println("after inserting item"); 
		for(b=0;b<num+1;b++)
		{
		System.out.println(arr[b]);
		}
    }
}