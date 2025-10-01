package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    // Class Members
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        Scanner scanner = new Scanner(System.in);

       CellPhone phone1 = new CellPhone(414124,"iPhone 15 Pro Max", "Verizon", "888-555-1234", "Sandra");

        // Inputs
        System.out.print("What is the serial number?:");
        int serialNumber = scanner.nextInt();
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

//        //getting the information with using getters to print
//        System.out.println("Serial number: " + phone.getSerialNumber());
//        System.out.println("Model: " + phone.getModel());
//        System.out.println("Carrier: " + phone.getCarrier());
//        System.out.println("Phone number: " + phone.getPhoneNumber());
//        System.out.println("Owner of the phone: " + phone.getOwner());

        display(phone);
        display(phone1);

    }

    public static void display(CellPhone phone) {
        System.out.println("Serial: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println();
    }




}

