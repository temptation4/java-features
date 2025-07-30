package java17.sealed;

sealed interface PaymentMethod permits CreditCard, PayPal, UPI {}
