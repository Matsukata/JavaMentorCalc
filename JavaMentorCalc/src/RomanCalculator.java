import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanCalculator extends CrossRoad {
	public static void romanCalculator(String input)
	{
		Pattern pattern = Pattern.compile("[ *+-/]");
		   String[] words = pattern.split(input);
		 			   
		   String number1=words[0];
		   String number2=words[1];
		   
		   String roman1=number1;
		   RomanToArabic1 romantoArabic1=new RomanToArabic1();		   
		   String romanToArabicVar1= RomanToArabic1.romanToArabic1(roman1);
			int numberFin1=Integer.parseInt(romanToArabicVar1);
			
		   String roman2=number2;
		   RomanToArabic2 romantoArabic2=new RomanToArabic2();		   
		   String romanToArabicVar2= RomanToArabic2.romanToArabic2(roman2); //Вызываю метод из конвертатора
			int numberFin2=Integer.parseInt(romanToArabicVar2);  
			
				  		   		   		   
		   String operator=null;
		  
		   Pattern pattern2 = Pattern.compile("[ *+-/]");
		   Matcher matcher = pattern2.matcher(input);
		   if (matcher.find())
		        operator= matcher.group();
		    
	 		    
		   int arabicResult=0;
		   
		   if (operator.equals("+"))
		   {      
		       arabicResult = numberFin1 + numberFin2;
		   }
		   if (operator.equals("-"))
		   {		       
			   arabicResult = numberFin1 - numberFin2;;
		   }
		   if (operator.equals("*"))
		   {		       
			   arabicResult = numberFin1 * numberFin2;;
		   }
		   if (operator.equals("/"))
		   {		      
			   arabicResult = numberFin1 / numberFin2;;
		   }
		  
		   
			String romanTotal=Integer.toString(arabicResult);
			
			ArabicToRoman arabicToRoman2=new ArabicToRoman();
			String romanToArabicTotal=ArabicToRoman.arabicToRoman(romanTotal);
			System.out.println ("Output:\n"+romanToArabicTotal);
		}
}
