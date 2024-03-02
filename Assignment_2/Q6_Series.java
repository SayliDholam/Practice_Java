//Solve series: 2 3 8 27 112 565 3396 23779 190240

public class Q6_Series 
{
    public static void main(String[] args) {
        int terms = 9; 

        long currentTerm = 2;

        System.out.println("The series is:");

        for (int i = 1; i <= terms; i++) 
        {
            System.out.print(currentTerm + " ");

            // Generate the next term based on the pattern
            currentTerm = currentTerm * i + i;
        }
    }
}
