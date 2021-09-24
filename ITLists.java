package main;

public class ITLists {

	public static void logingin(String Username,int Password) {
		// TODO Auto-generated method stub
		String Accountno=Username;
		int Passw=Password;
		for(int i=0;i<WelcomePage.mc.Username.size();i++) {
			if(Accountno.equals(WelcomePage.mc.Username.get(i))&(Passw==WelcomePage.mc.Password.get(i))) {
				AccountInfo.Accountinfo(i);	
			}
			return;
		}
	}

}
