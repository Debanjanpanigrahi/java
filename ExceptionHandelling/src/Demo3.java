import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo3 {
    public static void main(String[] args)
    {
        try {
            checkEligibility(-19);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


        ReadFile();
    }

    public static void checkEligibility(int age) throws InvalidAgeException
    {
        if(age <=0 )
        {
            throw new InvalidAgeException("Age can not be negative");
        }

        if(age >= 18)
        {
            System.out.println("You are eligible for vote");
        }
    }

    public static void ReadFile()
    {
        try{
            FileReader fr = new FileReader("abc.txt");
        }
        catch(FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
    }
}

 class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg)
    {
        super(msg);
    }
}