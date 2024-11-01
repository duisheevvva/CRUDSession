package taskInterface;

import taskInterface.database.Database;
import taskInterface.model.Phone;
import taskInterface.service.PhoneInterface;
import taskInterface.service.serviceImpl.PhoneServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneInterface phoneInterface = new PhoneServiceImpl();

        Phone phone = new Phone("Apple","Iphone","12345", Database.contacts);

        System.out.println("1 method");


        System.out.println("Command:  ");
        System.out.println(phoneInterface.turnOn(phone, new Scanner(System.in).nextLine()));

//        System.out.println("2 method");
//        System.out.println("Chaluu jurguzuu uchun telefon nomer jazynyz");
//        System.out.println(phoneInterface.call(new Scanner(System.in).nextLong()) + "chaluu...");

//        System.out.println("3 method");
//        System.out.println("Chaluu jurguzuu uchun contacttynn attyn  jazynyz: ");
//        System.out.println(phoneInterface.call(new Scanner(System.in).nextLine()) + "chaluu....");
//
//        System.out.println("4 method");
//        System.out.println("Update kyluu uchun eski atty jazynyz: ");
//        String oldName = new Scanner(System.in).nextLine();
//        System.out.println("jany atty jazynyz: ");
//        String newName = new Scanner(System.in).nextLine();
//        System.out.println(Arrays.toString(phoneInterface.updateContact(oldName, newName)));
        System.out.println("5 method");
        System.out.println("All contacts:  ");
        System.out.println(Arrays.toString(phoneInterface.getAllContacts()));


    }
}
