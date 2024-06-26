// hw - hirerarchical 


class hire_A
{
	static int a = 76;
	int b = 56;
	void m1()
	{
		System.out.println("non static method of hire_A");
	}
	static void m2()
	{
		System.out.println("static method of hire_A");
	}
	hire_A()
	{
		
		System.out.println("non parametarized constructor of hire_A");

	}
	hire_A(int x)
	{
		System.out.println("parametarized constructor of hire_A " + x);
	}
}


class hire_B extends hire_A
{
	static int a1 = 876;
	int b1 = 156;
	void m3()
	{
		System.out.println("non static method of hire_B");
	}
	static void m4()
	{
		System.out.println("static method of hire_B");
	}
	hire_B()
	{
		
		System.out.println("non parametarized constructor of hire_B");

	}
	hire_B(int x)
	{
		System.out.println("parametarized constructor of hire_B " + x);
	}
}


class hire_C extends hire_A
{
	static int a2 = 6;
	int b2 =  96;
	void m5()
	{
		System.out.println("non static method of hire_C");
	}
	static void m6()
	{
		System.out.println("static method of hire_C");
	}
	hire_C()
	{
		
		System.out.println("non parametarized constructor of hire_C");

	}
	hire_C(int x)
	{
		System.out.println("parametarized constructor of hire_C " + x);
	}
}


class hire
{
	public static void main(String[] args) {

		hire_B b1 = new hire_B();
		hire_C c1 = new hire_C();
		System.out.println();
        
        // Displaying static variables
        System.out.println("Static variable of hire_A: " + hire_A.a);
        System.out.println("Static variable of hire_B: " + hire_B.a1);
        System.out.println("Static variable of hire_C: " + hire_C.a2);
        System.out.println();
        
        // Displaying non-static variables
        System.out.println("Non-static variable of hire_A: " + b1.b);
        System.out.println("Non-static variable of hire_B: " + b1.b1);
        System.out.println("Non-static variable of hire_C: " + c1.b2);
        System.out.println();
        
        // Calling non-static methods
        c1.m1();  
        b1.m3();
        c1.m5();
        System.out.println();
        
        // Calling static methods
        hire_A.m2();
        hire_B.m4();
        hire_C.m6();
        System.out.println();
        
        // Displaying constructors
        hire_A o2 = new hire_A(643);
        hire_B o3 = new hire_B(876);
        hire_C o4 = new hire_C(806);
		
	}
}