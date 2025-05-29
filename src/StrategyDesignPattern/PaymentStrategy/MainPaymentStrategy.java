package StrategyDesignPattern.PaymentStrategy;

// Step 1: Define a common interface for payment strategy
interface PaymentStrategy {
    void pay(int amount);
}

// Step 2: Implement concrete strategies
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bank Transfer.");
    }
}

// Step 3: Create the context class
class PaymentContextStrategy {

    private PaymentStrategy strategy;

    // Inject the strategy dynamically
    public PaymentContextStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Execute the payment using the selected strategy
    public void pay(int amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not set!");
        }
        strategy.pay(amount);
    }
}

// Step 4: Client code
public class MainPaymentStrategy {
    public static void main(String[] args) {
        System.out.println("PaymentStrategy Design Pattern");
        // Set strategy to CreditCardPayment
        PaymentContextStrategy paymentContext = new PaymentContextStrategy(new CreditCardPayment());
        paymentContext.pay(100); // Output: Paid 100 using Credit Card.

        // Change strategy to PayPalPayment
        paymentContext = new PaymentContextStrategy(new PayPalPayment());
        paymentContext.pay(200); // Output: Paid 200 using PayPal.

        // Change strategy to BankTransferPayment
        paymentContext = new PaymentContextStrategy(new BankTransferPayment());
        paymentContext.pay(300); // Output: Paid 300 using Bank Transfer.
    }
}

