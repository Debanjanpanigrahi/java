public class DemonThread {
    static void main() {
        Thread t10 = new Thread(() ->{
            while(true)
            {
                System.out.println("Running");
            }
        }) ;

        t10.setDaemon(true);
        t10.start();

        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
