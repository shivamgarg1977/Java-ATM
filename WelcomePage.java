package main;

import java.util.Scanner;

public class WelcomePage {
	
	public static MainCLass mc = new MainCLass();
	public static void welcome(){

		System.out.println("......****......");
		System.out.println("Welcome to Java Bank");
		System.out.println("......****......");
		System.out.println("To create a new account :Press * ");
		System.out.println("Already have an account: Press # ");
		System.out.println("Enter Your Choice: ");
		
		char decision=MainCLass.sc.next().charAt(0);
		switch(decision) {
		
		case '*':
			signup();
			break;
		case '#':
			login();
			break;
		}
	}

	public static void signup() {
		System.out.println("Enter Your First Name: ");
		String Firstname=MainCLass.sc.next();
		System.out.println("Enter Your Last Name");
		String Lastname=MainCLass.sc.next();
		System.out.println("Select Your Account Type:");
		System.out.println("Saving Account: Press 1 ");
		System.out.println("Current Account: Press 2 ");
		System.out.println("Salary Account: Press 3 ");
		System.out.println("Fixed Deposit Account: Press 4 ");
		System.out.println("Recurring deposit Account: Press 5 ");
		System.out.println("Select Your Account Type:");
		int AccountType=MainCLass.sc.nextInt();
		
		System.out.println("Your Account Number is");
		String Ac=AccountNoGenrator(10);
		mc.Username.add(Ac);
		System.out.println(Ac);
		
		System.out.println("Enter Your Password");
		mc.Password.add(MainCLass.sc.nextInt());
		System.out.println("Your account has been created ");
			
		
		login();
		return;
	}


	public static void login(){
		
		System.out.println("Welcome to Java Bank Login Portal");
		System.out.println("Enter Your Account Number");
		String Accountno=MainCLass.sc.next();
		System.out.println("Enter Your Password");
		int Password=MainCLass.sc.nextInt();
		
		ITLists.logingin(Accountno, Password);
		
		return;
		
	}
	 static String AccountNoGenrator(int n) {
		
		 String AlphaNumericString = "0123456789";
              


		 	StringBuilder sb = new StringBuilder(n);

		 	for (int i = 0; i < n; i++) {

		 		int index= (int)(AlphaNumericString.length()* Math.random());
		 		sb.append(AlphaNumericString.charAt(index));
		 	}

		 	return sb.toString();
	}
}


