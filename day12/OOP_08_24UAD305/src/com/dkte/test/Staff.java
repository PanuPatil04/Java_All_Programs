package com.dkte.test;

import java.util.Scanner;

public abstract class Staff {
    protected int id;
    protected String name;

    public void accept(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public int getId() {
        return id;
    }
}
