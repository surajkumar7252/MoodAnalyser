//SURAJMAL KUMAR

//MOOD ANALYSER PROBLEM. USE CASE 2. NullPointerException Handled.

//https://github.com/surajkumar7252/MoodAnalyser.git

package MoodAnalyzer.AnalyzeMood;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoodAnalysisProgram 
{
	static final Logger logger = LogManager.getLogger(MoodAnalysisProgram.class);
	private String messagePassed;
	
	public MoodAnalysisProgram(String receivedMessage) {
		
		messagePassed = receivedMessage;
	}
	
	public String analyseMood() {
		
		try {
			if (messagePassed.contains("SAD")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
		}
	
	
		
		public static void main( String[] args ){
    	MoodAnalysisProgram  moodAnalyser = new MoodAnalysisProgram ("Happy");
    	String mood = moodAnalyser.analyseMood();
		logger.info(mood);
    }
}
