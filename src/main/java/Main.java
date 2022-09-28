public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(sum(2,5));
        System.out.println(checkNumberGreaterThan100(105));
    }

    public static int sum(int value1, int value2) {
        return value1 + value2;
    }
    public static boolean checkNumberGreaterThan100(int number) {

        return number>100;
    }
}