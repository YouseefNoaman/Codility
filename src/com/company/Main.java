package com.company;

public class Main {

    public static void main(String[] args) {

        PhoneFormatter number = new PhoneFormatter();

        System.out.println(number.phoneFormat("56564-4-2-_#$%^&*()"));
        System.out.println(number.phoneFormat("56564-4-562-"));
        System.out.println(number.phoneFormat("00-003423 324234"));
        System.out.println(number.phoneFormat("56564-4-564-5-6-"));
        System.out.println(number.phoneFormat("56564-4-564-5-6-77"));

    }
}
