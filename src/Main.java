import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Random ranNum = new Random();
        RodinnyDom domNovakovych = new RodinnyDom(4, "mramor", 457f);
        float cenaPrvehoDomu = domNovakovych.vypocetCenyDomu(150, "Novakovy");

        RodinnyDom domKralickovych = new RodinnyDom(3, "drevo", 646f);
        float cenaDruhehoDomu = domKralickovych.vypocetCenyDomu(200, "Kralickovy");

        System.out.println("Cena dokopy: " + cenaPrvehoDomu + cenaDruhehoDomu);

        ObchodnyDom Billa = new ObchodnyDom(2600f, 2, 25);
        Billa.vypocetCenyObchodu();

        // Miesto pre zverimex
        Pes alik = new Pes(4, "česko-slovenský vlčiak", 25, 2);
        alik.urobZvuk();

        Macka cica = new Macka(4, "egyptská", 5, 2);
        cica.urobZvuk();

        // Miesto pre banku

        Banka mBank = new Banka(5, 1000f, 3.25f, 5f);
        System.out.println(mBank.vypocetSporiacehoUctu());


    }
}