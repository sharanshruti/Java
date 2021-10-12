import java.util.Scanner;

class SportsPerson{
	protected String name;
	protected String address;
	void inputSportsPerson(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name =sc.nextLine();
		System.out.println("Enter Address:");
		address=sc.nextLine();
	}
	void displaySportsPerson(){
		System.out.println("==========================");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("==========================");
	}
}

class Cricketer extends SportsPerson{
	static String type = "Cricketer";
	protected int matchesPlayed;
	protected int catches;
	void inputCricketer(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of matches played:");
		matchesPlayed = sc.nextInt();
		System.out.println("Enter no. of catches:");
		catches = sc.nextInt();
	}
	void displayCricketer(){
		inputSportsPerson();
		System.out.println("==========================");
		System.out.println(type);
		displaySportsPerson();
		System.out.println("Matches Played "+matchesPlayed);
		System.out.println("Catches "+catches);
		System.out.println("==========================");
	}
	
}

class Footballer extends SportsPerson{
	static String type = "Footballer";
	protected int matchesPlayed;
	protected int goals;
	protected int tackles;
	void inputFootballer(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of matches played:");
		matchesPlayed = sc.nextInt();
		System.out.println("Enter no. of goals:");
		goals = sc.nextInt();
		System.out.println("Enter no. of tackles:");
		tackles = sc.nextInt();
	}
	void displayFootballer(){
		inputSportsPerson();
		System.out.println("==========================");
		System.out.println(type);
		displaySportsPerson();
		System.out.println("Matches Played "+matchesPlayed);
		System.out.println("Goals "+goals);
		System.out.println("Tackles "+tackles);
		System.out.println("==========================");
	}
	
}

class Batsman extends Cricketer{
	protected int runs;
	protected double highest;
	void inputBatsman(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter runs:");
		runs = sc.nextInt();
		System.out.println("Enter highest:");
		highest = sc.nextDouble();
	}
	void displayBatsmann(){
		inputCricketer();
		System.out.println("==========================");
		displayCricketer();
		System.out.println("Runs "+runs);
		System.out.println("Highest "+highest);
		System.out.println("==========================");
	}
	
}

class Bowler extends Cricketer{
	protected int wickets;
	protected double strikeRate;
	void inputBowler(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of wickets taken:");
		wickets = sc.nextInt();
		System.out.println("Enter Strike Rate:");
		strikeRate = sc.nextDouble();
	}
	void displayBowler(){
		inputCricketer();
		System.out.println("==========================");
		displayCricketer();
		System.out.println("Wickets "+wickets);
		System.out.println("Strike Rate "+strikeRate);
		System.out.println("==========================");
	}
	
}

class Striker extends Footballer{
	protected int goalsScored;
	protected int assist;
	void inputStriker(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of goals scored:");
		goalsScored = sc.nextInt();
		System.out.println("Enter no. of assist:");
		assist = sc.nextInt();
	}
	void displayStriker(){
		inputFootballer();
		System.out.println("==========================");
		displayFootballer();
		System.out.println("Goals Scored "+goalsScored);
		System.out.println("Assist "+assist);
		System.out.println("==========================");
	}
	
}

class Defender extends Footballer{
	protected int tackles;
	protected int headers;
	void inputDefender(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of tackles:");
		tackles = sc.nextInt();
		System.out.println("Enter no. of headers:");
		headers = sc.nextInt();
	}
	void displayDefender(){
		inputFootballer();
		System.out.println("==========================");
		displayFootballer();
		System.out.println("Tackles "+tackles);
		System.out.println("Headers "+headers);
		System.out.println("==========================");
	}
		
}

class WicketKeeper extends Batsman{
	protected int stumpings;
	void inputWK(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of stumpings:");
		stumpings = sc.nextInt();
	}
	void displayWK(){
		inputBatsman();
		System.out.println("==========================");
		displayBatsmann();
		System.out.println("Stumpings "+stumpings);
		System.out.println("==========================");
	}
	
}

class GoalKeeper extends Defender{
	protected int saves;
	protected int cleanSheets;
	void inputGK(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of saves:");
		saves = sc.nextInt();
		System.out.println("Enter no. of cleansheets:");
		cleanSheets = sc.nextInt();
	}
	void displayGK(){
		inputDefender();
		System.out.println("==========================");
		displayDefender();
		System.out.println("Saves "+saves);
		System.out.println("Clean sheets "+cleanSheets);
		System.out.println("==========================");
	}
	
}

class MainClass{
	public static void main(String[] args) {
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("type of object you want to create: 1)SportsPerson 2)Cricketer 3)Batsman 4)Bowler 5)WicketKeeper 6)Footballer 7)Striker 8)Defender 9)Goalkeeper");
		System.out.println("Enter digit: ");
		d = sc.nextInt();
		if (d == 1){
			SportsPerson s1 = new SportsPerson();
			s1.inputSportsPerson();
			s1.displaySportsPerson();
		}
		else if(d == 2){
			Cricketer c1 = new Cricketer();
			c1.inputCricketer();
			c1.displayCricketer();
		}
		else if(d == 3){
			Batsman b1 = new Batsman();
			b1.inputBatsman();
			b1.displayBatsmann();
		}
		else if(d == 4){
			Bowler b = new Bowler();
			b.inputBowler();
			b.displayBowler();
		}
		else if(d == 5){
			WicketKeeper w1 = new WicketKeeper();
			w1.inputWK();
			w1.displayWK(); 
		}
		else if(d == 6){
			Footballer f = new Footballer();
			f.inputFootballer();
			f.displayFootballer();
		}
		else if(d == 7){
			Striker s = new Striker();
			s.inputStriker();
			s.displayStriker();
		}
		else if(d == 8){
			Defender d1 = new Defender();
			d1.inputDefender();
			d1.displayDefender();
		}
		else if(d == 9){
			GoalKeeper g = new GoalKeeper();
			g.inputGK();
			g.displayGK();
		}
		else{
			System.out.println("Invalid input.");
		}


	}
}