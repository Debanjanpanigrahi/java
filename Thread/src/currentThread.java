public class currentThread {
    static void main() {
        Thread t8 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });

        t8.setName("Worker 1");
        t8.start();
    }
}

/*
* currentThread() -> reference of current running thread
*
* */
