public class ThreadName {
    public static  void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().threadId());

        Thread t1 = new Thread(() -> {
            System.out.println("Name of my thread 1: "+Thread.currentThread().getName());
            System.out.println("ID of my thread 1: "+Thread.currentThread().threadId());
        });

        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println("Name of my thread 2: "+Thread.currentThread().getName());
            System.out.println("ID of my thread 2: "+Thread.currentThread().threadId());
        });

        t2.start();
    }
}
