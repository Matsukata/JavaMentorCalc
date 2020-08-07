
public class ArabicToRoman extends RomanCalculator {
	public static String arabicToRoman(String romanTotal)
	{
		String total2 = null;

		if (romanTotal.equals("10"))
			total2="X";
		if (romanTotal.equals("20"))
			total2="XX";
		if (romanTotal.equals("30"))
			total2="XXX";
		if (romanTotal.equals("40"))
			total2="XL";
		if (romanTotal.equals("50"))
			total2="L";
		if (romanTotal.equals("60"))
			total2="LX";
		if (romanTotal.equals("70"))
			total2="LXX";
		if (romanTotal.equals("80"))
			total2="LXXX";
		if (romanTotal.equals("90"))
			total2="XC";
		if (romanTotal.equals("100"))
			total2="C";
		if (romanTotal.equals("11"))
			total2="XI";
		if (romanTotal.equals("12"))
			total2="XII";
		if (romanTotal.equals("13"))
			total2="XIII";
		if (romanTotal.equals("14"))
			total2="XIV";
		if (romanTotal.equals("15"))
			total2="XV";
		if (romanTotal.equals("16"))
			total2="XVI";
		if (romanTotal.equals("17"))
			total2="XVII";
		if (romanTotal.equals("18"))
		    total2=("XVIII");
		if (romanTotal.equals("19"))
		    total2="XIX";
		if (romanTotal.equals("21"))
			total2="XXI";
		if (romanTotal.equals("24"))
			total2="XXIV";
		if (romanTotal.equals("27"))
			total2="XXVII";
		if (romanTotal.equals("28"))
			total2="XXVIII";
		if (romanTotal.equals("32"))
			total2="XXXII";
		if (romanTotal.equals("36"))
			total2="XXXVI";
		if (romanTotal.equals("25"))
	        total2="XXV";
		if (romanTotal.equals("35"))
			total2="XXXV";
		if (romanTotal.equals("45"))
			total2="XLV";
		if (romanTotal.equals("36"))
		    total2="XXXVI";
		if (romanTotal.equals("42"))
			total2="XLII";
		if (romanTotal.equals("48"))
			total2="XLVIII";
		if (romanTotal.equals("54"))
			total2="LIV";
		if (romanTotal.equals("49"))
			total2="XLIX";
		if (romanTotal.equals("56"))
			total2="LVI";
		if (romanTotal.equals("63"))
			total2="LXIII";
		if (romanTotal.equals("64"))
	    	total2="LXIV";
		if (romanTotal.equals("72"))
			total2="LXXII";
		if (romanTotal.equals("81"))
			total2="LXXXI";
		if (romanTotal.equals("1"))
			total2="I";
		if (romanTotal.equals("2"))
			total2="II";
		if (romanTotal.equals("3"))
			total2="III";
		if (romanTotal.equals("4"))
			total2="IV";
		if (romanTotal.equals("5"))
			total2="V";
		if (romanTotal.equals("6"))
		    total2="VI";
		if (romanTotal.equals("7"))
			total2="VII";
		if (romanTotal.equals("8"))
			total2="VIII";
		if (romanTotal.equals("9"))
			total2="IX";
		
	return total2;
	}
}


