package MoodAnalyzer.AnalyzeMood;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalysisProgramTest 
{
    
    @Test
    public void whenMessage_isSad_shouldReturnSad() {
		MoodAnalysisProgram moodAnalyser=new MoodAnalysisProgram("I am  Sad.");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}
    public void whenAnyOtherMessage_given_shouldReturnHappy() {
    	MoodAnalysisProgram moodAnalyser=new MoodAnalysisProgram("I am Happy");
		String mood=moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
}
    public void whenMessage_isNull_shouldReturnHappy() {
    	MoodAnalysisProgram moodAnalyser=new MoodAnalysisProgram("I am Happy");
		String mood=moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}