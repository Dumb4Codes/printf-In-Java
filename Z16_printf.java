
public class Z16_printf {

	public static void main(String[] args) {
		
        // printf = an optional method to control, format, and display text to the console window
		//          two arguments = format string + (object/variable/value)
		//          % [flags] {precision] [conversion-character]
		
		//System.out.printf("This is the format string %d", 155);
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "WhisKey";
		int myInt = 153;
		double myDouble = 4545;
		
		//[conversion-character]
		//System.out.printf("%b", myBoolean);
		//System.out.printf("%c", myChar);
		//System.out.printf("%s", myString);
		//System.out.printf("%d", myInt);
		//System.out.printf("%f", myDouble);
		
		//[width]
		//minimum number of character to be written as output 
		System.out.printf("Hello %20s", myString);
	    //System.out.printf("Hello %10s", myString);
		
		//[precision]
		//sets number of digits when outputting floating-point values
		//System.out.printf("You have this much money %.2f", myDouble);
		
		//[flags]
		//adds an effect to output based on the flag added to format specifier
		// - : left-justify
		
		//System.out.printf("My number is %-20f", myDouble);
		
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		
		//System.out.printf("My number is %+10d", myInt);
		
		// 0 : numeric values are paddded zero
		
		//System.out.printf("My number is %020f", myDouble);
		
		// , : comma grouping separator if numbers > 1000
		
		System.out.printf("This is how it goes %,f", myDouble);
		
		

	}

}
