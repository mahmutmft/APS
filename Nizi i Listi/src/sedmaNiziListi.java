import java.util.Scanner;

public class sedmaNiziListi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DLL<Integer> list = new DLL<>();
        for (int i=0;i<n;i++){
            list.insertLast(scanner.nextInt());
        }
        int k = scanner.nextInt();
        for (int i=0;i<k;i++){
            DLLNode<Integer> brojka = list.getLast();
            list.delete(brojka);
            list.insertFirst(brojka.element);
        }
        System.out.println(list);
    }
}
