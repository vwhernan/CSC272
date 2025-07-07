class TestClass {
    public static void main(String[] args) {
        
		int userchoice = 0;
		MenuClass customer = new MenuClass();
		
		do{
		customer.DisplayMenu();
		userchoice = customer.GetUserChoice();
		customer.UserSelection(userchoice);
		} while (userchoice < 1 || userchoice > 4);	
    }
}