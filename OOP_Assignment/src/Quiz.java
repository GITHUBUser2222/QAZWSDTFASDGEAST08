import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	private int quizzNumber;
	private int quizzCount=50;
	private static char[] answer={'C','A','B','A','A','B','C','B','B','B','C','B','B','B','B'};
	Quiz(){
		showQuestion();
		
	}
	
	static FileInputOutput F1 = new FileInputOutput();
	static String[] cloneArray = F1.getQuestions();
	
	protected static void showQuestion(){
		
		
		FileInputOutput.readFile();
	}
	protected void readQuestion(){
		FileInputOutput.readFile();
	}
	
	public static void userInput(char[] userAnswer){
		System.out.println("\nEnter your answer (In capitalize alphabet form)");
		Scanner input=new Scanner(System.in);
		for (int k=0;k<cloneArray.length;k++){
		for(int i=0;i<1;i++){
			try{
			System.out.println(cloneArray[k]);
			userAnswer[k]=input.nextLine().charAt(0);
			}
			catch(InputMismatchException e){
			System.out.println("Please enter a character");
			userAnswer[k]=input.next().charAt(0);
			}
		}
		}
		
	}
	
	
	//Doing
	public static boolean[] checkCorrect(char[] userAnswer){
		boolean[] userAnswerReviews=new boolean[15];
		for(int i=0;i<userAnswer.length;i++){
			//if user answer is same with predefined answer
			if(userAnswer[i]==answer[i]){
				// add true to result array
				userAnswerReviews[i]=true;
			}else{
				//otherwise false
				userAnswerReviews[i]=false;
			}
		}
		return userAnswerReviews;
	}
           
}
