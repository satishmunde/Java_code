import java.util.*;
class Result1
{
	String result;
	int[] sub=new int[5];
	int total;
	float percentage;
	char grade;

public void getMarks()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the marks of 5 Subject");
		for(int i=0;i<5;i++)
			{
				sub [i]=scan.nextInt();
			}
}


public void calculateMarks()
{
		for(int j=0;j<5;j++)
			{
				total=total+sub[j];
			}
				percentage=total/5;
}

 public void showResult()
{
	System.out.println("total marks="+total);
	System.out.println("percentage="+percentage);
		if(percentage>=35)
			{
				System.out.println("Result =pass");
			}
		else
			{
				System.out.println("Result=fail");
			}
//for grade
		if (percentage <=35)
			{	
				System.out.println("Grade=0");
			}
		else if (percentage<=60 && percentage>=35)
			{
				System.out.println("Grade=B");
			}
		else if(percentage<=80 && percentage>=60)
			{
				System.out.println("Grade=B");
			}
		else if(percentage>=80 && percentage<=100)
			{
				System.out.println("Grade=A");
			}
		else
			{
				System.out.println("No Grade");
			}
}

public static void main(String[] args)
{
Result1 R1=new Result1();
Result1 R2=new Result1();
R1.getMarks();
R1.calculateMarks();
R1.showResult();
R2.getMarks();
R2.calculateMarks();
R2.showResult();
}
}