/*
1 10
2 9
4 7
5 6
*/

class P12{
	public static void main(String[] args) {
		int n = 11;
		for(int i = 1; i<=5; i++){

			--n;

			if(i == 3)
			{
				continue;
			}
			System.out.println(i + " " + n);
		}
	}
}

