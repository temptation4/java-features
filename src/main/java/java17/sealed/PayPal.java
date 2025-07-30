package java17.sealed;

final class PayPal implements PaymentMethod {
    private final String email;
    public PayPal(String email) { this.email = email; }
    public String email() { return email; }
}
