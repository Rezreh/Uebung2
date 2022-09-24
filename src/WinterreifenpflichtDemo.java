public class WinterreifenpflichtDemo {


    public static void main(String[] args) {

        int temperatur = 5;
        boolean rutschigeFahrbahn = true;
        //hello

        System.out.println(wrpflicht(temperatur, rutschigeFahrbahn));
    }

    public static String wrpflicht(int temperatur, boolean Fahrbahn) {
        if (temperatur<10) {
            if (Fahrbahn) {
                return "Bitte Winterreifen verwenden";
            }
            if (temperatur < 4) {
                return "Bitte Winterreifen verwenden";
            }
        }
        return "Winterreifen sind nicht erforderlich";
    }
}
