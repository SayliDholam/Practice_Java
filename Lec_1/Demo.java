public class Demo {

	public static void main(String args[]) {
		
		System.out.println("Sayli");
		System.out.print("Dholam");
		System.out.print("MCA");

		//Test.subject();  --> gives error

		Test t = new Test();
		t.subject();

	}

}

class Test{
	public void subject(){
		System.out.println("\nExam is of AJ");
	}
}