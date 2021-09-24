package main;

public class AccountInfo {

	public static void Accountinfo(int i) {
		// TODO Auto-generated method stub
		System.out.println("Logged In Successful");
        System.out.println("Choose 1 for Withdraw");  
        System.out.println("Choose 2 for Deposit");  
        System.out.println("Choose 3 for Check Balance");  
        System.out.println("Choose 4 for EXIT");  
        System.out.print("Choose the operation you want to perform:"); 
        int n=MainCLass.sc.nextInt();
        int balance=MainCLass.Deposit.get(i);

        switch(n)
        {
            case 1:
            System.out.print("Enter money to be withdrawn:");
            int withdraw = MainCLass.sc.nextInt();
            if(balance >= withdraw)
            {
                balance = balance - withdraw;
                MainCLass.Deposit.set(i,balance);
                System.out.println("Please collect your money");
                System.out.println("Your Updatted balance is : "+balance);
                continueOrExit();
                
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
            System.out.println("");
            continueOrExit();
            break;

            case 2:
            System.out.print("Enter money to be deposited:");
            int deposit = MainCLass.sc.nextInt();
            balance = balance + deposit;
            MainCLass.Deposit.set(i,balance);
            System.out.println("Your Money has been successfully depsited");
            System.out.println("Your Updatted balance is : "+balance);
            System.out.println("");
            continueOrExit();
            break;

            case 3:
            System.out.println("Balance : "+balance);
            System.out.println("");
            continueOrExit();
            break;

            case 4:
            	System.out.println(" Thanks For Visiting Java ATM");
            	break;
        }
        
        
        return;
	}
	
	
	
	public static void continueOrExit() {
		System.out.println("Press 1 to Return");
		System.out.println("Press 0 to Exit");
		int decision=MainCLass.sc.nextInt();
		switch(decision) {
		case 1:
			Accountinfo(0);
			break;
			
		case 0:
        	System.out.println(" Thanks For Visiting Java ATM");
        	break;
		}
		return;
	}
}
