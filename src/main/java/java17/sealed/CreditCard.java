package java17.sealed;

final class CreditCard implements PaymentMethod {
    private final String cardNumber;
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String cardNumber() { return cardNumber; }
}