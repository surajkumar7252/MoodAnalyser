//SURAJMAL KUMAR

//MOOD ANALYSER PROBLEM. USE CASE 1. SIMPLY PRINTING MOOD.

//https://github.com/surajkumar7252/MoodAnalyser.git

package MoodAnalyzer.AnalyzeMood;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoodAnalysisProgram 
{
	static final Logger logger = LogManager.getLogger(MoodAnalysisProgram.class);
	private String message;
	
	public MoodAnalysisProgram(String receivedMessage) {
		
		message = receivedMessage;
	}
	
	public String analyseMood() {
		
			return message;
		}
	
	
		
		public static void main( String[] args ){
    	MoodAnalysisProgram  moodAnalyser = new MoodAnalysisProgram ("Happy");
    	String mood = moodAnalyser.analyseMood();
		logger.info(mood);
    }
}
