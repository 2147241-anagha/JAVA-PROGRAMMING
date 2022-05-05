package student11;


import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Scanner;

class studentDetails1
{
	Scanner sc = new Scanner(System.in);
	int tenth_grade , twelveth_grade,bach_grade,stu_age,stu_fee;
	String stu_id;
	static int performance_percent;
	static String place_address ="Bangalore"; //static variable
	String stu_name,stu_email, stu_ph , dob ;
	
	
	static //static block of code
    {
        
        System.out.print("***Welcome to Student Management System**\n");
    }
	void studentDetail1() throws ParseException
	{
		System.out.println("Enter student ID");
		stu_id = sc.next();
			System.out.println("Enter student name");
			stu_name = sc.next();
			System.out.println("Enter student's age");
			stu_age = sc.nextInt();
			if(stu_age >= 18)
			{
			System.out.println("Enter student's date of Birth");
			dob=sc.next();  
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dob);  
		    System.out.println("Enter student's performance in percentage");
			performance_percent = sc.nextInt();
			System.out.println("Enter student phone number");
			stu_ph = sc.next();
			if(stu_ph.length() != 10)					//string method
			{
				System.out.println("Please enter 10 digits");
				studentDetail1();
				
			}
			System.out.println("Enter student email");
			stu_email = sc.next();
			System.out.println("Enter student's 10th grade");
			tenth_grade = sc.nextInt();
			System.out.println("Enter student's 12th grade");
			twelveth_grade = sc.nextInt();
		
		    }
			else
			{
				System.out.println("Age should be less than 18");
				studentDetail1();
			}
			
		}
		
		

	
		private void exit(int i) {
		// TODO Auto-generated method stub
		
	}




		static void student_expenses(int exp) //static method
		{
			System.out.println("Student expenses are " +exp);
		}
	 void printstudentDetails()
	{
		System.out.println("Student ID is"+this.stu_id);
		System.out.println("Student name is"+this.stu_name);
		System.out.println("Student age is"+this.stu_age);
		 System.out.println("Student's date of Birth is"+this.dob+"\t"); 
		System.out.println("Student's performance is"+this.performance_percent);
		System.out.println("Student phone number is"+this.stu_ph);
		System.out.println("Student email is"+this.stu_email);
		System.out.println("Student 10th grade is"+this.tenth_grade);
		System.out.println("Student 12th grade is"+this.twelveth_grade);
		System.out.println("University's address "+university_address);
		student_expenses(student_expenses);
	}
	


public class student2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ob;
		System.out.println("Enter number of objects to be created");
		ob = sc.nextInt();
		for(int i=0;i < ob;i++)
		{
		studentDetail1 obj = new studentDetail1();
		 obj.studentDetail1();
			obj.printstudentDetails();
			
		}
		
		}
		
		}