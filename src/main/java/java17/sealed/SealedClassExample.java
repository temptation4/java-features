package java17.sealed;

public class SealedClassExample {
    public static void main(String[] args) {
        PaymentMethod method = new CreditCard("1234-5678-9012");

        printPaymentDetails(method);
    }

    static void printPaymentDetails(PaymentMethod method) {
        if (method instanceof CreditCard cc) {
            System.out.println("Credit Card Number: " + cc.cardNumber());
        } else if (method instanceof PayPal pp) {
            System.out.println("PayPal Email: " + pp.email());
        } else if (method instanceof UPI upi) {
            System.out.println("UPI ID: " + upi.upiId());
        }
    }
}
