public class NotenDemo {
    public static void main(String[] args) {
        int Punkte = 90;

        System.out.println(Notentext(Punkte));
    }

    public static String Notentext(int Punkte) {
        String Note ="";
        if (Punkte >= 90) {
            Note="Sehr Gut";
        } else if (Punkte >= 78) {
            Note="Gut";
        } else if (Punkte >= 65) {
            Note="Befriedigend";
        } else if (Punkte >= 51) {
            Note="Genügend";
        } else {
            Note="Ungenügend";
        }
        return Note;
    }
}