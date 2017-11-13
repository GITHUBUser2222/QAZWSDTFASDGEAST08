import java.util.Timer;
import java.util.TimerTask;

public class TimeTrialQuiz extends Quiz{
	public int delay=1000;
	public int timeReduce=1;
	public static int time=20;
	Timer myTimer =new Timer();
	TimerTask task=new TimerTask(){
		public void run(){
			time=time-timeReduce;
			if(time <= 0) {
		         myTimer.cancel();
		         myTimer.purge();
		         System.out.println("Time up!");
		         return;
		     }
			if(time<10){
			System.out.println("00:0"+time);
			}
			else if(time>=60 && time<120){
			int minuteTime=time-60;
			if(minuteTime<10)
			System.out.println("01"+":0"+minuteTime);	
			else
			System.out.println("01"+":"+minuteTime);
			}
			else{
			System.out.println("00:"+time);
			}
			
		}
	};
	
	public void start(){
			myTimer.scheduleAtFixedRate(task, delay,delay);
		
	}
	TimeTrialQuiz(){
		if(time<10){
			System.out.println("00:0"+time);
			}
			else if(time>=60 && time<120){
			int minuteTime=time-60;
			System.out.println("01"+":"+minuteTime);
			}
			else{
			System.out.println("00:"+time);
			}
	}
	
	public void destroy(){
		myTimer.cancel();
	}
	
	public static void main(String [] args){
		TimeTrialQuiz test=new TimeTrialQuiz();
		test.start();
	}
}
