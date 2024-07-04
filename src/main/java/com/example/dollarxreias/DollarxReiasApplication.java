package com.example.dollarxreias;

import Util.CurrencyConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DollarxReiasApplication {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Locale.setDefault(Locale.US);

        System.out.println("What is the dollar price?");
        double dollar = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double quanty = sc.nextDouble();

        double total = CurrencyConverter.Converter(dollar,quanty);

        System.out.printf("Amount to be paid in reais = %.2f%n", total);
    }

}
