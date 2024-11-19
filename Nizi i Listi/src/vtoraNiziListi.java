import java.util.Scanner;

public class vtoraNiziListi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SLL<String> lista = new SLL<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            lista.insertLast(element);
        }
        int L = scanner.nextInt();
        System.out.println(lista);
        SLLNode<String> segashen = lista.getFirst();
        while (segashen!=null){
            if (segashen.element.length() < L){
                lista.delete(segashen);
            }
            segashen = segashen.succ;
        }
        System.out.println(lista);
    }

}
