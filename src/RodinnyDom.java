public class RodinnyDom {
    private int pocetPoschodi;
    private String material;
    private float rozloha;
    private int pocetOkien;

    RodinnyDom(int pocPos, String mat, float roz) {
        pocetPoschodi = pocPos;
        material = mat;
        rozloha = roz;
    }


    public float vypocetCenyDomu(int cenaZaMeter, String menoRodiny){
        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoRodiny + " " + cena);
        return cena;
    }

}
