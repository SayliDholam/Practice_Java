//hw question - 2

/*
with exception in both try -

try
   try
   catch 
   finally
catch
finally
*/ 

class error_hw2 {
    public static void main(String[] args) {
        try {
            // Outer try block
            try {
                // Inner try block
                System.out.println("Inside inner try block");
                // Simulate an exception in the inner try block
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in inner catch block: " + e.getMessage());
            } finally {
                System.out.println("Inside inner finally block");
            }
            // Code after inner try-catch-finally
            System.out.println("After inner try-catch-finally");
            // Simulate an exception in the outer try block
            int result = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in outer catch block: " + e.getMessage());
        } finally {
            System.out.println("Inside outer finally block");
        }
    }
}
