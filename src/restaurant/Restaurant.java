package restaurant;

public class Restaurant {

    int count = 0;

    public synchronized void makesOrder() {

        System.out.println(Thread.currentThread().getName() + " делает заказ");
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        count--;
        System.out.println(Thread.currentThread().getName() + " ест");
    }

    public synchronized void takesOrder() {

        System.out.println(Thread.currentThread().getName() + " принимет заказ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        count += 10;
        System.out.println(Thread.currentThread().getName() + " приносит блюда");
        notifyAll();
    }
}
