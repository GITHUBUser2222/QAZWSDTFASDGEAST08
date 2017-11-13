import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

//This class is not yet use in anywhere, to implement it,  call any method from this class
public class FileInputOutput {
	//Change Quizz Question here
	public static String[] questions={"1.Which of these are the most energy efficient lights?"
										+ "\nA. CFL"
										+ "\nB. Incandescent "
										+ "\nC. LED Bulbs"
									 ,"2.Which harmful acid is formed when you heat a non-stick pan on high temperature?"
									 	+"\nA. Perfluorooctanoic Acid "
									 	+"\nB. Hydrochloric Acid "
									 	+"\nC. Phosphoric Acid"
									 ,"3.Name the movie which depicts fictional catastrophic climatic effects in a series of extreme weather "
									 	+ "events that usher in global cooling and leads to a new ice age."
										+"\nA. Ice Age: Continental Drift"
										+"\nB. The Day After Tomorrow "
										+"\nC. An Inconvenient Truth"
									 ,"4.On which day did the Bhopal Gas Tragedy took place? "
									 	+ "\nA. 2nd Dec,1984 "
									 	+ "\nB. 22nd May, 1990 "
									 	+ "\nC. 23rd Feb, 1987"
									 ,"5.Who is referred as the 'Father of Green Revolution'? "
									 	+ "\nA. Norman Borlaug "
									 	+ "\nB. George Mendel "
									 	+ "\nC. George Washington Carver"
									 ,"6.Name the ancient Roman city famous for a volcanic eruption in 79 AD, based on which a Hollywood movie has also been made."
										+"\nA. Herculaneum "
										+"\nB. Pompeii "
										+"\nC. Capua"
									 ,"7.Which is the largest jute producing country? "
									 	+"\nA. Bangladesh "
									 	+"\nB. Nepal "
									 	+"\nC. India"
									 ,"8.The principal crop behind green revolution was?"
									 	+ "\nA. Rice "
									 	+ "\nB. Wheat "
										+ "\nC. Corn"
									 ,"9.What is the theme of this year's (2014) ' International Mountain Day'?"
									    +"\nA. Mountains: Key to Sustainable Future "
									    +"\nB. Mountain Farming "
									    +"\nC. Mountain Development"
									 ,"10.Who released a special stamp entitled ‘Wheat Revolution’ in July 1968? "
									 	+"\nA. Mahatma Gandhi "
									 	+"\nB. Indira Gandhi "
									 	+"\nC. Jawaharlal Nehru"
									 ,"11.Yellow revolution relates to? "
									 	+"\nA. Wool "
									 	+"\nB. Fish "
									 	+"\nC. Oilseeds"
									 ,"12.What was the Blue revolution associated with? "
									 	+"\nA. Milk "
									 	+"\nB. Water "
									 	+"\nC. Wool"
									 ,"13.Which of the following Indian state is the largest producer of milk? "
									 	+"\nA. Gujarat "
									 	+"\nB. Maharashtra "
									 	+"\nC. Andhra pradesh"
									 ,"14.In the world production of paddy, India is in the "
									 	+"\nA. 1st Place"
									 	+"\nB. 2nd Place "
										+"\nC. 3rd Place"
									 ,"15.Operation flood was started by the national dairy development board in "
									 	+ "\nA. 1972 "
									 	+ "\nB. 1970 "
									 	+ "\nC. 1974"};
	
	public String[] getQuestions()
	{
		return questions.clone();
	}
	
	public static File file=new File("QuizzData.txt");
	//store user details even for id,odd for password
	public static ArrayList<String> userNameAndPassword=new ArrayList<String>();
	
	//create file if not exists other not and call writeFile() 
	public static void writeDetailsIntoFile(String [] details,File file){
			if(file.exists()==false){
				try{
				file.createNewFile();
				}catch(Exception e){
					System.out.println("File not found...creating file... creating file error");
				}
				writeFile(details,file);
			}else{
				writeFile(details,file);
			}	
			
		}
	
	
	//Write question into file
	public static void writeFile(String [] thingsToWrite,File file){
		
		try{
			FileWriter fw=new FileWriter(file);
			BufferedWriter bufw=new BufferedWriter(fw);
			for(String thing:thingsToWrite){
				bufw.append(thing);
				bufw.newLine();
			}
			bufw.close();
			fw.close();
		}catch(Exception e){
			
		}
		
	}
	
	
	
	// read question from file
	protected static void readFile(){
		try{
			FileReader fr=new FileReader(file);
			BufferedReader bufr=new BufferedReader(fr);
			String s=null;
			while((s=bufr.readLine())!=null){
				System.out.println(s);
			}
			bufr.close();
			fr.close();
		}catch(Exception e){
			
		}
		
	}
	
	
}


