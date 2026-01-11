public class Logic {

    private char[][] sala;      // matrice dei posti
    private int rows;
    private int seats;
    private int currentIncome = 0; // incasso attuale

    // Inizializzazione sala con tutti i posti liberi
    public void init(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
        sala = new char[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                sala[i][j] = 'S';
            }
        }
    }

    // Stampa la disposizione dei posti
    public void print() {
        System.out.println("Cinema:");
        System.out.print("  ");

        for (int j = 1; j <= seats; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < seats; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Prenota un posto
    public void book(int rowNumber, int seatNumber) {
        sala[rowNumber - 1][seatNumber - 1] = 'B';
    }

    // Calcolo prezzo del biglietto e aggiornamento incasso
    public int ticketPrice(int rowNumber) {
        int totalSeats = rows * seats;

        if (totalSeats <= 60) {
            currentIncome += 10;
            return 10;
        }

        int frontRows = rows / 2;

        if (rowNumber <= frontRows) {
            currentIncome += 10;
            return 10;
        } else {
            currentIncome += 8;
            return 8;
        }
    }

    // Controllo validità posto
    // -1: fuori limiti
    //  0: già acquistato
    //  1: disponibile
    public int checkSeat(int rowNumber, int seatNumber) {

        if (rowNumber < 1 || rowNumber > rows || seatNumber < 1 || seatNumber > seats) {
            return -1;
        }

        if (sala[rowNumber - 1][seatNumber - 1] == 'B') {
            return 0;
        }

        return 1;
    }

    // Stampa statistiche
    public void statistic(int counter) {
        System.out.println("Number of purchased tickets: " + counter);

        double percentage = (double) counter / (rows * seats) * 100;
        System.out.printf("Percentage: %.2f%%%n", percentage);

        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome());
    }

    // Calcolo incasso massimo possibile
    public int totalIncome() {
        int totalSeats = rows * seats;

        if (totalSeats <= 60) {
            return totalSeats * 10;
        }

        int frontRows = rows / 2;
        int backRows = rows - frontRows;

        int frontIncome = frontRows * seats * 10;
        int backIncome = backRows * seats * 8;

        return frontIncome + backIncome;
    }
}
