/*
if you want to access a class which is inside a class -> use inner class as static

pass by value - no change

pass by reference - change 

*/


class oop2
{
	static class Student
	{
		String name;
		int rn;
	}

	public static void change(int x)
	{
		x = 20;
	}

	public static void change2(Student x)
	{
		x.name = "dholam";
	}


	public static void main(String[] args) 
	{
		Student s = new Student();
		s.name = "sayli";
		System.out.println(s.name);
		System.out.println();

		int x = 10;
		System.out.println(x);
		change(x);
		System.out.println(x);
		System.out.println();

		Student st = new Student();
		st.name = "shrikant";
		System.out.println(st.name);
		change2(st);
		System.out.println(st.name);


	}
}