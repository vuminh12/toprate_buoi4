package DesginPattern.CMD;

import java.util.Scanner;

public class Pay implements Command{
    private Customer customer;
    public Pay(Customer customer){
        this.customer = customer;
    }

    // bill in 1 table
    public int billForCustomer(){
        // sum bill
        int sum =0;
        Order order = new Order(customer);

        for(int i=0;i<order.getOrders().size();i++){
            sum = sum + order.getOrders().get(i);
        }
        return sum;
    }

    @Override
    public void excute() {
        Pay pay = new Pay(customer);
        pay.billForCustomer();
        System.out.println("customer request to pay ! ");

    }
}
