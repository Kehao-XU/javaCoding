package Lesson2;

public class WalrusLauncher {
    public static void main(String[] args) {
        Walrus walrus = new Walrus(3500, 10.5);
        int x = 9;
        doStuff(walrus,x);
        walrus.printWalrus();
        System.out.println(x);
    }
    public static void doStuff(Walrus W,int x){
        W.weight=W.weight-100;
        x-=5;
    }
}
