//method overloading 

class overload
{

	void hi()
	{
		System.out.println("jjk");
	}

	void hi(int x)
	{
		System.out.println("mob psycho" + x);
	}

	void hi(int x, String s)
	{
		System.out.println(x + " time " + s);
	}


	public static void main(String[] args) 
	{
		overload o1 = new overload();
		o1.hi();
		o1.hi(100);
		o1.hi(7, "loop");
	}
	
} 