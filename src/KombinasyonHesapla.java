import java.util.Scanner;

public class KombinasyonHesapla {
    public static void main(String[] args) {
        int m, n, r, fac1 = 1, fac2 = 1, p = 1;

        Scanner data = new Scanner(System.in);

        System.out.print("Eleman sayısı giriniz :");
        n = data.nextInt();
        System.out.print("Kombinasyon sayısı giriniz :");
        r = data.nextInt();
        if (n > r) {
            for (int i = 1; i <= n; i++) {
                fac1 = fac1 * i;
            }
            for (int k = 1; k <= r; k++) {
                fac2 = fac2 * k;
            }
            for (m = 1; m <= (n - r); m++) {
                p = p * m;
            }
            System.out.println(n + "'in " + r + "'li kombinasyonu :" + fac1 / (fac2 * p));
            System.out.println();
            System.out.println(n + " faktöriyel :" + fac1);
            System.out.println(r + " faktöriyel :" + fac2);
            System.out.println(n + "-" + r + " faktöriyel :" + p);
        } else {
            System.out.println("Kombinasyon sayısı eleman sayısından büyük olamaz.");
        }
    }
}
