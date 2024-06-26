// hw single inheritance 

class single_A
{
	static int a = 102;
	int b = 353;
	void m1()
	{
		System.out.println("non static method of singleA");
	}
	static void m2()
	{
		System.out.println("static method of singleA");
	}
	single_A()
	{
		
		System.out.println("non parametarized constructor of singleA");

	}
	single_A(int x)
	{
		System.out.println("non parametarized constructor of singleA " + x);
	}
}

class single_B
{
	static int a1 = 1663;
	int b1 = 365;
	void m3()
	{
		System.out.println("non static method of singleB");
	}
	static void m4()
	{
		System.out.println("static method of singleB");
	}
	single_B()
	{
		System.out.println("non parametarized constructor of singleB");
	}
	single_B(int x)
	{
		System.out.println("non parametarized constructor of singleB " + x);
	}

	
}


class single{

	public static void main(String[] args) {

		single_A objA = new single_A();
        single_B objB = new single_B();
        System.out.println();
        
        // Displaying static variables
        System.out.println("Static variable of single_A: " + single_A.a);
        System.out.println("Static variable of single_B: " + single_B.a1);
        System.out.println();
        
        // Displaying non-static variables
        System.out.println("Non-static variable of single_A: " + objA.b);
        System.out.println("Non-static variable of single_B: " + objB.b1);
        System.out.println();
        
        // Calling non-static methods
        objA.m1();
        objB.m3();
        System.out.println();
        
        // Calling static methods
        single_A.m2();
        single_B.m4();
        System.out.println();
        
        // Displaying constructors
        single_A objA2 = new single_A(10);
        single_B objB2 = new single_B(20);

        //pass values 




		
	}
	
}