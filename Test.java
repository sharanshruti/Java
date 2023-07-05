//class person - person attributes - on our own 
//two more class - inherited -staff-student
//class subclass exteds superclass
import java.util.Scanner;

public class Person{
	String name;
	int age;
	char gender;
	int date;
	String month;
	int year;

	public void dateOfBirth(){
		System.out.println("Date of Birth: %d %s %d\n",date,month,year);
	}
	public void displayRecord(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	}
} 

public class Staff extends Person{
	int workingYears;
	double salary;
	public void displayRecordStaff(){
		System.out.println("Years at School: "+workingYears);
		System.out.println("Salary: "+salary);
	}
}

public class Student extends Person{
	int grade;
	long contact;
	public void displayRecordStudent(){
		System.out.println("Grade: "+grade);
		System.out.println("Contact No.: "+contact);
	}

}  

public class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Gender (M/F/O): ");
		gender = sc.next().charAt(0);
		System.out.println("Enter Date(of your birth): ");
		date = sc.nextInt();
		System.out.println("Enter month(of your birth): ");
		month = sc.nextLine(); 
		System.out.println("Enter year(of your birth): ");
		year = sc.nextInt();
		Staff s1 = new Staff();
		System.out.println("Enter your working years at the school: ");
		s1.workingYears = sc.nextInt();
		System.out.println("Enter your salary: ");
		s1.salary = sc.nextDouble();
		Student st1 = new Student();
		System.out.println("Enter the grade you are in (1-12): ");
		st1.grade = sc.nextInt();
		System.out.println("Enter your contact no.: ");
		st1.contact = sc.nextLong();
		displayRecord();
		s1.displayRecordStaff();
		st1.displayRecordStudent();

	}
}
