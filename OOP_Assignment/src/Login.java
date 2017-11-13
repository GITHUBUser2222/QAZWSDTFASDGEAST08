
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Login {
	//try collab haha
	static int indexCalled=0;
	static Scanner scanner=new Scanner(System.in);
	static String identity="";
	static String password="";
	Login(){
		
		loginOptionSelection(indexCalled);
	}
	
	public static void welcomePage(){
		System.out.println("1.Login");
		System.out.println("2.Regiter");
		System.out.println("3.Exit");
	
	}
	
	
	public static void loginOptionSelection(int indexCalled){
		
		do{
		welcomePage();
		
		try{
		indexCalled =scanner.nextInt();
		
		}catch(InputMismatchException exception){
			//Problem1: Loop infinite when entering String
			indexCalled=0;
			System.out.println("Please enter a number");
			System.out.println();
			break;
		}
		
		if(!(indexCalled>=1 &&indexCalled<=5)){
			System.out.println("Please enter a number between 1 to 5");
			System.out.println();
			continue;
		}
		
		switch(indexCalled){
			case 1:
				login();
				break;
			case 2:
				register();
				break;
			case 3:
				System.out.println("Please come back later");
				System.exit(0);
				break;
		}
		
		}while (!(indexCalled==3));
	}
	


	static void login(){
		//Problem 2: Find out how to input file into system
		File file=new File("userDetails.txt");
		System.out.print("ID: ");
		identity=scanner.next();
		System.out.print("\nPassword:");
		password=scanner.next();
		try {
			FileInputStream in=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
		}
		
		
		}
	static void register() {

			File file = new File ("userRegister.txt");
			Scanner input = new Scanner (System.in);
			String name;
			int password;
			System.out.println("Please enter your name:");
			name = input.nextLine();	
			System.out.println("Please enter the password:");
			password = input.nextInt();
	
			try {
				PrintWriter out = new PrintWriter(new FileWriter(file, true));
			out.print(name);
			out.print(";");
			out.println(password);
			out.close();
			} catch (IOException e) {
				
			}


		}
	}
