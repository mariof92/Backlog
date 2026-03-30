package BacklogVideogiochi;

import java.util.Scanner;

public class GameManager {
    private LibreriaGiochi libreria = new LibreriaGiochi();
    private Scanner scanner = new Scanner(System.in);

    private void aggiungiGioco() {
        System.out.println("Titolo: ");
        String titolo = scanner.nextLine();

        System.out.println("Genere: ");
        String genere = scanner.nextLine();

        System.out.println("Piattaforma: ");
        String piattaforma = scanner.nextLine();

        System.out.println("Ore giocate: ");
        int ore = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Stato: ");
        String stato = scanner.nextLine();

        Gioco g = new Gioco(titolo, genere, piattaforma, ore, stato);
        libreria.aggiungiGioco(g);

        System.out.println("Gioco aggiunto!");
    }

    private void modificaStato() {
        System.out.println("Titolo del gioco da modificare: ");
        String titolo = scanner.nextLine();

        Gioco g = libreria.cercaGioco(titolo);

        if (g == null) {
            System.out.println("Gioco non trovato");
            return;
        }

        System.out.println("Nuovo stato: ");
        String nuovoStato = scanner.nextLine();

        g.setStato(nuovoStato);
        System.out.println("Stato aggiornato");
    }

    private void modificaOre() {
        System.out.print("Titolo del gioco da modificare: ");
        String titolo = scanner.nextLine();

        Gioco g = libreria.cercaGioco(titolo);

        if (g == null) {
            System.out.println("Gioco non trovato.");
            return;
        }

        System.out.print("Nuove ore giocate: ");
        int nuoveOre = scanner.nextInt();
        scanner.nextLine();

        g.setOre(nuoveOre);
        System.out.println("Ore aggiornate!");
    }

    public void avvia() {
        int scelta;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Aggiungi gioco");
            System.out.println("2. Mostra giochi");
            System.out.println("3. Modifica stato");
            System.out.println("4. Modifica ore");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    aggiungiGioco();
                    break;
                case 2:
                    libreria.mostraGiochi();
                    break;
                case 3:
                    modificaStato();
                    break;
                case 4:
                    modificaOre();
                    break;
            }

        } while (scelta != 0);

        System.out.println("Chiusura programma");

    }
}
