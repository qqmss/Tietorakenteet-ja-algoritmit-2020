package binaryheap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("a = add, d = delete, q = quit");
        BinaryHeap binaryHeap = new BinaryHeap();
        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            s = scanner.nextLine();
            switch (s){
                case "a":
                    binaryHeap.insert(scanner.nextInt());
                    System.out.println(binaryHeap);
                    break;
                case "d":
                    binaryHeap.deleteMin();
                    System.out.println(binaryHeap);
                    break;
                case "q":
                    break;
            }
        } while(!s.equals("q"));
    }
}
