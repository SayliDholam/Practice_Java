//WAP to calculate Square roots of 1 to 9 numbers

class Q21_Sqroot{

    public static void main(String[] args) {

      
        for (int i = 1; i <= 9; i++) 
        {
            double sqr = Math.sqrt(i);
            System.out.println("Square root of " + i + " is: " + sqr);
        }
    }
}
