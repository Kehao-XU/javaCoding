package Lesson4;

public class DLList<JoustJane> {
    private class StuffNode{
        public JoustJane item;
        public StuffNode prev;
        public StuffNode next;

        public StuffNode(JoustJane i, StuffNode p, StuffNode n) {
            item = i;
            prev = p;
            next = n;
        }

        public StuffNode(JoustJane i) {
            item = i;
            prev = this;
            next = this;
        }
    }

    private StuffNode sentiNode;
    private int size;

    public DLList() {
        sentiNode = new StuffNode(null);
        size = 0;
    }

    public DLList(JoustJane x) {
        sentiNode = new StuffNode(null);
        sentiNode.prev = sentiNode.next = new StuffNode(x, sentiNode, sentiNode);
        size = 1;
    }

    public void addFirst(JoustJane x) {
        sentiNode.next = sentiNode.next.prev = new StuffNode(x, sentiNode, sentiNode.next);
        size++;
    }

    public JoustJane getFirst() {
        return sentiNode.next.item;
    }

    public int size() {
        return size;
    }

    public void addLast(JoustJane x) {
        sentiNode.prev = sentiNode.prev.next = new StuffNode(x, sentiNode.prev, sentiNode);
        size++;
    }

    public void printList() {
        StuffNode p = sentiNode.next;
        for (int i = 0; i<size; i++) {
            System.out.println(p.item);
            p = p.next;
        }
    }
}
