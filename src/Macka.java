public class Macka extends Zviera {
    Macka(int pocetNoh, String rasa, float hmotnost, int vek) {
        this.pocetNoh = pocetNoh;
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.vek = vek;
    }

    public void urobZvuk() {
        System.out.println("Miau");
    }

}
