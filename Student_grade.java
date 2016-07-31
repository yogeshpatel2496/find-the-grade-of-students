import java.util.*;
class Student
{
	int id,total,i;
	float avg;
	
	//Serial no of the student is automatically set and number of subjects are common for all student;
	static int serialNo,noOfSubjects;
	
	String firstName, lastName, grade;
	
	//initilise the object of student;
	Student () 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first name of the " + (serialNo+1) + " student");
		firstName = s.next();
		
		System.out.println("Enter the last name of the "+ (serialNo+1) + " student");
		lastName = s.next();
		
		id = ++serialNo;
		int sub[] = new int [noOfSubjects];
		
		System.out.println("Enter the marks of the student out of 100 marks");
		
		for(i=0;i<noOfSubjects;i++)
		{
			System.out.println("Enter the marks of  "+ (i+1) +" subject");
			sub[i]=s.nextInt();
			Check(sub[i]);
			total=total+sub[i];
		}
		avg=total/noOfSubjects;
 	}
	
	void Setgrade()//for set the grade of the student
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
	
	void Check(int num)//to check the mark is valid out of 100;
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

	void Display()//to show the detail of student;
	{
		System.out.println(id + "\t |"+ firstName + " " + lastName + "\t |" + grade + "\t |" + avg +"%");
	}
}

class Student_grade
{
	public static void main(String [] args)
	{
		int num,id,i,subno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student");
		num = sc.nextInt();
		Student s[]= new Student [num];
		
		System.out.println("Enter the number of subject");
		subno = sc.nextInt();
		s[0].noOfSubjects = subno;
		
		for(i=0;i<num;i++)
		{
			s[i]= new Student();
			s[i].Setgrade();
		}
		
		System.out.println("Enter the no which id detail is to print");
		id = sc.nextInt();
		
		for(i=0;i<num;i++)
		{
			if(s[i].id==id)
			{
				s[i].Display();
			}
		}
	}
}
