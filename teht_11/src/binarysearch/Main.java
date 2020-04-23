package binarysearch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        BinarySearch searchArray = new BinarySearch();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. print");
            System.out.println("2. indexOf");
            System.out.println("3. add");
            System.out.println("4. exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(searchArray);
                    break;
                case 2:
                    System.out.println("Give search");
                    int search =  scanner.nextInt();
                    int index = searchArray.indexOf(search);
                    System.out.println(search + " is at index " + index);
                    System.out.println("index " + index + " is " + searchArray.get(index));
                    break;
                case 3:
                    System.out.println("Give add");
                    searchArray.add(scanner.nextInt());
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }
}
