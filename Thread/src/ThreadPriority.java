public class ThreadPriority {
    static void main() {
            Thread t9 = new Thread(() ->{
               System.out.println("custom thread is running");
            });

            t9.start();

            t9.getPriority();
    }
}
