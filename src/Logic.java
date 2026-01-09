public class Logic {

        private char[][] sala;
        private int rows;
        private int seats;

        // inizializza la sala
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

        // stampa la sala
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

        // prenota un posto
        public void book(int rowNumber, int seatNumber) {
            sala[rowNumber - 1][seatNumber - 1] = 'B';
        }

        // calcola il prezzo del biglietto
        public int ticketPrice(int rowNumber) {
            int totalSeats = rows * seats;

            if (totalSeats <= 60) {
                return 10;
            }

            int frontRows = rows / 2;
            if (rowNumber <= frontRows) {
                return 10;
            } else {
                return 8;
            }
        }
    }


