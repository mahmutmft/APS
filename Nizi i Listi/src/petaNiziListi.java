import java.util.Scanner;

public class petaNiziListi {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        SLL<String> list = new SLL<>();
        scanner1.nextLine();
        for (int i = 0; i < n; i++) {
            String element = scanner1.nextLine();
            list.insertLast(element);
        }
        int L = scanner1.nextInt();
        scanner1.nextLine();
        System.out.println(list);
        SLLNode<String> pokazuvac = list.getFirst();
        int counter=0;
        while (pokazuvac != null) {
            counter++;
            if (pokazuvac.element.length() == L) {
                String ime = list.delete(pokazuvac);
                list.insertLast(ime);
                pokazuvac = pokazuvac.succ;
            } else {
                pokazuvac = pokazuvac.succ;
            }
            if (counter == n) {
                break;
            }
        }
        System.out.println(list);
    }
}
