import java.util.Scanner;
class MenuClass {

	public void DisplayMenu(){
		System.out.println("Welcome to NatUni Bank! Would you like to:");
		System.out.println("1) Open new account");
		System.out.println("2) Log into existing account");
		System.out.println("3) Help");
		System.out.println("4) Quit");
	}
	
	public int GetUserChoice(){
		Scanner scanner = new Scanner(System.in);
		int choice;
		choice = scanner.nextInt();
		return choice;
	}
	
	public void UserSelection(int choice){
		switch (choice){
			case 1:
			System.out.println("||_____Open New Account Menu_______||");
			break;
			
			case 2:
			System.out.println("||________Your Account Menu________||");
			break;
			
			case 3:
			System.out.println("||__________Help Menu______________||");
			break;
			
			case 4:
			System.out.println("Good Bye!!!!");
			break;
			
			default:
			System.out.println("Please select an menu item from 1 to 4");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
}