package DesginPattern.CMD;



public class Customer {
    public int numberOfTable;
     public Customer(int numberofTable){
         this.numberOfTable = numberofTable;
     }

    public int getNumberOfTable() {
        return numberOfTable;
    }

    // customer order
    public void order(){
         Customer customer = new Customer(numberOfTable);
        Order order = new Order(customer);
        order.excute();
    }

    // customer complain
    public void complain(){
         Complain complain = new Complain();
         complain.excute();
    }

    // cumstomer pay
    public void pay(){
         Customer customer = new Customer(numberOfTable);
         Pay pay = new Pay(customer);
         pay.excute();
    }

}
