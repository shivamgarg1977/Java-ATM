package main;
import java.io.*;
import java.util.*;
public class MainCLass {
	
	
	public static final Scanner sc = new Scanner(System.in);
	public  LinkedList<String> Username=new LinkedList<>();
	public  LinkedList<Integer> Password=new LinkedList<>();
	public  static final LinkedList<Integer> Deposit=new LinkedList<>();
	MainCLass(){
		Username.add("12345678abc");
		Username.add("123456780");
		Password.add(123);
		Password.add(12345);
		Deposit.add(10000);
		Deposit.add(5000);
	}
	
	public static void main(String[] args) {

		WelcomePage FirstPage=new WelcomePage();
		FirstPage.welcome();
	
		
	}

}
