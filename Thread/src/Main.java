//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Demo1{
    public static void main(String[] args)
    {
        /*MyThread t1 = new MyThread();
        t1.start();*/

        MyRunnable t2= new MyRunnable(); //it is a task a thread is needed to perform the task
        Thread t1= new Thread(t2);
        t1.start();

        Thread t3 = new Thread(() -> System.out.println("HELLO World "));
        t3.start();

    }
}

//extending Thread class
class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Thread is running");
    }

}

class MyRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("Thread is running");
    }

}

