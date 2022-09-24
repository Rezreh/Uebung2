public class TurmDemo {
    public static void main(String[] args) {

        int multiplikator = 2;
        int number = 3;
        int result;

        while (multiplikator >= 2 && multiplikator < 10) {
            result = number * multiplikator;
            System.out.println(number + " * " + multiplikator + " = " + result);
            multiplikator++;
        }
        while (2 < multiplikator && 10 >= multiplikator) {
            multiplikator--;
            result = number / multiplikator;
            System.out.println(number + " / " + multiplikator + " = " + result);
        }
    }
}
