/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.reuse;

public class JazzCashPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using JazzCash.");
        return true;
    }
}
