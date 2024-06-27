/* for parent class method observe what happens when:


static - error as cannot override 
final - error as cannot override 
private - error as cannot override (visibility error as limited cannot access unlimited)
access modifiers - public : error as attempting to assign weaker access privileges
                   protected : error as  attempting to assign weaker access privileges


parent = protected & child = public ----> overriding achieved   ---> both child parent output
parent & child = static ----> overhiding achieved   ---> both times parent output
parent = default & child = public ---> once child output

*/

class Test_1
{
	/*static/final/private/public/protected void t1()*/
	 void t1()
	{
		System.out.println("Core");
	}

}

class Test_2 extends Test_1
{
	 void t1()
	{
		System.out.println("Java");
	}

}

class Test{
	public static void main(String[] args) {
		
		Test_1 a = new Test_2();
		a.t1();

		Test_1 b = new Test_1();
		b.t1();
		
	}
}