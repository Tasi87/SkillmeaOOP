public class RodinnyDom {
    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOkien;

    RodinnyDom() {
        System.out.println("Teraz sa volá konštruktor!");
    }


    public float vypocetCenyDomu(int cenaZaMeter, String menoRodiny){
        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoRodiny + " " + cena);
        return cena;
    }

}
