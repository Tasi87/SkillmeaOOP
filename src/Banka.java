public class Banka {

    private int roky;
    private float pociatocnyVklad;
    private float urokovaSadzba;
    private float poplatky;
    private float konecnaCiastka;

    public Banka(int roky, float pociatocnyVklad, float urokovaSadzba, float poplatky) {
        this.roky = roky;
        this.pociatocnyVklad = pociatocnyVklad;
        this.urokovaSadzba = urokovaSadzba;
        this.poplatky = poplatky;
    }

    public  float vypocetSporiacehoUctu() {
        konecnaCiastka = pociatocnyVklad;

        for (int i = 0; i < roky; i ++){
            konecnaCiastka += konecnaCiastka * (urokovaSadzba/100) - poplatky;
        }

        return konecnaCiastka;
    }


}
