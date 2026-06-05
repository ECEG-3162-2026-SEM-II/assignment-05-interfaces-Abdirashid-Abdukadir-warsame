package com.jju;


import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main(String[] args) {
    
        List<PaymentMethod> cart = new ArrayList<>();
        cart.add(new CreditCard("1234-5678-9012-3456", "12/25", "123"));
        cart.add(new PayPal("enwarkomad@gmail.com"));


        
        System.out.println("--- Checkout Initiated ---");

        for (PaymentMethod Payment : cart) {
            Payment.processPayment(99.99);
        }
    }
}