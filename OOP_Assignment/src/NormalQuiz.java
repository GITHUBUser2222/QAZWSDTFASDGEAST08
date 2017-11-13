import java.util.InputMismatchException;
import java.util.Scanner;

public class NormalQuiz extends Quiz{
	char [] userAnswer=new char[15];
	boolean [] userAnswerReviews=new boolean [15];
	NormalQuiz(){
		// call super class's print question
		
		char callSentinel='C';
		do{
		super.showQuestion();
		System.out.println();
		System.out.println("Please ensure you enter capital alphebat For example: A,B,C");
		//ask for user input
		super.userInput(userAnswer);
		userAnswerReviews=super.checkCorrect(userAnswer);
		System.out.println("The result is:");
		for(int i=0;i<userAnswerReviews.length;i++){
			System.out.println(i+1 +" " +userAnswerReviews[i]);
		}
		System.out.println();
		
		System.out.println("Try again? (Enter A) Go Back to menu?(Enter B) Quit Application?(Enter C)");
		Scanner scanner=new Scanner(System.in);
		callSentinel=scanner.nextLine().charAt(0);
		if(callSentinel=='A'){
		
		}else if(callSentinel=='B'){
			Menu menu=new Menu();
			break;
		}else if(callSentinel=='C'){
			System.out.println();
			System.out.println("Bye!");
			continue;
		}else{
			System.out.println("Please Enter A,B or C");
		}
		
		}while(callSentinel!='C');
	}
	
	
	public static void main(String [] args){
		NormalQuiz nq=new NormalQuiz();
	}
	
	
}

