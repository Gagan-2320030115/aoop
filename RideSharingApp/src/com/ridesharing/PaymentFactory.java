package com.ridesharing;

// Step 5.1: Create an interface for the Abstract Factory
interface PaymentFactory {
    PaymentMethod createPaymentMethod();
}

// Step 5.2: Create an abstract class for Payment Methods
abstract class PaymentMethod {
    public abstract void pay(double amount);
}

// Step 5.3: Implement concrete classes for Payment Methods
class CreditCardPayment extends PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment extends PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class CashPayment extends PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in Cash.");
    }
}

// Step 5.4: Implement concrete factories for creating payment methods
class CreditCardFactory implements PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}

class PayPalFactory implements PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}

class CashFactory implements PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new CashPayment();
    }
}
