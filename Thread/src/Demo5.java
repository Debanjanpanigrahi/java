public class Demo5 {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Main thread starts");

        Thread t6 = new Thread(()->{
            try{
                Thread.sleep(6000);
            }
            catch(InterruptedException ex){
                System.out.println();
            }
            System.out.println("T6 ends");
        });

        t6.start();
        t6.join(); //let the t6 join first complete its excecution
        System.out.println("Main thread Ends");
    }
}
