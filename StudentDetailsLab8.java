interface Exam {
	
	void Percent_cal();
}

class Student {
	
	String name;
	int roll_no, Marks1, Marks2;
    
	Student(String n, int rn, int m1, int m2) {
        

		
		name = n;
		roll_no = rn;
		Marks1 = m1;
		Marks2 = m2;
	}
	
	void show()	{
		
		System.out.println("Student Name : "+name);
		System.out.println("Roll no : "+roll_no);
		System.out.println("Marks1 : "+Marks1);
		System.out.println("Marks2 : "+Marks2);
	}
}

class Result extends Student implements Exam {
	
	float per;
	Result(String n,int rn,int m1,int m2) {
		
		super(n,rn,m1,m2);
	}
	
	public void Percent_cal() {
		
		int tot = Marks1 + Marks2;
		per = (float)tot / 2;
	}
	
	void display() {
		
		show();
		System.out.println("Percentage = "+per);
	}	
	
}

public class StudentDetailsLab8 {
	
	public static void main (String[] args) {
        

		
		Result r = new Result("Anagha",11,75,95);
		r.Percent_cal();
		r.display();
	}
    
}