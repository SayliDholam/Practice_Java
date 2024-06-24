/*
string - a collection of characters/ array of characters

classes - string, stringBuffer, stringBuilder

stringbuffer - follows syncronization, one thread works at one time , it is mutable

stringBuilder - does not follow syncronization, it is mutable

string is mutable or immutable ? 
ans - strings are IMMUTABLE

literals - something having constant values 
*/

class Demo3
{
	public static void main(String[] args) {
		String s1 = "java";

		String s2 = new String("Training");
		String s3= new String("Training");

		// (s2 == s3) --> false --> as these are objects, so they have addresses which are different so it will be false 
		//equals() --> checks for content

		System.out.println(s2.length());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.equals(s3));
		System.out.println(s2.charAt(4));
		System.out.println(s2.indexOf('T'));

		System.out.println("\n");
	
		System.out.println(s2.substring(2,4));
		System.out.println(s3.compareTo(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));

		System.out.println("\n");

		String f = "123";
		int num = Integer.parseInt(f);
		System.out.println(num + 1);
		System.out.println(Integer.valueOf(num + 2));

		System.out.println("\n");

		int number = 123;
		String str = Integer.toString(number);
		System.out.println(str+1);

		System.out.println("\n");

		int numbers = 123;
		String str1 = String.valueOf(numbers);
		System.out.println(str1+5);

		System.out.println("\n");


		String a[] = s2.split("i");
		for(int i = 0 ; i < a.length; i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("\n");

		int n = 123;
		String s = String.format("%d", n);
		System.out.println(s);

		System.out.println("\n");

		int n2 = 123;
		String s22 = n2 + "";
		System.out.println(s22 + 333);


		System.out.println("\n");

		System.out.println(0.1+0.1+0.1);
		System.out.println(0.1+0.1);
		System.out.println(0.3 == 0.1+0.1+0.1);
		System.out.println(0.2 == 0.1+0.1);

		System.out.println("\n");

		String x = "vivek";
		String y = "vivek";
		System.out.println(x == y);
		x = x + "pandey";
		System.out.println(x == y);
		String z = "vivekpandey";
		System.out.println(x == z);


		System.out.println("\n");
		System.out.println("\n");

		StringBuffer x1 = new StringBuffer("sayli");
		StringBuffer y1 = new StringBuffer("sayli");
		System.out.println(x1 == y1);
		x1 = x1.append("dholam");
		System.out.println(x1 == y1);
		StringBuffer z1 = new StringBuffer("saylidholam");
		System.out.println(x1 == z1);

		System.out.println("\n");

		StringBuilder sb = new StringBuilder("Arnold");
		sb.insert(4, "Hein");
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		System.out.println("\n");

		StringBuffer u1 = new StringBuffer("Itachi");
		StringBuffer u2 = new StringBuffer("Itachi");
		System.out.println(u1.capacity());
		System.out.println(u1.equals(u2));
		System.out.println(u1.compareTo(u2));

	}
}