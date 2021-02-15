package com.Exception;

public class MoodAnalyzerPractice
{
  static String UserMood;
  
  public MoodAnalyzerPractice(String UserMood)
  {
	  this.UserMood=UserMood;
  }
  
  public static String moodchange()
  {
      MoodAnalyzerPractice moodanalyser =new MoodAnalyzerPractice(null);
      try 
      {
      if(moodanalyser.UserMood.equals("I am Sad"))
      {
    		return "sad";

      }
      else
      {
    		return "happy";

      }
      }
      catch(NullPointerException e)
      {
    	  e.printStackTrace();
    	  return "Happy mood";
      }


  }
	public static void main(String[] args)
	{
       String obj=moodchange();
       System.out.println(obj);
	}

}
