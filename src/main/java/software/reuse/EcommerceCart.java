/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.reuse;

public class EcommerceCart {

    private PaymentMethod paymentMethod;

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        paymentMethod.pay(amount);
    }

    public static void main(String[] args) {

        // Using Credit Card
        EcommerceCart cart1
                = new EcommerceCart(new CreditCardPayment());

        cart1.checkout(5000);

        // Using JazzCash
        EcommerceCart cart2
                = new EcommerceCart(new JazzCashPayment());

        cart2.checkout(2500);
    }
}
