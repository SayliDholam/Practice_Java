// hw - multilevel 

class multi_A
{
	static int a = 12;
	int b = 32;
	void m1()
	{
		System.out.println("non static method of multi_A");
	}
	static void m2()
	{
		System.out.println("static method of multi_A");
	}
	multi_A()
	{
		
		System.out.println("non parametarized constructor of multi_A");

	}
	multi_A(int x)
	{
		System.out.println("parametarized constructor of multi_A " + x);
	}
}


class multi_B extends multi_A
{
	static int a1 = 87;
	int b1 = 56;
	void m3()
	{
		System.out.println("non static method of multi_B");
	}
	static void m4()
	{
		System.out.println("static method of multi_B");
	}
	multi_B()
	{
		
		System.out.println("non parametarized constructor of multi_B");

	}
	multi_B(int x)
	{
		System.out.println("parametarized constructor of multi_B " + x);
	}
}

class multi_C extends multi_B
{
	static int a2 = 12;
	int b3 = 32;
	void m5()
	{
		System.out.println("non static method of multi_C");
	}
	static void m6()
	{
		System.out.println("static method of multi_C");
	}
	multi_C()
	{
		
		System.out.println("non parametarized constructor of multi_C");

	}
	multi_C(int x)
	{
		System.out.println("parametarized constructor of multi_C " + x);
	}
}

class multi
{
	public static void main(String[] args) {

		multi_C o1 = new multi_C();
		System.out.println();
        
        // Displaying static variables
        System.out.println("Static variable of multi_A: " + multi_A.a);
        System.out.println("Static variable of multi_B: " + multi_B.a1);
        System.out.println("Static variable of multi_C: " + multi_C.a2);
        System.out.println();
        
        // Displaying non-static variables
        System.out.println("Non-static variable of multi_A: " + o1.b);
        System.out.println("Non-static variable of multi_B: " + o1.b1);
        System.out.println("Non-static variable of multi_C: " + o1.b3);
        System.out.println();
        
        // Calling non-static methods
        o1.m1();  
        o1.m3();
        o1.m5();
        System.out.println();
        
        // Calling static methods
        multi_A.m2();
        multi_B.m4();
        multi_C.m6();
        System.out.println();
        
        // Displaying constructors
        multi_A o2 = new multi_A(6843);
        multi_B o3 = new multi_B(8765);
        multi_C o4 = new multi_C(8076);
		
	}
	
}