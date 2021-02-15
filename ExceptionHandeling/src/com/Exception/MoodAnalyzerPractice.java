package com.Exception;

import java.util.Scanner;

public class MoodAnalyzerPractice
{
   static String UserMood;
   static String msg;
   static Scanner sc=new Scanner(System.in);
  public MoodAnalyzerPractice(String UserMood,String msg)
  {
	  this.UserMood=UserMood;
	  MoodAnalyzerPractice.msg=msg;
  }
  
  public MoodAnalyzerPractice() 
  {

  }

public static String moodchange()
  {
      MoodAnalyzerPractice moodanalyser =new MoodAnalyzerPractice(null, null);
      System.out.println("Please enter the mood");
      msg=sc.next();
      try 
      {
      if(moodanalyser.UserMood.equals("I am Sad"))
      {	
    		if(msg.contains("sad"))
    	      {
    	    	  return "sad";
    	      }else
    	      {
    	    	  return "Happy";
    	      }
      }
      else
      {
    		return "happy";
      }
     }
      catch(NullPointerException e)
      {
    	  try {
			throw new MoodAnalyserException("invalid mood");
		} catch (MoodAnalyserException e1) {
			
			e1.printStackTrace();
		}
      }
	return msg;


  }
	public static void main(String[] args)
	{
       String obj=moodchange();
       System.out.println(obj);
	}

}

class MoodAnalyserException extends Exception
{
	public MoodAnalyserException(String String) 
	{

	}

	public String toString()
	{
		return "INVALID USER INPUT";
	}
}
