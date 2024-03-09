/*
pattern9 
     *
    * *
   * * *
  * * * *
 * * * * *


class P9{
	public static void main(String[] args) {
		int i, j , k;
 
      for( i=0;i<5;i++)
      {
          for( k=i;k<5;k++)
          System.out.print(" ");
 
          for( j=0;j<=i;j++)
          {
            System.out.print("* ");
          }
 
          System.out.println();
      }
	}
}





       *
     * * *
   * * * * *
 * * * * * * *
*/

 class P9 {
    public static void main(String[] args) {
        int i, j, k;

        for (i = 0; i < 4; i++) {
            for (k = i; k < 4; k++)
                System.out.print("  "); 

            for (j = 0; j <= i * 2; j++) 
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
