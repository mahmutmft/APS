import java.util.Scanner;

public class cetvortaNiziListi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        SLL<String> list = new SLL<>();
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            list.insertLast(element);
        }
        int L = scanner.nextInt();
        System.out.println(list);
        SLLNode<String> pokazuvac = list.getFirst();
        while (pokazuvac != null) {
            if (pokazuvac.element.length() > L) {
                list.insertBefore("Outlier", pokazuvac);
            }
            pokazuvac = pokazuvac.succ;
        }
        System.out.println(list);
    }
}
