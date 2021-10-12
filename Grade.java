import java.util.Scanner;

class Student{
	String Name;
	int marks1;
	int marks2;
	double percentage; 
	public void takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("========================");
		System.out.print("Enter name:");		
		Name = sc.nextLine();
		System.out.print("Enter marks1:");
		marks1 = sc.nextInt();
		System.out.print("Enter marks2:");
		marks2 = sc.nextInt();
	}
	public void calculatePercentage()
	{
		percentage = ((marks1+marks2)/2.0);
	}
	public void displayRecord()
	{
		System.out.println("========================");
		System.out.println("\t\tStudent name:"+Name);
		System.out.println("Marks 1: "+marks1);
		System.out.println("Marks 2: "+marks2);
		System.out.println("Percentage: "+percentage+"%");
	}
}

class Grade{
	public static void main(String[] args){
		Student st1 = new Student();
		Student st2 = new Student();
		st1.takeInput();
		st1.calculatePercentage();
		st1.displayRecord();
		st2.takeInput();
		st2.calculatePercentage();
		st2.displayRecord();

	}
}