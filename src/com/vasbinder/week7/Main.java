package com.vasbinder.week7;

public class Main {
    public static void main(String[] args) {
        Contact newContact = new Contact("Ausitn", "ajg05@amfgf.com");
        BusinessContact newBusinessContact = new BusinessContact("Austin","ajg05@amfgf.com", "614-940-0881");
        newContact.toString();
        newBusinessContact.toString();
    }
}
