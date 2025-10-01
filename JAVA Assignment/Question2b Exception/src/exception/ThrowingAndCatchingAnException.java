package exception;


class InvalidDataTypeException extends Exception {
    public InvalidDataTypeException(String message) {
        super(message);
    }
}


public class ThrowingAndCatchingAnException {
	 //A method that requires a String
    public static void checkData(Object input) throws InvalidDataTypeException {
        if (input instanceof Integer) {
            //Throwing custom exception if input is an integer
            throw new InvalidDataTypeException("Invalid data type Required a String but received an Integer.");
        } else {
            System.out.println("Valid input: " + input);
        }
    }

    public static void main(String[] args) {
        try {
            //Passing an Integer Exception
            checkData(123);

            //Passing a String
            checkData("Object Oriented Programming");
        } 
        catch (InvalidDataTypeException e) {
            //Catching the custom exception and printing message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
