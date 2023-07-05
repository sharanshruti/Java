import java.util.Scanner;
public class employeedetails
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.nextLine();
		System.out.println("Enter id:");
		int empid = sc.nextInt();
		System.out.println("Enter salary:")
		double salary = sc.nextDouble();

		System.out.println("Name:"+name);
		System.out.println("emp id:"+empid);
		System.out.println("salary:"+salary);

		if(salary>=80000)
		{
			System.out.println("Employee grade: A");
		}
		else if((79999>=salary) && (salary>=50000) )
		{
			System.out.println("Employee grade: B");	
		}
		else if((49999>=salary) && (salary>=30000))
		{
			System.out.println("Employee grade: C");
		}
		else
		{
			System.out.println("Employee grade: D");
		} 

	} 
} 