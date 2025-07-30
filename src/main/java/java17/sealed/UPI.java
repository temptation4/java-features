package java17.sealed;

final class UPI implements PaymentMethod {
    private final String upiId;
    public UPI(String upiId) { this.upiId = upiId; }
    public String upiId() { return upiId; }
}