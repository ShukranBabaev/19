package restaurant;

public class Waiters extends Thread {

    private final Restaurant restaurant;

    public Waiters(String name, Restaurant restaurant) {
        super(name);
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.takesOrder();
    }
}