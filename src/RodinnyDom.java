public class RodinnyDom extends Stavba {
    private String material;
    private int pocetOkien;

    RodinnyDom(int pocetPoschodi, String material, float rozloha) {
        this.pocetPoschodi = pocetPoschodi;
        this.material = material;
        this.rozloha = rozloha;
    }
}
