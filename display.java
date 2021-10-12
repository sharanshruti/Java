import java.util.Scanner;

class studentRecord{
	int rollNo;
	String name;
	String department;
	
	public studentRecord(){
		rollNo = -1;
		name = "000";
		department = "000";
	}

	public studentRecord(int r){
		rollNo = r;
		name = "000";
		department = "000";
	}

	public studentRecord(int r,String n){

		rollNo = r;
		name = n;
		department = "000";
	}
	public studentRecord(int r,String n,String d){
		rollNo = r;
		name = n;
		department = d;
	}

	public void displayRecord(){
		System.out.println("Roll No. :"+rollNo);
		System.out.println("Name :"+name);
		System.out.println("Department :"+department);
		System.out.println("================");
		System.out.println("                ");
	}
}


class display{
	public static void main(String[] args) {
		studentRecord s1 = new studentRecord();
		studentRecord s2 = new studentRecord(1);
		studentRecord s3 = new studentRecord(2,"shruti");
		studentRecord s4 = new studentRecord(3,"naina","ece");
		System.out.println("\t\tStudent Record");
		s1.displayRecord();
		s2.displayRecord();
		s3.displayRecord();
		s4.displayRecord();
	}
}