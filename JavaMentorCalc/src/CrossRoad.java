import java.io.IOException;
import java.util.Scanner;



public class CrossRoad {
	public static void main(String [] args) throws IOException
	{
		 System.out.print("Input\n");
		Scanner scanner = new Scanner(System.in);
	
	    String result = scanner.next();
	    scanner.close();
	    
	   String input=result;
	   
	   char b = result.charAt(0);//������ ������ ��� ��������
	   
	   ArabicCalculator calculator=new ArabicCalculator(); //������ ����� ������ ������
	   RomanCalculator romanCalculator=new RomanCalculator();
           
        	   if(Character.isDigit(b)) ArabicCalculator.calculator(input) ;
        	   else RomanCalculator.romanCalculator(input);
          
	     }
}
