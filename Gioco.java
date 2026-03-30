package BacklogVideogiochi;

public class Gioco {
    private String titolo;
    private String genere;
    private String piattaforma;
    private int ore;
    private String stato;

    public Gioco(String titolo, String genere, String piattaforma, int ore, String stato) {
        this.titolo = titolo;
        this.genere = genere;
        this.piattaforma = piattaforma;
        this.ore = ore;
        this.stato = stato;
    }

    public String getTitolo() {

        return titolo;
    }

    public String getGenere() {

        return genere;
    }

    public String getPiattaforma() {

        return piattaforma;
    }

    public int getOre() {

        return ore;
    }

    public void setOre(int ore) {

        this.ore = ore;
    }

    public String getStato() {

        return stato;
    }

    public void setStato(String stato) {

        this.stato = stato;
    }

    public void stampaDettagli() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Genere: " + genere);
        System.out.println("Piattaforma: " + piattaforma);
        System.out.println("Ore giocate: " + ore);
        System.out.println("Stato: " + stato);
    }

}
