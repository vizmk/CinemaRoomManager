import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        logic.init(rows, seats);

        boolean exit = false;

        while (!exit) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    logic.print();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Enter a row number:");
                    int rowNumber = scanner.nextInt();

                    System.out.println("Enter a seat number in that row:");
                    int seatNumber = scanner.nextInt();

                    int price = logic.ticketPrice(rowNumber);
                    System.out.println();
                    System.out.println("Ticket price: $" + price);

                    logic.book(rowNumber, seatNumber);
                    break;

                case 0:
                    exit = true;
                    break;
            }
        }
    }
}
