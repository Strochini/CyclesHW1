public class Main {
    public static void main(String[] args) {
        System.out.println("First task\n");

        for (int a = 1; a <= 10; a ++) {
            System.out.println(a);

        }
        System.out.println("\nSecond task\n");

        for (int b = 10; b >= 1; b --) {
            System.out.println(b);
        }

        System.out.println("\nThird task\n");

        for (int c = 0; c <= 17; c = (c + 2)) {
            System.out.println(c);
        }

        System.out.println("\nFourth task\n");

        for (int d = 10; d >= -10; d --) {
            System.out.println(d);
        }
    }
}