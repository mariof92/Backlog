package BacklogVideogiochi;

import java.util.ArrayList;

public class LibreriaGiochi {
    ArrayList <Gioco> giochi = new ArrayList<>();

    public LibreriaGiochi() {
        this.giochi = new ArrayList<>();
    }

    public void aggiungiGioco(Gioco g) {
        giochi.add(g);
    }

    public void mostraGiochi() {
       for (Gioco g : giochi) {
           g.stampaDettagli();
           System.out.println("-----");
       }
    }

    public Gioco cercaGioco(String titoloCercato) {
        for (Gioco g : giochi) {
            if (g.getTitolo().equals(titoloCercato)) {
                return g;
            }
        }
        return null;
    }

}
