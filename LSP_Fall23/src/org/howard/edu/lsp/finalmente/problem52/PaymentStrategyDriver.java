package org.howard.edu.lsp.finalmente.problem52;
import org.howard.edu.lsp.finalmente.problem52.PaymentStrategy;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Creating payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");

        // Creating a shopping cart
        ShoppingCart shoppingCart = new ShoppingCart();

        // Setting payment strategy and checking out
        shoppingCart.setPaymentStrategy(creditCardPayment);
        shoppingCart.checkout(100.0);

        shoppingCart.setPaymentStrategy(payPalPayment);
        shoppingCart.checkout(50.0);

        shoppingCart.setPaymentStrategy(bitcoinPayment);
        shoppingCart.checkout(75.0);
    }
}
