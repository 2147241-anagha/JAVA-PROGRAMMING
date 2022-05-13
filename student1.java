import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;

class studentDetails
{
	Scanner sc = new Scanner(System.in);
	int tenth_grade , twelveth_grade,bach_grade,stu_age,stu_distance;
	String stu_id;
	static int years;
	static String university_address ="Bangalore"; //static variable
	String stu_name,stu_email, stu_ph , dob ;
	
	
	static //static block of code
    {
        
        System.out.print("***Welcome to Student Management System**\n");
    }
	void studentDetail() throws ParseException
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
		    System.out.println("Enter student's years");
			years = sc.nextInt();
			System.out.println("Enter student phone number");
			stu_ph = sc.next();
			if(stu_ph.length() != 10)					//string method
			{
				System.out.println("Please enter 10 digits");
				studentDetail();
				
			}
			System.out.println("Enter student email");
			stu_email = sc.next();
			System.out.println("Enter student's 10th grade");
			tenth_grade = sc.nextInt();
			System.out.println("Enter student's 12th grade");
			twelveth_grade = sc.nextInt();
			System.out.println("Enter student's bachelor's grade");
			bach_grade = sc.nextInt();
			System.out.println("Enter how much distance you travel everyday");
		    stu_distance = sc.nextInt();
		
		    }
			else
			{
				System.out.println("Age should be less than 18");
				studentDetail();
			}
			
		}
		
		

	
		private void exit(int i) {
		// TODO Auto-generated method stub
		
	}




		static void stu_distance(int distance) //static method
		{
			System.out.println("Travelling expenses are " +distance * 100);
		}
	 void printstudentDetails()
	{
		System.out.println("Student ID is"+this.stu_id);
		System.out.println("Student name is"+this.stu_name);
		System.out.println("Student age is"+this.stu_age);
		 System.out.println("Student's date of Birth is"+this.dob+"\t"); 
		System.out.println("Student Date of Joining is"+this.years);
		System.out.println("Student phone number is"+this.stu_ph);
		System.out.println("Student email is"+this.stu_email);
		System.out.println("Student 10th grade is"+this.tenth_grade);
		System.out.println("Student 12th grade is"+this.twelveth_grade);
		System.out.println("Student's bachelor's grade is"+this.bach_grade);
		System.out.println("University's address "+university_address);
		stu_distance(stu_distance);
		promotionclass obj1 = new promotionclass();
		obj1.stu_class();
		
	}
	void updateDetails()
	{

		int  choice, tenth_grade , twelveth_grade,bach_grade,master_grade,stu_age,dob;
		String stu_name,stu_email, stu_ph;
		System.out.println("\n\n\n\n1:Update Student name\n2:Update Student phone number\n 3:Update Student Email\n 4:Update 10th grade\n 5:Update 12th grade\n 6:Update bachelor's grade\n 7:Exit");
		
		boolean quit = false;
		do {
		System.out.println("\nEnter your choice  ");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter new Student name");
			this.stu_name = sc.next();
			printstudentDetails();
			break;
		case 2:
			System.out.println("Enter new Student phone number");
			this.stu_ph = sc.next();
			printstudentDetails();
			break;
			
		case 3:
			System.out.println("Enter new Student email");
			this.stu_ph = sc.next();
			printstudentDetails();
			break;
		case 4:
			System.out.println("Enter new Student 10th grade");
			this.stu_ph = sc.next();
			printstudentDetails();
			break;
		case 5:
			System.out.println("Enter new Student 12th grade");
			this.stu_ph = sc.next();
			printstudentDetails();
			break;
		case 6:
			System.out.println("Enter new Student bachelor's grade");
			this.stu_ph = sc.next();
			printstudentDetails();
			break;
		
		case 7:
			quit = true;
			break;
		default:
			System.out.println("\nInvalid Option");
            break;
			
			}	
			
		}
		while (!quit);
		
		
	}
}


class promotionclass
{
	static String stu_class;
	StringBuffer sb=new StringBuffer();   //String Buffer object
	
	
	
	void stu_class()
	{
	int length;
	if(studentDetails.years <= 2)
	{
		sb.append("First Year");
		stu_class = " First Year ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " first year");   //insert method of string buffer
		System.out.println("Class of the student is: "+sb);
	}
	else if(studentDetails.years > 2 && studentDetails.years <= 4)
	{
		sb.append("	Second year");
		stu_class = " Second Year ";
		System.out.println("Class of the student is: " +sb);
	}
	else if(studentDetails.years > 4 && studentDetails.years <= 6)
	{
		sb.append("Thirs Year");
		stu_class = " Third Year ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " Thirs Year");   //insert method of string buffer
		System.out.println("Class of the student is: "+sb);
	}
	else if(studentDetails.years > 6 && studentDetails.years <= 8)
	{
		sb.append(" Fourth Year");
		stu_class = " Fourth Year ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " fourth year");   //insert method of string buffer
		System.out.println("Class of the student is::"+sb);
	}
	else if(studentDetails.years > 8 && studentDetails.years <= 10)
	{
		sb.append("Fifth Year");
		stu_class = " Fifth Year ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " Fifth Year");   //insert method of string buffer
		System.out.println("Class of the student is:: "+sb);
	}
	else if(studentDetails.years > 10 && studentDetails.years <= 12)
	{
		sb.append("Sixth Semester");
		stu_class = " Sisth Semester ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " Sixth Semester");   //insert method of string buffer
		System.out.println("Class of the student is:: "+sb);
	}
	else if(studentDetails.years > 12 && studentDetails.years <= 14)
	{
		sb.append("Seventh Semester");
		stu_class = " Seventh semester ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " seventh semester");   //insert method of string buffer
		System.out.println("Class of the student is: "+sb);
	}
	else if(studentDetails.years > 14 && studentDetails.years <= 16)
	{
		sb.append("Eighth Semester");
		stu_class = " Eighth semester ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " eighth semester");   //insert method of string buffer
		System.out.println("Class of the student is:: "+sb);
	}
	else if(studentDetails.years > 16 && studentDetails.years <= 18)
	{
		sb.append("Ninth Semester");
		stu_class = " Ninth Semester ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " officer");   //insert method of string buffer
		System.out.println("Ninth Semester: "+sb);
	}
	else if(studentDetails.years > 18 && studentDetails.years <= 20)
	{
		sb.append("Tenth Semester");
		stu_class = " Tenth Semester ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " Tenth Semester");   //insert method of string buffer
		System.out.println("Class of the student is: "+sb);
	}
	else if(studentDetails.years > 20 && studentDetails.years <= 22)
	{
		sb.append(" Eleventh Semester");
		stu_class = " Eleventh Semester ";
		length = sb.length();		      //length method of string  buffer
		sb.insert(length, " Eleventh Semester");   //insert method of string buffer
		System.out.println("Class of the student is:"+sb);
	}
	
}
}


class marksconstructor
{

	private static final int Grade = 0;
	Scanner sc =new Scanner(System.in);
	private static int marks;

	marksconstructor(int marks)
	{
		
		int Grade;
		System.out.println("Enter Grade");
		Grade = sc.nextInt();
		marks obj = new marks();
		obj.mark(marks,	Grade);
	}
	
	marksconstructor(int marks,String performance )
	{
		this(marks);
		int  grade ,performance;
		float average ;
		System.out.println("Enter grade ");
		grade = sc.nextInt();
		System.out.println("Enter performance");
		performance = sc.nextInt();
		System.out.println("Enter average");
		average = sc.nextInt();
		salary obj1 = new salary();
		obj1.marks(marks,this.performance,grade, performance, average);
		
		
		
		
	}
	
	
}
class marks
{
	int marks;
	String name;
	void marksCalculation()
	{
		
		if(promotionclass.stu_class == " First Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		else if(promotionclass.stu_class == " 	Second Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		else if(promotionclass.stu_class == " 	Third Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		else if(promotionclass.stu_class == " Fourth Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		else if(promotionclass.stu_class == " Fifth Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		else if(promotionclass.stu_class == " Sixth Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		else if(promotionclass.stu_class == " Seventh Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		else if(promotionclass.stu_class == " Eighth Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		else if(promotionclass.stu_class == " Ninth Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		else if(promotionclass.stu_class == " Tenth Semester" )
		{
			marks = 90;
			System.out.println("Marks= "+marks);
			marksconstructor obj1 = new marksconstructor(marks);
			
		}
		
		
		
	}
	
	void marks1(int marks , int grade)
	{
		int total = marks + grade;
		System.out.println("Final performance status is"+total);
	}
	
	void marks1(int marks ,int grade, float perfromance , int grade1 , int average )
	{
		float total = marks + grade +performance + grade1 + average;
		System.out.println("Final performance status is"+total);
	}
	
	
}


public class student1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ob;
		System.out.println("Enter number of objects to be created");
		ob = sc.nextInt();
		for(int i=0;i < ob;i++)
		{
		studentDetails obj = new studentDetails();
		 obj.studentDetail();
			obj.printstudentDetails();
			obj.updateDetails();
		}
		
		}
		
		}