package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Integer>> contacts = new HashMap<>();

    public void addContact(String lastName, int phoneNumber) {
        if (!contacts.containsKey(lastName)) {
            contacts.put(lastName, new ArrayList<>());
        }
        contacts.get(lastName).add(phoneNumber);
    }

    public void getContact(String lastName) {
        if (contacts.containsKey(lastName)) {
            List<Integer> phoneNumbers = contacts.get(lastName);
            System.out.println(lastName + " номера телефонов: " + phoneNumbers);
        }
    }
}
