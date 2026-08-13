public class OuterTryExceptionHandelling {

    public static void main(String[] args)
    {
        try{
            System.out.println("Outer try starts");
            try{
                System.out.println("Inner try starts");
                System.out.println(5/0);
                System.out.println("Inner try Ends");
            } catch (NullPointerException e) {
                System.out.println("Null pointer Exception");
            }
            System.out.println("Outer try ends"); //this should not be printed
        }
        catch(Exception e)
        {
            System.out.println("Divide by zero is not allowed outer");
        }
    }
}
