/**
 * program
 */
public class Program {
    public static void main(String[] args) {
        int a = 23;
        a = a-- - --a;
        System.out.println(a);
        System.out.println(factor(3));

    }
    static double factor(int n) {
        if (n==1) return 1;
        return n * factor(n - 1);
        //System.out.println(n);
    }
}