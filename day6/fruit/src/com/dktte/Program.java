package com.dktte;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruit[] f = new Fruit[5];
        int index = 0;

        int ch;
        do {
            System.out.println("\n0.EXIT");
            System.out.println("1.ADD APPLE");
            System.out.println("2.ADD MANGO");
            System.out.println("3.ADD ORANGE");
            System.out.println("4.DISPLAY NAME OF FRUIT");
            System.out.println("5.DISPLAY ALL FRUITS");
            System.out.println("6.MARK FRUIT AS STALE");
            System.out.println("7.DISPLAY STALE FRUITS:");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 0:
                    System.out.println("Exiting...");
                    break;

                case 1:
                    if (index < 2) {
                        f[index] = new Apple();
                        f[index].accept(sc);
                        f[index].display();
                        System.out.println(f[index].toString());
                        System.out.println("Taste: " + f[index].taste());
                        index++;
                    } else {
                        System.out.println("Basket is full");
                    }
                    break;

                case 2:
                    if (index < 2) {
                        f[index] = new Mango();
                        f[index].accept(sc);
                        f[index].display();
                        System.out.println(f[index].toString());
                        System.out.println("Taste: " + f[index].taste());
                        index++;
                    } else {
                        System.out.println("Basket is full");
                    }
                    break;

                case 3:
                    if (index < 2) {
                        f[index] = new Orange();
                        f[index].accept(sc);
                        f[index].display();
                        System.out.println(f[index].toString());
                        System.out.println("Taste: " + f[index].taste());
                        index++;
                    } else {
                        System.out.println("Basket is full");
                    }
                    break;

                case 4:
                    for (Fruit fruit : f) {
                        if (fruit != null) {
                            fruit.getName();
                        }
                    }
                    break;

                case 5:
                	 for (Fruit fruit : f) {
                         if (fruit != null) {
                             fruit.display();
                         }
                     }
                     break;
                	
                case 6:
                    System.out.print("Enter index to mark as stale: ");
                    int markIndex = sc.nextInt();
                    if (markIndex >= 0 && markIndex < f.length && f[markIndex] != null) {
                        f[markIndex].setFresh(false);
                        System.out.println("Fruit marked as stale.");
                    } else {
                        System.out.println("Invalid index or fruit not found.");
                    }
                    break;

                case 7:
                	for (Fruit fruit : f) {
                        if (fruit != null) {
                	        if(fruit.isFresh()!=true) {
                	        	fruit.display();
                	        }
                        }
                	}
                	break;

                default:
                    System.out.println("Wrong Choice :(");
                    break;
            }

        } while (ch != 0);

        sc.close();
    }
}
