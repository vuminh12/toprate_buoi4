package DesginPattern.CMD;

public class PayProcess {
    private Command pay;

    public PayProcess (Command pay){
        this.pay = pay;
    }
    public void callPay(){
        pay.excute();
        System.out.println("Customer paied");
    }
}
