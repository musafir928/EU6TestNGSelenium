package com.cybertek.tests;

import com.github.javafaker.Faker;

public class FirstClass {
    public static void main(String[] args) {
        Faker faker = new Faker();

        System.out.println(faker.name().fullName());

    }

    private void c () {
        System.out.println("hi");
    }
}
