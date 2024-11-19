import java.util.Scanner;

public class vezbi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SLL<String> list = new SLL<>();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            list.insertLast(element);
        }
        int L = scanner.nextInt();
        System.out.println(list);
        SLLNode<String> pokazuvac = list.getFirst();
        while (pokazuvac != null) {
            if (pokazuvac.element.length() == L) {
                list.insertAfter("Target", pokazuvac);
                pokazuvac = pokazuvac.succ;
            }
            pokazuvac = pokazuvac.succ;
        }
        System.out.println(list);
    }
}
