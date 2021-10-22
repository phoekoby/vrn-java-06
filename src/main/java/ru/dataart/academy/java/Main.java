package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Calculator get number of 1: " +
                calculator.getNumberOfChar("some_path\\test.zip", '1'));

        System.out.println("Calculator get max length: " +
                calculator.getMaxWordLength("some_path\\test1.zip"));
    }
}