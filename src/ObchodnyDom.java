public class ObchodnyDom {
    private float rozloha;
    private int pocetPoschodi;
    private int pocetPokladni;

    ObchodnyDom (float rozloha, int pocetPoschodi, int pocetPokladni) {
        this.rozloha = rozloha;
        this.pocetPoschodi = pocetPoschodi;
        this.pocetPokladni = pocetPokladni;
    }

    public float vypocetCenyObchodu(){
        float cena = (rozloha * pocetPoschodi) + 5000 * pocetPokladni;
        System.out.println("Cena obchodu: " + cena);
        return cena;
    }



}
