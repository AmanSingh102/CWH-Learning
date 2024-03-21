
class InvalidInputException extends Exception
{
    @Override
    public String toString() {
        return "Can not add 8 and 9";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class CannotDivideByZeroException extends Exception
{
    @Override
    public String toString() {
        return "You can not divide by zero";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class MaxMultiplyInputException extends Exception
{
    @Override
    public String toString() {
        return "Input can not be greater than 7000";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class MaxInputException extends Exception
{
    @Override
    public String toString() {
        return "Input can not be greater than 100000";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}





class CustomCalculator
{
    double add( double a, double b) throws InvalidInputException,MaxInputException
    {
        if( a > 100000 || b > 100000) { throw new MaxInputException(); }
        if( a == 8 || b == 9 ) { throw new InvalidInputException(); }
        return a + b;
    }

    double subtract( double a, double b) throws MaxInputException
    {
        if( a > 100000 || b > 100000) { throw new MaxInputException(); }
        return a - b;
    }

    double multiplication( double a, double b) throws MaxInputException, MaxMultiplyInputException
    {
        if( a > 100000 || b > 100000)
        { throw new MaxInputException(); }
        else if( a > 7000 || b > 7000)
        { throw new MaxMultiplyInputException(); }

        return a * b;
    }

    double divide( double a, double b) throws CannotDivideByZeroException, MaxInputException
    {
        if( a > 100000 || b > 100000) { throw new MaxInputException(); }
        if( b == 0 ){ throw new CannotDivideByZeroException(); }
        return a / b;
    }

}





public class java_91_Exercise_6_Calculator_With_Exception
{
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException,MaxInputException,MaxMultiplyInputException
    {
        CustomCalculator c = new CustomCalculator();
        //c.add(8,9);
        //c.divide(6,0);
        //c.subtract(900000000,6);
        //c.multiplication(7001,9);
    }
}
