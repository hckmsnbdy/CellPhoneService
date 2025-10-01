package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    // Class Members
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.print("What is the serial number?:");
        double serialNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What model is the phone?:");
        String model = scanner.nextLine();

        System.out.print("Who is the carrier?:");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number?:");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone?:");
        String owner = scanner.nextLine();

        // setting the information from inputs
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        //getting the information with using getters to print
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner of the phone: " + phone.getOwner());
    }
}

