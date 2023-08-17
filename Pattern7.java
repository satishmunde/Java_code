class Pattern7
{
    public static void main(String[] args)
    {
        int i,k,j;
        for(i=1;i<=5;i++)
        { 
            for(j=5;j>=i;j--)
			{
		 System.out.print(" ");  
}    
          for(k=1;k<=i;k++)
                {
                    System.out.print("*");
                }
            
            System.out.println("");
        }
        int a,b,c;
        for(a=5;a>=1;a--)
        { 
            for(b=a;b<=5;b++)
			{
		 System.out.print(" ");  
}    
          for(c=a;c>=1;c--)
                {
                    System.out.print("*");
                }
            
            System.out.println("");
        }
    }
}