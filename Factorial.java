class Factorial
{
    public static void main(String[] args)
    {
	    long fact=1,a;
	    System.out.println(" The Factorial of 1 to 10 is as Follow ");
	    for(a=1;a<=10;a++)
		    {
                fact=fact*a;
                System.out.print("Factorial of "+a);
                System.out.print("\t is"+fact);
                System.out.println("");
                
            }
    }
}