//chef prepares food item for his customers 
//implement abstraction

abstract class chef
{
	void c1(){
		System.out.println("I am chef");
	}
	abstract void sayli();
	abstract void siddhi();
	abstract void anjali();
	abstract void vedant();
	abstract void gaurav();

}

class abs_2 extends chef
{
	void sayli()
	{
		System.out.println("pancakes");
	}
	void siddhi()
	{
		System.out.println("panipuri");
	}
	void anjali()
	{
		System.out.println("idli");
	}
	void vedant()
	{
		System.out.println("pohe");
	}
	void gaurav()
	{
		System.out.println("misalpav");
	}

	public static void main(String[] args) {

		abs_2 o1 = new abs_2();
		o1.sayli();
		o1.siddhi();
		o1.anjali();
		o1.vedant();
		o1.gaurav();
		
	}
}