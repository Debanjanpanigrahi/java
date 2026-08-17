public class Demo4 {
    static void main() {

        Thread t5 = new Thread(() ->{

            System.out.println("Inside thread t5");
            System.out.println("Name of current thread is : " + Thread.currentThread().getName());

        });

        System.out.println(t5.getState());
        t5.start();
        System.out.println(t5.getState());

        try {
            Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(t5.getState());
    }
}
