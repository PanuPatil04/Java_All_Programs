package com.dkte.test;

import java.util.Scanner;

public class CollegeStaffManagement {
    public static int menu(Scanner sc) {
        System.out.println("\n----- MENU -----");
        System.out.println("1. Add Teaching staff");
        System.out.println("2. Add Lab staff");
        System.out.println("3. Display all Teaching staff");
        System.out.println("4. Display all Lab staff");
        System.out.println("5. Find specific Teaching staff by ID");
        System.out.println("6. Find specific Lab staff by ID");
        System.out.println("7. Display Teaching staff who worked highest hours");
        System.out.println("8. Display Lab staff with lowest salary");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff[] arr = new Staff[10];
        int count = 0;
        int choice;

        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:
                    if (count < arr.length) {
                        System.out.println("Enter details for Teaching staff:");
                        teachingStaff t = new teachingStaff();
                        t.accept(sc);
                        arr[count++] = t;
                    } else {
                        System.out.println("Staff list is full!");
                    }
                    break;

                case 2:
                    if (count < arr.length) {
                        System.out.println("Enter details for Lab staff:");
                        LabStaff l = new LabStaff();
                        l.accept(sc);
                        arr[count++] = l;
                    } else {
                        System.out.println("Staff list is full!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Teaching Staff List ---");
                    boolean foundTeaching = false;
                    for (int i = 0; i < count; i++) {
                        if (arr[i] instanceof teachingStaff) {
                            arr[i].display();
                            System.out.println("------------");
                            foundTeaching = true;
                        }
                    }
                    if (!foundTeaching) System.out.println("No teaching staff found.");
                    break;

                case 4:
                    System.out.println("\n--- Lab Staff List ---");
                    boolean foundLab = false;
                    for (int i = 0; i < count; i++) {
                        if (arr[i] instanceof LabStaff) {
                            arr[i].display();
                            System.out.println("------------");
                            foundLab = true;
                        }
                    }
                    if (!foundLab) System.out.println("No lab staff found.");
                    break;

                case 5:
                    System.out.print("Enter Teaching staff ID to find: ");
                    int findTeachId = sc.nextInt();
                    boolean foundTeach = false;
                    for (int i = 0; i < count; i++) {
                        if (arr[i] instanceof teachingStaff && arr[i].getId() == findTeachId) {
                            System.out.println("Teaching staff found:");
                            arr[i].display();
                            foundTeach = true;
                            break;
                        }
                    }
                    if (!foundTeach) System.out.println("Teaching staff not found.");
                    break;

                case 6:
                    System.out.print("Enter Lab staff ID to find: ");
                    int findLabId = sc.nextInt();
                    boolean foundLabStaff = false;
                    for (int i = 0; i < count; i++) {
                        if (arr[i] instanceof LabStaff && arr[i].getId() == findLabId) {
                            System.out.println("Lab staff found:");
                            arr[i].display();
                            foundLabStaff = true;
                            break;
                        }
                    }
                    if (!foundLabStaff) System.out.println("Lab staff not found.");
                    break;

                case 7:
                    teachingStaff maxHoursStaff = null;
                    for (int i = 0; i < count; i++) {
                        if (arr[i] instanceof teachingStaff) {
                            teachingStaff t = (teachingStaff) arr[i];
                            if (maxHoursStaff == null || t.getHours() > maxHoursStaff.getHours()) {
                                maxHoursStaff = t;
                            }
                        }
                    }
                    if (maxHoursStaff != null) {
                        System.out.println("Teaching staff with highest hours:");
                        maxHoursStaff.display();
                    } else {
                        System.out.println("No teaching staff found.");
                    }
                    break;

                case 8:
                    LabStaff minSalaryStaff = null;
                    for (int i = 0; i < count; i++) {
                        if (arr[i] instanceof LabStaff) {
                            LabStaff l = (LabStaff) arr[i];
                            if (minSalaryStaff == null || l.getSalary() < minSalaryStaff.getSalary()) {
                                minSalaryStaff = l;
                            }
                        }
                    }
                    if (minSalaryStaff != null) {
                        System.out.println("Lab staff with lowest salary:");
                        minSalaryStaff.display();
                    } else {
                        System.out.println("No lab staff found.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
                    break;
            }
        }

        System.out.println("Exiting program. Goodbye!");
        sc.close();
    }
}
