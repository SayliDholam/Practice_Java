//hw question - 1

/*
try--without exception
   try--without exception
   catch 
   finally
catch
finally

*/ 


class error_hw {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Inside outer try block");
            try {
                // Inner try block
                System.out.println("Inside inner try block");
            } catch (Exception e) {
                System.out.println("Exception caught in inner catch block");
            } finally {
                System.out.println("Inside inner finally block");
            }
            // Code after inner try-catch-finally
            System.out.println("After inner try-catch-finally");
        } catch (Exception e) {
            System.out.println("Exception caught in outer catch block");
        } finally {
            System.out.println("Inside outer finally block");
        }
    }
}


//idk if this is the way to do the question..