class TypeCast{
	 public static void main(String[] args) {

	 	int a = 5, b = 10;
	 	float res1 = a/b;
	 	float res2 = (float)a/b;

	 	System.out.println(res1);
	 	System.out.println(res2);

	 	//-------------

	 	byte m = 23;
	 	short s = 176;
	 	int i =2386;
	 	long l = 325469844;

		System.out.println(m);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);

		//-------------

		char c1 = 65;
		char c2 = 'A';

		System.out.println(c1);
		System.out.println(c2);

		//-------------

		boolean b1 = true;
		System.out.println(b1);
		System.out.println(!b1);

		b1 = !b1;
		System.out.println(b1);
		System.out.println(!b1);

		//-------------

		float f = 43.66f;
		if(f == 43.22){
			System.out.println("Hello");
		}
		else{
			System.out.println("Hi");
		}


		//-------------

		






	}
}