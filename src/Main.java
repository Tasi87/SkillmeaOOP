import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Random ranNum = new Random();

        RodinnyDom domNovakovych = new RodinnyDom(4, "mramor", 457f);
        float cenaPrvehoDomu = domNovakovych.vypocetCenyDomu(150, "Novakovy");

        RodinnyDom domKralickovych = new RodinnyDom(3, "drevo", 646f);
        float cenaDruhehoDomu = domKralickovych.vypocetCenyDomu(200, "Kralickovy");

        System.out.println("Cena dokopy: " + cenaPrvehoDomu + cenaDruhehoDomu);


        /*
        String nejakyText = "niečo";
                    =
        String nejakyText = new String("niečo");
        */


    }
}