package Lesson3;

public class SLList {
    private IntNode sentinel;
    private int size;

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i,IntNode n){
            this.item=i;
            this.next=n;
        }
    }

    public SLList(){
        sentinel=new IntNode(-1,null);
        size=0;
    }

    public SLList(int x){
        sentinel=new IntNode(-1,null);
        sentinel.next=new IntNode(x,sentinel.next);
        size=1;
    }

    public void addFirst(int x){
        sentinel.next=new IntNode(x,sentinel.next);
        size++;
    }

    public int getFirst(){
        return sentinel.next.item;
    }

    public int size(){
        return size;
    }

    public void addLast(int x){
        IntNode p=sentinel;
        while(p.next!=null) p=p.next;
        p.next=new IntNode(x,null);
        size++;
    }

    public void printList(){
        IntNode p=sentinel.next;
        while(p!=null){
            System.out.println(p.item);
            p=p.next;
        }
    }

    public static void main(String[] args) {
        SLList L=new SLList(5);
        L.addLast(10);
        L.addLast(15);
        L.addLast(20);

        L.printList();
        System.out.println("Size:"+L.size());
    }
}
