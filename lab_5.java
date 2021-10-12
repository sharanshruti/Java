import java.util.Scanner;

interface Bank{
	String name = "SBI";
	abstract void depositMoney(double d);
	abstract double getTotal();
}

class Saving implements Bank{
	double principalAmount;
	static double interestRate;

	public Saving(double x,double y){
		principalAmount = x;
		interestRate = y;
	}
	public void depositMoney(double d){
		double result = principalAmount+d;
	}

	public double getTotal(){
		double total = principalAmount+((interestRate)/100.00)*principalAmount;	
		System.out.println("Total Amount in Saving Account = "+total);
		System.out.println("                                 ");
		return total;
	}

}

class PPF implements Bank{
	double principalAmount;
	static double interestRate;

	public PPF(double x,double y){
		principalAmount = x;
		interestRate = y;
	}
	public void depositMoney(double d){
		double result = principalAmount+d;
	}

	public double getTotal(){
		double total = principalAmount+((interestRate)/100.0)*principalAmount;
		System.out.println("Total Amount in PPF Account = "+total);
		return total;	
	}

}

class lab_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount for Saving Account: ");
		double a = sc.nextDouble();
		System.out.println("Enter Principal Amount for PPF Account: ");
		double b = sc.nextDouble();
		Saving s = new Saving(a,3.5);
		PPF p = new PPF(b,7.5);
		System.out.println("               ");
		s.getTotal();
		p.getTotal();

	}
}