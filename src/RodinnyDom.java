public class RodinnyDom extends Stavba {
    private String material;
    private int pocetOkien;

    RodinnyDom(int pocetPoschodi, String material, float rozloha) {
        this.pocetPoschodi = pocetPoschodi;
        this.material = material;
        this.rozloha = rozloha;
    }


    public float vypocetCenyDomu(int cenaZaMeter, String menoRodiny){
        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoRodiny + " " + cena);
        return cena;
    }

}
