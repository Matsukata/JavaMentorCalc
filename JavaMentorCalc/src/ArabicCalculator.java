import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArabicCalculator extends CrossRoad {
	public static void calculator(String input)
	{
   
  
   Pattern pattern = Pattern.compile("[ *+-/]"); //Разделяю на слова
   String[] words = pattern.split(input);
    
   String number1=words[0];
   String number2=words[1];
   int arabic1=Integer.parseInt(number1);
   int arabic2=Integer.parseInt(number2);
   
   
   String operator=null;
  
   Pattern pattern2 = Pattern.compile("[ *+-/]");
   Matcher matcher = pattern2.matcher(input);
   if (matcher.find())
        operator= matcher.group();
    
   int arabicResult=0;
   
   if (operator.equals("+")) {
       
       arabicResult = arabic1 + arabic2;
   }
   if (operator.equals("-")) {
       
	   arabicResult = arabic1 - arabic2;;
   }
   if (operator.equals("*")) {
       
	   arabicResult = arabic1 * arabic2;;
   }
   if (operator.equals("/")) {
      
	   arabicResult = arabic1 / arabic2;;
   }
   System.out.println("Output:\n"+arabicResult);
}
}
