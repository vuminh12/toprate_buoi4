package DesginPattern.SIG;

// singleton PaymentStaff
public class PaymentStaff {
    private static final PaymentStaff PAYMENT_STAFF = new PaymentStaff();
    private PaymentStaff(){}
    public static PaymentStaff getPaymentStaff() {
        return PAYMENT_STAFF;
    }

    public void PayforCustomer(){
        System.out.println("Bill printed");
    }
}
