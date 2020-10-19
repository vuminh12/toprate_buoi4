package DesginPattern.CMD;

import java.util.ArrayList;

public class OrderProcess {
    private Command order;


    // 1 customer is 1 order and 1 pay
    public OrderProcess(Command order){
        this.order = order;

    }
    public void callOrder(){
        System.out.println("Customer call staff to order");
        order.excute();
    }

}
