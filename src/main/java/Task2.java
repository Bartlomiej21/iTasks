public class Task2 implements Runnable {

    /*
    TODO: Write a Java program that will result in deadlock, then change it to remove deadlock.
     */

    Integer threadNum;
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public Task2(Integer num) {
        this.threadNum = num;
    }

    public static void main(String[] args) {
        Task2 task1 = new Task2(1);
        Task2 task2 = new Task2(2);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        if (threadNum == 1) {
            synchronized (lock1) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println(threadNum);
                }
            }
        } else {
            synchronized (lock1) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println(threadNum);
                }
            }
        }
    }
}
