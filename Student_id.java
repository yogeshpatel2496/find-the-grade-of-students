import java.util.*;
class Student
{
	int id,total,i;
	float avg;
	
	//serial no of the student is automatic set and Subjectsject no are common for all student;
	static int serialNo,numberOfSubjects;
	String firstName,lastName,grade;
	
	//initilise the object of student;
	Student ()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first name of the " + (serialNo+1) + " student");
		firstName = s.next();
		
		System.out.println("Enter the last name of the "+ (serialNo+1) + " student");
		lastName = s.next();
		
		id = ++serialNo;
		int Subjects[] = new int [numberOfSubjects];
		
		System.out.println("Enter the marks of the student out of 100 marks");
	
		for(i=0;i<numberOfSubjects;i++)
		{
			System.out.println("Enter the marks of  "+ (i+1) +" subjects");
			Subjects[i]=s.nextInt();
			Check(Subjects[i]);
			total=total+Subjects[i];
		}
		avg=total/numberOfSubjects;
 	}
	
	//for set the grade of the student
	void Setgrade()
	{
		if(grade=="fail")
		{
			grade = "fail";
		}
		else if(avg>=85)
		{
			grade = "A";
		}
		else if(avg>=65)
		{
			grade = "B";
		}
		else if(avg>=50)
		{
			grade = "C";
		}
		else if(avg>=40)
		{
			grade = "D";
		}
		else
		{
			grade = "E";
		}
	}
	
	//to check the mark is valid out of 100;
	void Check(int num)
	{
		if(num>100)
		{
			System.out.println("wrong input...\nplease Enter the marks between 1-100");
			System.exit(0);
		}
		else if(num<33)
		{
			grade = "fail";
		}
	}
	
	//to show the detail of student;
	void Display()
	{
		System.out.println(id + "\t |"+ firstName + " " + lastName + "\t |" + grade + "\t |" + avg +"%");
	}
}

class Student_id
{
	public static void main(String [] args)
	{
		int numberOfStudent,id,i,numberOfSubjects;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number of student");
		numberOfStudent = sc.nextInt();
	
		Student s[]= new Student [numberOfStudent];
		
		System.out.println("Enter the number of subjects");
		Student.numberOfSubjects = sc.nextInt();
		
		// to initilise object and set the grade;
		for(i=0;i<numberOfStudent;i++)
		{
			s[i]= new Student();
			s[i].Setgrade();
		}
		
		// to display result of the students;	
		for(i=0;i<numberOfStudent;i++)
		{
			s[i].Display();
		}
	}
}
