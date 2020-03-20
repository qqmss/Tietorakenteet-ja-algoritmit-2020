package queue;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        printMenu();

    }

    private static void printMenu() {
        Scanner scanner = new Scanner(System.in);
        String select;
        Stack s = new Stack();
        Queue queue = new Queue();
        String data;
        do {
            System.out.println("1. pino push");
            System.out.println("2. pino pop");
            System.out.println("3. lisää jonon perälle");
            System.out.println("4. palautta jonon ensimmäinen ja poista se jonosta");
            System.out.println("5. lopetus");
            select = scanner.nextLine();
            switch (select) {
                case "1":
                    System.out.println("Anna alkion sisältö (merkkijono)");
                    data = scanner.nextLine();
                    s.push(data);
                    break;
                case "2":
                    data = s.pop();
                    if (data == null){
                        System.out.println("Pino on tyhjä");
                    } else {
                        System.out.println("pop: " + data);
                    }
                    break;
                case "3":
                    System.out.println("Anna alkion sisältö (merkkijono)");
                    data = scanner.nextLine();
                    queue.enqueue(data);
                    break;
                case "4":
                    data = queue.dequeue();
                    if (data == null){
                        System.out.println("Jono on tyhjä");
                    } else {
                        System.out.println("dequeue: " + data);
                    }
                case "5":
                    break;
            }
        } while (!select.equals("5"));
    }
}
