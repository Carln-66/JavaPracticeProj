/**
 * @Auther: Carl
 * @Date: 2021/02/06/21:37
 * @Description:
 */

class Clerk {
    private int productNum = 0;

    public void produceProduct() {
        synchronized (ProductTest.class){
            if (productNum < 20) {
                productNum++;
                System.out.println(Thread.currentThread().getName() + ": 正在生产第 " + productNum + " 个产品");
                ProductTest.class.notify();
            } else {
                try {
                    ProductTest.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void consumeProduct() {
        synchronized (ProductTest.class){
            if (productNum > 0) {
                ProductTest.class.notify();
                System.out.println(Thread.currentThread().getName() + ": 正在消费第 " + productNum + " 个产品");
                productNum--;
            } else {
                try {
                    ProductTest.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Producer implements Runnable {     //生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "生产者正在生产...");
        while (true) {
            clerk.produceProduct();
        }
    }
}

class Consumer implements Runnable {     //消费者
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "消费者正在消费...");
        while (true) {
                clerk.consumeProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Consumer c1 = new Consumer(clerk);

        Thread thread1 = new Thread(p1);
        Thread thread2 = new Thread(c1);

        thread1.setName("生产者1");
        thread2.setName("消费者1");

        thread1.start();
        thread2.start();
    }
}
