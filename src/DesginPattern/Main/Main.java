
package DesginPattern.Main;

import DesginPattern.CMD.*;
import DesginPattern.COR.Serve;
import DesginPattern.COR.ServeLevel;
import DesginPattern.COR.ServeProcess;
import DesginPattern.COR.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListStaff();
        Scanner scanner = new Scanner(System.in);
        int check;
       check= Integer.parseInt(scanner.nextLine());

    while(check !=4){
        switch (check){
            case 1:
                System.out.println("input number of table: ");
                int number = Integer.parseInt(scanner.nextLine());
                Customer customer = new Customer(number);
                Command order = new Order(customer);
                OrderProcess orderProcess = new OrderProcess(order);
                orderProcess.callOrder();

                break;
            case 2:
                // customer complain
                System.out.println("input number of table: ");
                int number1 = Integer.parseInt(scanner.nextLine());
                Customer customer1 = new Customer(number1);
                customer1.complain();

                // level check of restaurant
                Complain();
                System.out.println("input number of complain: ");
                int num = Integer.parseInt(scanner.nextLine());
                Serve serve = ServeProcess.getServe();
                switch (num){
                    case 1:
                        serve.check(ServeLevel.STAFF,"Staff message");
                        break;
                    case 2:
                        serve.check(ServeLevel.LEADER,"leader message");
                        break;
                    case 3:
                        serve.check(ServeLevel.DIRECTOR,"director message");
                        break;
                }
                break;
           case 3:
                // customer pay
            System.out.println("input number of table: ");
            int number2 = Integer.parseInt(scanner.nextLine());
            Customer customer2 = new Customer(number2);
            Command pay = new Pay(customer2);
            PayProcess payProcess = new PayProcess(pay);
            payProcess.callPay();
               break;
        }
        ListStaff();
        check= Integer.parseInt(scanner.nextLine());
    }
    }
    // list customer want to serve
    public static void ListStaff(){
        System.out.println("1. Customer order");
        System.out.println("2.Customer complain ");
        System.out.println("3. Customer pay");
    }

    // list customer want to complain
    public static void Complain(){
        System.out.println("1.Complain level 1 ");
        System.out.println("2.Complain level 2 ");
        System.out.println("3.Complain level 3 ");
    }

}
