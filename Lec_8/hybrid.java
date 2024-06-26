//hw - hybrid inheritance 

/*
          square
circle1             circle2
  diamond1                  star
  diamond2                       heart

*/

class square
{
	void m1()
	{
		System.out.println("I am square");
	}
}

class circle1 extends square
{
	void m2()
	{
		System.out.println("I am circle1");
	}
}

class circle2 extends square
{
	void m3()
	{
		System.out.println("I am circle2");
	}
}

class diamond1 extends circle1
{
	void m4()
	{
		System.out.println("I am diamond1");
	}
}

class diamond2 extends circle1
{
	void m5()
	{
		System.out.println("I am diamond2");
	}
}

class star extends circle2
{
	void m6()
	{
		System.out.println("I am star");
	}
}

class heart extends star
{
	void m7()
	{
		System.out.println("I am heart");
	}
}

class hybrid
{
	public static void main(String[] args) {


        System.out.println("\nObject of diamond 1: ");
		diamond1 d1 = new diamond1();
		d1.m4();
		d1.m2();
		d1.m1();

		System.out.println("\nObject of diamond 2: ");
		diamond2 d2 = new diamond2();
		d2.m5();
		d2.m2();
		d2.m1();

		System.out.println("\nObject of heart: ");
		heart h1 = new heart();
		h1.m7();
		h1.m6();
		h1.m3();
		h1.m1();

		

		
	}
}