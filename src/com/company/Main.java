package com.company;

import restaurant.Restaurant;
import restaurant.Clients;
import restaurant.Waiters;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Restaurant restaurant = new Restaurant();
        List<Clients> client = new ArrayList<>(10);
        client.add(new Clients("Расул", restaurant));
        client.add(new Clients("Гурам", restaurant));
        client.add(new Clients("Иван", restaurant));
        client.add(new Clients("Александр", restaurant));
        client.add(new Clients("Нурлан", restaurant));
        client.add(new Clients("Тамби", restaurant));
        client.add(new Clients("Марина", restaurant));
        client.add(new Clients("Найджел", restaurant));
        client.add(new Clients("Георгий", restaurant));
        client.add(new Clients("Петр", restaurant));

        List<Waiters> waiter = new ArrayList<>(2);
        waiter.add(new Waiters("Елизавета", restaurant));
        waiter.add(new Waiters("Алексей", restaurant));

        for (Clients clients : client) {
            clients.start();
        }

        for (Waiters waiters : waiter) {
            waiters.start();
        }
    }
}
