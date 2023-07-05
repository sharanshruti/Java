import java.util.Scanner;

class operation{
	int operand1;
    String operator;
	int operand2;
	double result;

	public operation(int op1,String op,int op2){
		operand1 = op1;
		operator = op;
		operand2 = op2;
	}

	public void calculateValue(){
		if (operator.equals("+")){
			result = operand1+operand2;
		}
		else if(operator.equals("-")){
			result = operand1-operand2;
		} 
		else{
			System.out.println("Incorrect input.");
		}
	}

	public void displayResult(){
		System.out.println("Result :"+result);
	}

}
class result{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operand1 :");
		int op1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Operator :");
		String op = sc.nextLine();		
		System.out.println("Enter operand2 :");
		int op2 = sc.nextInt();
		operation o1 = new operation(op1,op,op2);
		o1.calculateValue();
		o1.displayResult();
	}
	
}