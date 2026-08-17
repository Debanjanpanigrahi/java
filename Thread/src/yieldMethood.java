public class yieldMethood {
    static void main() {
        /*
        * 1. Thread.yield() -> I am willing to give my cpu time to someone else with same priority
        * that wants to run
        *
        * 2. OS can reject this
        *
        *
        *3. Current theread does not go to WAITING,TIMED_WAITING,BLOCKED
        * it only goes to Runable state
        *
        *
        * */

        Thread t7 = new Thread(() ->{
            for(int i = 1 ; i<=10;i++){
                System.out.println("T7 " + i);
                Thread.yield();
            }
        });

        Thread t8 = new Thread(() ->{
            for(int i = 1 ; i<=10;i++){
                System.out.println("T8 " + i);
            }
        });

        t7.start();
        t8.start();

    }
}
