//strings


import java.util.*;

class String_
{
	public static void main(String[] args) 
	{
		String a = "Sayli";
		String b = "Sayli";
		System.out.println(a == b);
		System.out.println(a.equals(b));

		String c = new String("Shrikant");
		String d = new String("Shrikant");
		System.out.println(c == d);
		System.out.println(c.equals(d));

		System.out.println(d.charAt(5));
		System.out.println(a.charAt(2));

		System.out.println('e' + 'f');
		System.out.println("e" + "f");
		System.out.println("e" + 3);
		System.out.println('e' + 3);
		System.out.println((char)('e' + 3));


		float f1 = 423.12643f;
		System.out.printf("Formatted number is %.2f ", f1);
	}
}



/*

Format Specifier   Conversion Applied
------------------------------------------------
%%	               Inserts a % sign
%x %X	           Integer hexadecimal
%t %T	           Time and Date
%s %S	           String
%n	               Inserts a newline character
%o	               Octal integer
%f	               Decimal floating-point
%e %E	           Scientific notation
%g	               Causes Formatter to use either %f or %e, whichever is shorter
%h %H	           Hash code of the argument
%d	               Decimal integer
%c	               Character
%b %B	           Boolean
%a %A	           Floating-point hexadecimal


*/