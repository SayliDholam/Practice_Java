//hw - 3
//1. take user input and print a matrix
//2. sum of all row elements (each row wise)
//3. sum of all col elements (each col wise)
//4. print max row sum
//5. print max col sum
//6. print sum of diagonals (both side)


import java.util.*;

class matrix
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter row size : ");
		int row = sc.nextInt();

		System.out.println("\nEnter column size : ");
		int col = sc.nextInt();

		int[][] matrix = new int[row][col];



		//input 
		System.out.println("\nEnter elements: ");
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0; j < col; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}



		//output
		System.out.println("\nmatrix elements: ");
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}



		//sum of all row elements (each row wise) & print max row sum
		System.out.println("\nsum of each row elements: ");
		int maxrowsum = 0;
		for(int i = 0; i < row ; i++)
		{
			int rowsum = 0;
			for(int j = 0; j < col ; j++)
			{
				rowsum = rowsum + matrix[i][j];
			}
			System.out.println("Sum of row " + (i+1) + " = " + rowsum);
			if(rowsum > maxrowsum) 
            {
                maxrowsum = rowsum;
            }
        }
        System.out.println("Maximum row sum = " + maxrowsum);




		//sum of all col elements (each col wise) & print max col sum
		System.out.println("\nSum of each column elements: ");
        int maxColSum = 0;
		for(int j = 0; j < col; j++) 
		{
			int colSum = 0;
            for(int i = 0; i < row; i++) 
            {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + colSum);
            if(colSum > maxColSum) 
            {
                maxColSum = colSum;
            }
        }
        System.out.println("Maximum column sum = " + maxColSum);




		//print sum of diagonals (both side)

		// Calculate sum of left diagonal (top-left to bottom-right)
        int leftSum = 0;
        for(int i = 0; i < row; i++) {
            leftSum += matrix[i][i];
        }
        System.out.println("\nSum of left diagonal: " + leftSum);

        // Calculate sum of right diagonal (top-right to bottom-left)
        int rightSum = 0;
        for(int i = 0; i < row; i++) {
            rightSum += matrix[i][col - 1 - i];
        }
        System.out.println("\nSum of right diagonal: " + rightSum);
	}
}