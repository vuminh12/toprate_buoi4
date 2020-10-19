package DesginPattern.CMD;

import java.util.Scanner;

public class Pay implements Command{
    private Customer customer;
    public Pay(Customer customer){
        this.customer = customer;
    }

    // bill in 1 table
    public int billForCustomer(int monney){
        //
        int sum=0;
        return sum;
    }

    @Override
    public void excute() {
        Pay pay = new Pay(customer);
        System.out.println("customer request to pay ! ");

    }
}
