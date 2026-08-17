import static java.lang.Thread.*;

public class InteruptMethod {
    static void main() throws Exception{
        Thread t1 = new Thread(()->{
            while(!currentThread().isInterrupted()){
                System.out.println("Running");
            }
        });

        t1.start();
       // sleep(1000);
        t1.interrupt();


    }
}
/*

* t1.interrupt() --> sends a signal to t1 that it should
* stop what it is doing
*
* run a thread until a condition is meet
* */