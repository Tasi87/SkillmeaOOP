import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Random ranNum = new Random();

        RodinnyDom domNovakovych = new RodinnyDom();
        domNovakovych.pocetPoschodi = 4;
        domNovakovych.rozloha = 457f;
        domNovakovych.material = "mramor";
        domNovakovych.pocetOkien = 16;
        domNovakovych.vypocetCenyDomu(150, "Novakovy");

        RodinnyDom domKralickovych = new RodinnyDom();
        domKralickovych.pocetPoschodi = 3;
        domKralickovych.rozloha = 657f;
        domKralickovych.material = "tehla";
        domKralickovych.pocetOkien = 12;
        domKralickovych.vypocetCenyDomu(200, "Kralickovy");




        /*
        String nejakyText = "niečo";
                    =
        String nejakyText = new String("niečo");
        */


    }
}