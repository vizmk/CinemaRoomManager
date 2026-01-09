import java.util.Scanner;


    public class Cinema {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Logic logic = new Logic();

            System.out.println("Enter the number of rows:");
            int rows = scanner.nextInt();

            System.out.println("Enter the number of seats in each row:");
            int seats = scanner.nextInt();

            System.out.println();
            logic.init(rows, seats);
            logic.print();

            System.out.println();
            System.out.println("Enter a row number:");
            int rowNumber = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            int seatNumber = scanner.nextInt();

            System.out.println();
            int price = logic.ticketPrice(rowNumber);
            System.out.println("Ticket price: $" + price);

            System.out.println();
            logic.book(rowNumber, seatNumber);
            logic.print();
        }
    }

