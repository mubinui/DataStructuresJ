package Lambda;

public class ThreadDemo {
    public static void main(String[] args) {
        //First Thread
        Runnable runnable = ()->{
            System.out.println("I am mubin");
            for (int i = 0; i <100 ; i++) {
                System.out.println(i+"Value of ->");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }

            }
        };
        Thread t1 = new Thread(runnable);

        Thread t2 = new Thread(runnable);
        t2.start();
        t1.start();

    }
}
