package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = "";
        while (!value.equals("quit")){
            System.out.print("input: ");
            value = scanner.next().toLowerCase();
            System.out.println(value);
        }

    }
}
