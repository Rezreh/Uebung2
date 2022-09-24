public class WinterreifenpflichtDemo {


    public static void main(String[] args) {

        int temperatur = 5;
        boolean rutschigeFahrbahn = true;
        //hello

        System.out.println(wrpflicht(temperatur, rutschigeFahrbahn));
    }

    public static boolean wrpflicht(int temperatur, boolean Fahrbahn) {
        if (temperatur<10) {
            if (Fahrbahn) {
                return true;
            }
            if (temperatur < 4) {
                return true;
            }
        }
        return false;
    }
}
