package com.ridesharing;

public class RideSharingApp {
    public static void main(String[] args) {
        // Step 6.1: Get the single instance of UserAuthentication
        UserAuthentication userAuth = UserAuthentication.getInstance();

        // Step 6.2: Authenticate the user
        userAuth.login("user", "password");

        if (userAuth.isAuthenticated()) {
            // Step 6.3: Book a ride using Factory Method
            Vehicle car = VehicleFactory.createVehicle("car");
            car.bookRide();

            Vehicle scooter = VehicleFactory.createVehicle("scooter");
            scooter.bookRide();

            // Step 6.4: Pay for the ride using Abstract Factory
            PaymentFactory creditCardFactory = new CreditCardFactory();
            PaymentMethod creditCardPayment = creditCardFactory.createPaymentMethod();
            creditCardPayment.pay(50.0);

            PaymentFactory paypalFactory = new PayPalFactory();
            PaymentMethod paypalPayment = paypalFactory.createPaymentMethod();
            paypalPayment.pay(75.0);

            // Step 6.5: Logout user
            userAuth.logout();
        }
    }
}
