import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	Menu(){
		int indexCalled=0;	
		//Output the menu and waiting for input of user
			menuOptionSelection(indexCalled);

		}
	
	public static void main(String [] args){
		Menu menu=new Menu();
	}
	
	public static void showMenu(){
		System.out.println("Enter the index of menu");
		System.out.println("1.Time trial Quizz");
		System.out.println("2.Normal Quizz");
		System.out.println("3.Check Score and Ranking");
		System.out.println("4.Profile");
		System.out.println("5.Logout");
	}
	
	public static void menuOptionSelection(int indexCalled){
		
		
		Scanner scanner=new Scanner(System.in);
		do{
		showMenu();
		
		try{
		indexCalled =scanner.nextInt();
		
		}catch(InputMismatchException exception){
			//Problem1: infinite loop when entering String
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
				NormalQuiz normalQuizz=new NormalQuiz();
				
				break;
			case 2:
				TimeTrialQuiz timeTrialQuizz=new TimeTrialQuiz();
				
				break;
			case 3:
				Score score=new Score();
				break;
			case 4:
				Profile profile=new Profile();
				break;
			case 5:
				System.out.println("Thank you! please come back again!");
				scanner.close();
				continue;
				}
				
		
		}while (!(indexCalled==5));
	}
	
	}
