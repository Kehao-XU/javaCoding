package Lesson4;

public class DLListLauncher {
    public static void main(String[] args) {
        DLList<String> L=new DLList<>("Hello");
        L.addLast("World!");
        L.printList();
        System.out.println(L.size());
    }
}
