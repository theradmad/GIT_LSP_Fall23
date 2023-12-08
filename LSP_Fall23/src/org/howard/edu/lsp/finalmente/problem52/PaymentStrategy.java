package org.howard.edu.lsp.finalmente.problem52;

//PaymentStrategy interface
interface PaymentStrategy {
 void pay(double amount);
}

//Concrete class CreditCardPayment
class CreditCardPayment implements PaymentStrategy {
	private String creditCardNumber;

	 public CreditCardPayment(String creditCardNumber) {
	     this.creditCardNumber = creditCardNumber;
	 }
	
	 @Override
	 public void pay(double amount) {
	     System.out.println("Paid " + amount + " using credit card " + creditCardNumber);
	 }
}

//Concrete class PayPalPayment
class PayPalPayment implements PaymentStrategy {
	private String emailAddress;

	 public PayPalPayment(String emailAddress) {
	     this.emailAddress = emailAddress;
	 }
	
	 @Override
	 public void pay(double amount) {
	     System.out.println("Paid " + amount + " using PayPal account: " + emailAddress);
	 }
}

//Concrete class BitcoinPayment
class BitcoinPayment implements PaymentStrategy {
	private String bitcoinAddress;

	 public BitcoinPayment(String bitcoinAddress) {
	     this.bitcoinAddress = bitcoinAddress;
	 }
	
	 @Override
	 public void pay(double amount) {
	     System.out.println("Paid " + amount + " using Bitcoin address: " + bitcoinAddress);
	 }
}

//ShoppingCart class
class ShoppingCart {
	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void checkout(double amount) {
		paymentStrategy.pay(amount);
	}
}


