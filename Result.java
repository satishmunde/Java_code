import java.util.*;
class Result
{
	int rollno,s1,s2,s3,s4,s5;
	float total,per;
	String result1;
	char grade;
	
	public void set_data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno and five subject marks");
		rollno=sc.nextInt();
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
	}
	
	public void cal_data()
	{
		total=s1+s2+s3+s4+s5;
		per=total/5;
		
		if(per>=75)
		{
			grade=('A');
		}
		else if(per>=60)
		{
			grade=('B');
		}
		else if(per>=45)
		{
			grade=('C');
		}
		else if(per>=35)
		{
			grade=('D');
		}	
		if(s1>=35 && s2>=35 && s3>=35 && s4>=35 && s5>=35)
		{
			result1=("Pass");
		}
		else 
		{
			result1=("Fail");
		}
	}
	
	public void show_result()
	{
		
		System.out.println("Your roll Number is "+rollno);
		System.out.println("Your Five subject marks are ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(" Your Grade is "+grade);
		System.out.println("Your result is ");
		if(result1=="Pass")
		{
			System.out.println("You have Pass the Exam and you are eligible to take admission in next class");
		}
		else
		{
			System.out.println("You have Fail the Exam and you are not eligible to take admission in next class");
		}
	}
	

	public static void main(String[] args)
	{
		
		Result r1=new Result();
		
		
		r1.set_data();
		r1.cal_data();
		r1.show_result();
	}
}
	
	
