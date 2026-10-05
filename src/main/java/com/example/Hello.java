package com.example;

public class Hello {
    public String greet(String name) {
        return "Hello, " + name + "! Welcome to Jenkins CI/CD Pipeline.";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.greet("Jenkins"));
        System.out.println("2 + 3 = " + hello.add(2, 3));
    }
}
