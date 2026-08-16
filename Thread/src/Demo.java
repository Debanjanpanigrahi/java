public class Demo {
    public static void main(String[] args)
    {
        Thread t1= new Thread(() ->{
            System.out.println("Current thread is " + Thread.currentThread().getName());
        });

        t1.start();
        t1.start(); //illegal thread Exception
        t1.run(); //it will call the main thread

    }
}
