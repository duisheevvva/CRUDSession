package taskInterface.service.serviceImpl;

import taskInterface.database.Database;
import taskInterface.model.Contact;
import taskInterface.model.Phone;
import taskInterface.service.PhoneInterface;

import java.util.Scanner;

public class PhoneServiceImpl implements PhoneInterface {
    @Override
    public String turnOn(Phone phone,String command) {
        if (command.equals("On")){
            System.out.println("Please write password:  ");
            if (phone.getPassword().equals(new Scanner(System.in).nextLine())){
                return "Phone is on!!";
            }
        }
        return "Goodbye!!";
    }

    @Override
    public Contact call(long phoneNumber) {
        for (Contact contact: Database.contacts) {
            if (contact.getPhoneNumber() == phoneNumber){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact call(String name) {
        for (Contact contact: Database.contacts) {
            if (contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact[] updateContact(String oldName, String newName) {
        for (Contact contact: Database.contacts) {
            if (contact.getName().equals(oldName)){
                contact.setName(newName);
            }
        }
        return Database.contacts;
    }

    @Override
    public Contact[] getAllContacts() {
        return Database.contacts;
    }
}
