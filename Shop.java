import java.util.*;

class Items{
	int itemCode;
	String itemName;
	double unitPrice;
	int stockRemaining;
	int itemLimit;
	public Items(int itemCode, String itemName, double unitPrice, int stockRemaining, int itemLimit){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.stockRemaining = stockRemaining;
		this.itemLimit = itemLimit;
	}
	public String toString(){
		return("Item Code: "+itemCode+" Item Name: "+itemName+" Unit Price: "+unitPrice+" Stock Remaining: "+stockRemaining+" Item Limit: "+itemLimit);
	}
}

class User{
	String name;
	double budget;
	public User(String name, double budget){
		this.name = name;
		this.budget = budget;
	}
}

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}


class Shop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Items [] itemArray = new Items[4];
		itemArray[0] = new Items(1,"TV",10000,3,2);
		itemArray[1] = new Items(2,"Mouse",1000,7,3);
		itemArray[2] = new Items(3,"HeadPhone",2000,1,6);
		itemArray[3] = new Items(4,"MObile",5000,5,1);	

		User u = new User("xyz",10000);
		int x =0;
		int choice;
		while(x == 0){
			System.out.println("1. Display Items");
			System.out.println("2. Buy Item");
			System.out.println("3. Exit");
            System.out.println("Enter choice: ");
			choice = sc.nextInt();
            try {
                if (choice < 1 && choice > 3) {
                    throw new MyException("Your choice is invalid");
                }
                if (choice == 1) {
                    for (int i = 0; i < 4; i++) {
                        System.out.println(itemArray[i]);
                    }
                }
                if (choice == 2) {

                    try {
                        System.out.println("Enter the item code and quantity");
                        int code, quantity;
                        code = sc.nextInt();
                        quantity = sc.nextInt();
                        if (code < 1 || code > 4) {
                            throw new MyException("Your item not found");
                        }
                        if (quantity > itemArray[code - 1].stockRemaining) {
                            throw new MyException("Item is OutofStock");
                        }
                        if (quantity > itemArray[code - 1].itemLimit) {
                            throw new MyException("Item is Limited");
                        }
                        if (u.budget < itemArray[code - 1].unitPrice * quantity) {
                            throw new MyException("Budget");
                        }
                        itemArray[code - 1].stockRemaining -= quantity;
                        u.budget -= (itemArray[code - 1].unitPrice * quantity);
                    } catch (MyException exp) {
                        System.out.println(exp.toString());
                    }
                }
                if (choice == 3) {
                	x = 1;
                	System.out.println("Thank You");
                    
                }

            } catch (MyException exp) {

                System.out.println(exp.getMessage());
            }

        }
        sc.close();
    }
}					
		
	
