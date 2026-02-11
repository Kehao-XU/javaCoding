package Lesson2;

public class IncrList {
    public int value;
    public IncrList next;

    public IncrList(int v,IncrList n){
        this.value=v;
        this.next=n;
    }

    public static IncrList IncrCopy(int x,IncrList L){
        if(L.next==null){
            IncrList Q=new IncrList(L.value+x, null);
            return Q;
        }
        else{
            IncrList Q=new IncrList(L.value+x,L.next);
            Q.next=IncrCopy(x,L.next);
            return Q;
        }
    }

    public static void DincrCopy(int x,IncrList L){
        if(L.next==null){
            L.value+=x;
        }
        else{
            L.value+=x;
            DincrCopy(x, L.next);
        }
    }

    public void printList(){
        IncrList q=this;
        while(q!=null){
            System.out.println(q.value);
            q=q.next;
        }
    }

    public static void main(String[] args) {
        IncrList L=new IncrList(43, null);
        L=new IncrList(3, L);
        L.printList();

        IncrList Q=IncrCopy(2,L);
        Q.printList();
    }
}
