/*
OBJECT ORIENTED PROGRAMMING - 
--------------------------------------

ADV
code reusability
flexibilitty
security
accessing levels
features which make sure data is in safe hands
 
-------------------

LIMIT
static loading -> all libraries of inbilt code get complied
more time taken hence reduced performance
pointers
platform dependent -> 

--------------------

CONCEPTS
class -> collection of similar data; 
         it is a plan / idea / blueprint; 
         attributes = variables & methods = behaviour;
         user defined data type;
         
         instance variables - object required; have default values; 
         static variables - no need of object; are of a class; 
         local variables - are of a local block or method 

methods -> 
           instance methods - need to object to access
           static methods - no need of obejct

objects -> implementation of class;
           a real world representation;

recursion ->  call method inside method until a condition is true or so 


constructors -> special method
                 same as class anme
                 no return type
                 initialize variables
                 call one constructor from another
                 get automatically called
                 called only once
                 uses this keyword
                 access modifiers allowed
                 constructor chairing allowed
                 type - default   - jvm created interanlly, we do not create this
                        parametarized - takes parameters
                        non parametarized - does not take parameters

abstraction -> shows relevant info
               hides irrelevant info
               data security

encapsulation -> make properties private
                 use getters - setters for accessing private members

polymorphism -> one thing does many task
                flexibility to changes

inheritance -> shild parent relation
               code reusability
               save space so space complexity
               use extends keyword

single inheritance -> one parent - one child
multi level inheritance -> one parent - one child (becomes parent to next) - one child
multiple inheritance -> two parent - one child (not supported directly in java)
hirerarchical inheritance -> one parent - many child
hybrid inheritance -> combo of inheritances


super keyword - to access parent class constructor

for polymorphism:
static -> compile time -> method overloading
dynamic -> runtime -> method overriding

method overloading -> process of extending existing properties
                      same class
                      same method name
                      different parameters

method overriding -> process of replacing old functionality to new functionality
                     different class
                     use inheritance
                     same method name
                     same parameters
                     access parent but execute child

*/



class oop1
{
	int a;  //nonstatic or instance variable 
	String s;  //nonstatic or instance variable 
	static int c = 20;  //static variable


	public oop1()
	{
		System.out.println("non parametarized");
	}

	public oop1(int x)
	{
		this();
		System.out.println("parametarized " + x);
	}

	public oop1(String s1, int s2)
	{
		s1 = s1;
		s2 = s2;
		System.out.println("data " + s1 + " " + s2);
	}




	void hyd()
	{
		System.out.println("hyderabad");
	}
	
	void mum()
	{
		System.out.println("mumbai");
		hyd();
	}


	void hi()
	{
		System.out.println("Hiii");
	}

	static void hello(int x)
	{
		System.out.println("Hii " + x);
	}



	public static void main(String[] args) 
	{

		oop1 o1 = new oop1();  //create object of a class
		System.out.println(o1.a);  //access instance variables via object
		System.out.println(o1.s);
		System.out.println();

		int b = 10;   //local variable
		System.out.println(b);
		System.out.println();

		System.out.println(c);  //access class static variable
		System.out.println(oop1.c);  //access class static variable via class name
		System.out.println(o1.c);  //access class static variable via object
		System.out.println();


		o1.hi();  //access instance method via object
		hello(123);  //access static method directly in class
		System.out.println();

		o1.mum();
		System.out.println();

		oop1 o2 = new oop1();
		oop1 o3 = new oop1(567);
		oop1 o4 = new oop1("abcdef", 07);
		System.out.println();
	


	}
}