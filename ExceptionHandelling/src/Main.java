class Main{
    public static void main(String[] args)
    {
            /*int num = 5/0;
            System.out.println(num);*/

            /*int a=5;
            int b=0;
            System.out.println("steep 1");
            System.out.println(a/b);
            System.out.println("Steep 2 ");*//*step 2 will not get printed*/
            methodA(5,0);
    }

    private static void methodA(int a,int b)
    {
        methodB(a,b);
    }

    private static void methodB(int a,int b)
    {
        System.out.println(a/b);
    }
}