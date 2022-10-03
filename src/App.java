import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("digite o lado");
        a = sc.nextDouble();

        b = a*a;
        c = b*2;

        System.out.println("a area e " + b);

        System.out.println("o dobro da area e " + c);
    }
}
