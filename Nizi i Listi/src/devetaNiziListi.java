import java.util.Scanner;
public class devetaNiziListi {
    public static int findIndex(int i, int n){
        while(i<0){
            i = n+i;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DLL<Integer> list = new DLL<>();
        for (int i=0;i<n;i++){
            list.insertLast(scanner.nextInt());
        }
        int index = Integer.MIN_VALUE;
        System.out.println(list);
        DLLNode<Integer> brisi = null;
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        DLLNode<Integer> pokazuvac = list.getFirst();
        for (int i=0;pokazuvac != null;i++){
            if(pokazuvac.element == N){
                brisi = pokazuvac;
                index = i-M;
            }
            pokazuvac = pokazuvac.succ;
        }
        boolean wasNegative = false;
        if(index < 0 && index != Integer.MIN_VALUE){
            wasNegative = true;
            index = findIndex(index, n);
        }
        DLLNode<Integer> node = null;
        pokazuvac = list.getFirst();
        for (int i=0;pokazuvac != null;i++){
            if(i == index) {
                node = pokazuvac;
                break;
            }
            pokazuvac = pokazuvac.succ;
        }
        if(index != Integer.MIN_VALUE) {
            list.delete(brisi);
           if(wasNegative) list.insertAfter(brisi.element, node);
           else list.insertBefore(brisi.element, node);
        }
        else System.out.println("Elementot ne postoi vo listata");
        System.out.print(list);
    }
}









