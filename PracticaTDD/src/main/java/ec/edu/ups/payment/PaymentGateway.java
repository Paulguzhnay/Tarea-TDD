package ec.edu.ups.payment;

public interface PaymentGateway {
    public PaymentResponse requestPayment(PaymentRequest paymentRequest);

}
