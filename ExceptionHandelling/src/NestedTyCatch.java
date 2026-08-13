public class NestedTyCatch {
    public static void main(String[] args)
    {
        try{
            System.out.println("Outer try starts");
            try{
                System.out.println("Inner try starts");
                System.out.println(5/0);
                System.out.println("Inner try Ends");
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero is not allowed inner");
            }
            System.out.println("Outer try ends"); //this should not be printed
        }
        catch(Exception e)
        {
            System.out.println("Divide by zero is not allowed outer");
        }
    }
}
