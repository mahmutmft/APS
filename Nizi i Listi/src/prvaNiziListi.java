import java.util.Scanner;

public class prvaNiziListi {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] niza = new int[n];
        float suma = 0;

        for (int i = 0; i < n; i++) {
            niza[i] = cin.nextInt();
            suma += niza[i];
        }
        suma /= n;

        System.out.print("{");
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(niza[i]);
        }
        System.out.println("}");

        System.out.print("{");
        boolean prv = true;
        for (int i = 0; i < n; i++) {
            if (niza[i] >= suma) {
                if (!prv) {
                    System.out.print(",");
                }
                System.out.print(niza[i]);
                prv = false;
            }
        }
        System.out.println("}");
    }
}
