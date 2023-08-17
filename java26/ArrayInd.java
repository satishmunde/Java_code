class ArrayInd
{
public static void main(String[] args)
{
int[] arr={1,2,3,4,5};


System.out.println("Value of"+arr[0]);
System.out.println("Value of"+arr[1]);
try
{
System.out.println("Value of"+arr[6]);
}
catch(Exception e1)
{
System.out.println("Exception is "+e1);
}
System.out.println("Value of"+arr[3]);
System.out.println("Value of"+arr[4]);
}
}