
/* why java is strictly styped : because in conditions it takes only boolean values
                                 if range of data type is exceeded more than the limit then it throws error

bitwise - & , | , ^

a = 89
b = 74

512 256 128 64 32 16 8 4 2 1

------------------------

leftshift (value increases, multiplication happens)   
leftshift formula : a << n -> a*2^n

rightshift(values decreases, division happens) 
rightshift formula : a >> n -> a*2^-n

negation ~ 
formula : ~n = -[n+1]

------------------------
 
*/

// wap to demonstrate bitwise concepts, input from user 

import java.util.*;

class Demo{
public static void main(String[] args) {

	System.out.println(89&74);
	System.out.println(89|74);
	System.out.println(89^74);

	System.out.println("\n");
	
	System.out.println(7<<5);
	System.out.println(512>>8);
	System.out.println(~5);
	System.out.println(~-17);
	System.out.println(-~4);

	System.out.println("\n");

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter marks :");
	int marks = sc.nextInt();

	System.out.println("Enter grade :");
	char grade = sc.next().charAt(0);

	System.out.println("Enter fees :");
	float fees = sc.nextFloat();

	System.out.println("Enter name :");
	String name = sc.next();


	System.out.println("\n"+marks);
	System.out.println(grade);
	System.out.println(fees);
	System.out.println(name);
}
}

