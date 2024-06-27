//hw question - 4

/*
with exception only in inner try -

try
   try
   catch 
   finally
catch
finally
*/ 

class error_hw4 {
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
        } catch (Exception e) {
            System.out.println("Exception caught in outer catch block: " + e.getMessage());
        } finally {
            System.out.println("Inside outer finally block");
        }
    }
}
