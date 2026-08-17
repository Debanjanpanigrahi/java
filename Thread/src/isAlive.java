public class isAlive {
    static void main() {
        Thread t1 = new Thread(() ->{
            try{
                Thread.sleep(2000);
            }
            catch (Exception ex){

            }
        });

        System.out.println(t1.isAlive());//false
        t1.start();
        System.out.println(t1.isAlive());//true

        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(t1.isAlive());
    }
}
