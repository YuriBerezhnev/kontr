public class ex2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 1;
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum(a, b));
    }
    public static int sum(int a, int b) {

        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return sum(a -1, b) +1;
    }
}
