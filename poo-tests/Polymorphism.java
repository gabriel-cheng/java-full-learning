class Payment {
    public void makePayment(double value) {
        System.out.printf("Payment received: %s\n", value);
    }
}

class PaymentByCard extends Payment {
    @Override
    public void makePayment(double value) {
        System.out.printf("Payment received: %s by Card\n", value);
    }
}

class PaymentByPix extends Payment {
    @Override
    public void makePayment(double value) {
        System.out.printf("Payment received: %s by Pix\n", value);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        PaymentByCard payCard = new PaymentByCard();
        Payment payPix = new PaymentByPix();

        payCard.makePayment(500);
        payPix.makePayment(900);
    }
}