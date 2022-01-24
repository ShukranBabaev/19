package restaurant;

public class Clients extends Thread {

    private final Restaurant restaurant;

    public Clients(String name, Restaurant restaurant) {
        super(name);
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.makesOrder();
    }
}