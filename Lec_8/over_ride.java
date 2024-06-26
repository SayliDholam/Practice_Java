//method overriding

class ride1
{
	void m1()
	{
		System.out.println("Levi Ackerman");
	}
}

class ride2 extends ride1
{
	void m1()
	{
		System.out.println("Mikasa Ackerman");
	}
}

class over_ride
{
	public static void main(String[] args) {

		ride1 a = new ride2();
		a.m1();

		ride1 b = new ride1();
		b.m1();

		ride2 c = new ride2();
		c.m1();
	}
}