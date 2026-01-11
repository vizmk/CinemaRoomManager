import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        // Scanner per input utente
        Scanner scanner = new Scanner(System.in);

        // Oggetto che gestisce la logica del cinema
        Logic logic = new Logic();

        // Lettura dimensioni della sala
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        // Inizializzazione della sala
        logic.init(rows, seats);

        boolean exit = false;
        int counter = 0; // numero biglietti acquistati

        // Menu principale
        while (!exit) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    // Stampa disposizione dei posti
                    System.out.println();
                    logic.print();
                    break;

                case 2:
                    // Acquisto biglietto
                    while (true) {

                        System.out.println();
                        System.out.println("Enter a row number:");
                        int rowNumber = scanner.nextInt();

                        System.out.println("Enter a seat number in that row:");
                        int seatNumber = scanner.nextInt();

                        // Controllo validità posto
                        int check = logic.checkSeat(rowNumber, seatNumber);

                        if (check == -1) {
                            // Coordinate fuori dai limiti
                            System.out.println("Wrong input!");
                            continue;
                        }

                        if (check == 0) {
                            // Posto già acquistato
                            System.out.println("That ticket has already been purchased!");
                            continue;
                        }

                        // Posto valido e libero
                        int price = logic.ticketPrice(rowNumber);
                        System.out.println();
                        System.out.println("Ticket price: $" + price);

                        logic.book(rowNumber, seatNumber);
                        counter++;
                        break;
                    }
                    break;

                case 3:
                    // Stampa statistiche
                    logic.statistic(counter);
                    break;

                case 0:
                    // Uscita dal programma
                    exit = true;
                    break;
            }
        }
    }
}
