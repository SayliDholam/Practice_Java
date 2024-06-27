/*
EXCEPTION HANDLING:

exceptions - unwanted events which are runtime errors which disturbs the normal flow of execution ;
             we can handle errors and resolve by coding ;
             may be provided by the users while entering dynamic inputs ;
             casues abnormal termination of program/application;

errors - compile and runtime errors ; cannot be handled so we need to manually make corrections

compile time errors - before execution

runtime errors - during execution; problem occuring at runtime which cannot be resolved by coding
               ex. insufficient main memory, unavailability of IO components

-------------------------------------------------
types of compile time errors

lexical - mistakes in tokens (tokens are - literals, variables, etc.)
          nit i = 10; ----> invalid

syntax -  not following the rules and template of the programming language
          i int = 10; ----> invalid

semantic - errors which chnage the meaning; ie make it meaningless
           int i = "name"
           char a = 13;

----------------------------------------------------

few exceptions :

IndexOutOfBoundException -
unreachable -
ArithmeitcException - 
NullPointerException - 

---------------------------------------------------

2 TYPES OF TERMINATION

smooth - if the execution is terminated at the end of the program
abnormal - if the execution is terminated in the middle of the program

in java - it is always suggested to have smooth termination

in java - if there is abnormal termination then 
           - it may crash local OS
           - it provides hang out situation to network based application
           - it collapses the database
           - server down 

--------------------------------------------------------

java is a robust language because :
- good memory managemnt system & good exception handling system


-------------------------------------------------------

                                    object 
                                  throwable
exceptions                                                        errors
  1.runtime -> arithmetic, nullpointer                            1.stackoverflow
  2.classnotfound                                                 2.JVMInternalProblems
  3.IOException  -> EOFException, filenotfound
  4.indexoutofbound


 ------------------------------------------------------------

 exceptions can be predefined or userdefined

 predefined:
            1. checked exception  ----> compiler knows the possibility/chance of an exception happening; identified 
            2. unchecked exception  -----> compiler is unaware of the possibility of an exception happening ; not identified 

userdefined: 

-----------------------------------------------------------------

runtime exception & its subclasses are ; errors & its subclasses ---> examples of unchecked exceptions
remaining exceptions are ---> examples of checked exceptions

-----------------------------------------------------------------

JVM gives information of the errors as 
- name of exception
- destionation of exception
- location of exception -> line number 

------------------------------------------------------------------

NOTE : in java nullpointerexception is only possible for instance variables and instance methods
       it is not applicable for static varibales and static methods

----------------------------------------------------------------------

if we wan tto raise an exception intentionally then we use -

keyword ---> throw

syntax ----> throws new Exception(parameters)

--------------------------------------------------------------

try - risky code 
catch  - handles risky code 
finally - execution if there is an exeception or not --> because it is to close the file connection 

---------------------------------------------------

main intention of throws keyword is to bypass the generated exception from the present method to the caller method 



*/

import java.io.IOException;

class errors_A
{
	int i = 10;
	void m1()
	{
		System.out.println("method 1");
	}

	int j = 10;
	void m2()
	{
		System.out.println("method 1");
	}

	static void m3()
	{
		System.out.println("before exception");
		throw new RuntimeException("my new exception");
	}
	void add() throws Exception
	{
		concat();
	}
	void concat() throws IOException 
	{
		throw new IOException("my concat exception");
	}
}
class errors
{
	public static void main(String[] args) 
	{
		System.out.println("Hii");

		/*
		for(; ;)
		{
			System.out.println("Hello");
		}
		

		//arithmetic exception
		int a = 10; 
		int b = 0 ;
		int c = a/b;
		System.out.println(c);

		//nullpointer exception
		Date d = null;
		System.out.println(d.toString);

	    //
		errors_A a1 = null;
		a1.m1();
		System.out.println(a1.i);

		System.out.println(errors_A.j);
		System.out.println(errors_A.m2());

		*/

		errors_A o1 = new errors_A();
		o1.m3();

		errors_A e1 = new errors_A();
		try 
		{
			e1.add();
    } 
    catch (Exception e) 
    {
    	System.out.println("Caught Exception: " + e.getMessage());
    }


		System.out.println("before try block");
		try{
			System.out.println("inside try block");
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside finally block");
		}
		System.out.println("after finally block");

	}
}