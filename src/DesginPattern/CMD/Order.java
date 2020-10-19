package DesginPattern.CMD;

import sun.lwawt.macosx.CSystemTray;

import java.util.HashMap;
import java.util.Random;

public class Order implements Command{
    private Customer customer;

    public Order(Customer customer){
        this.customer = customer;
    }
    String key;
    HashMap<String,Integer> list = ListMenu();
    HashMap<String,Integer> orders = new HashMap<>();
    public void OrderofCustomer() {
        Object[] objects = list.keySet().toArray();
         key = (String) objects[new Random().nextInt(objects.length)];
         orders.put(key,list.get(key));
    }

    public HashMap<String, Integer> getOrders() {
        return orders;
    }

    @Override
    public void excute() {
        Order order = new Order(customer);
        order.OrderofCustomer();
        System.out.println("Loading....");
        System.out.println("The Customer has ordered! Please wait a few minutes");
    }
    public HashMap<String,Integer> ListMenu(){
        HashMap<String,Integer> list = new HashMap<String,Integer>();
        list.put("bread",50);
        list.put("stuffed pancake",100);
        list.put("girdle-cake",200);
        list.put("young rice cake",200);
        list.put("rice noodles",150);
        list.put("Abalone",150);
        list.put("Fish cooked with sauce",150);
        list.put("Pork-pie",300);
        list.put("Grilled fish",500);
        list.put("Crab rice noodles",400);
        list.put("Sweet gruel",50);
        list.put("Soya cheese",30);
        list.put("shrimp in batter",100);
        return list;
    }
}

