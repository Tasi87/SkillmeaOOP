public class Stavba {
    protected float rozloha;
    protected int pocetPoschodi;

    public float vypocetCenyDomu(int cenaZaMeter, String menoRodiny) {
        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoRodiny + " " + cena);
        return cena;
    }
}
