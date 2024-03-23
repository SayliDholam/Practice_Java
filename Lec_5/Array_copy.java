import java.util.*;

class Array_copy
{
	public static void main(String[] args) {

		int a1[] = new int[]{43, 67, 23, 86, 21, 2, 95};

		int a2[] = Arrays.copyOf(a1, 7);

		System.out.println(Arrays.toString(a2));

		int a3[] = new int[10];

		System.arraycopy(a2, 0, a3, 0 , 7);

		System.out.println(Arrays.toString(a3));
	}
}
