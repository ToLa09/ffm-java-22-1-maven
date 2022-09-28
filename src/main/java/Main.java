public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(sum(2,5));
        System.out.println(checkNumberGreaterThan100(105));

        System.out.println(faculty(3));
        System.out.println(faculty(4));
        System.out.println(faculty(5));
    }

    public static int sum(int value1, int value2) {
        return value1 + value2;
    }
    public static boolean checkNumberGreaterThan100(int number) {

        return number>100;
    }

    public static int faculty(int number) {
        int result = 1;
        int i = 1;
        while (i <= number){
            result *= i;
            i++;
        }
        //for(int i = 1; i <= number; i++) {
        //    result *= i;
        //}
        return result;
    }
    public static int facultyRecursion(int number){
        if(number <= 1){
            return 1;
        } else
            return faculty(number-1) * number;
    }
}