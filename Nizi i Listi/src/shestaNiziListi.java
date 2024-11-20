import java.util.Scanner;

public class shestaNiziListi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        SLL<String> list = new SLL<>();
        for (int i = 0; i < n; i++) {
            list.insertLast(scanner.nextLine());
        }
        int L = scanner.nextInt();
        System.out.println(list);
        SLLNode<String> node = list.getFirst();
        SLLNode<String> posleden = null;
        while (node != null) {
            if (node.element.length() == L) {
                posleden = node;
            }
            node = node.succ;
        }
        if (posleden != null) {
            list.delete(posleden);
            list.insertFirst(posleden.element);
        }
        System.out.println(list);
    }
}