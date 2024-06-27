/*

ABSTRACTION 

to achive abstraction we need keyword abstract

in abstract class ---> we have concrete + abstract methods

methods which have body definition  --->concrete method
mehtods which does not have body definition; only declaration is there --> abstract method

cannot create object for abstract class  --->  error will be thrown as "cannot instantiate"

we can create a reference variable for abstract class

abstract is - partially incomplete

not necessary to have abstrct methods in the abstract class

even without concrete methods , abstract class can work


*/


//abstraction example 

abstract class abs_A
{
	void a1(){
		System.out.println("Akame");
	}
	abstract void a2();
}


class abst_ extends abs_A
{
	void a2()
		{
			System.out.println("Esdeath");
		}

	public static void main(String[] args) {

		abst_ o1 = new abst_();
		o1.a1();
		o1.a2();

		System.out.println();

		abs_A o2 = new abst_();
		o2.a1();
		o2.a2();

		
	}
}