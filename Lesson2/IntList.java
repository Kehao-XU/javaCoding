package Lesson2;

public class IntList {
    public int first;
    public IntList rest;
    
    public IntList(int f,IntList r){
        first=f;
        rest=r;
    }

    public int size(){
        /* Return the size of the list using recursion */
        if(rest==null) return 1;
        else return rest.size()+1;
    }

    public int iterativeSize(){
        /* Return the size of the list using iteration */
        IntList p = this;
        int totalSize=0;
        while(p!=null){
            totalSize++;
            p=p.rest;
        }
        return totalSize;
    }

    public int get(int i){
        if(i!=0){
            return this.rest.get(i-1);
        }
        else return this.first;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15,null);
        L=new IntList(10,L);
        L=new IntList(5,L);

        System.out.println(L.iterativeSize());
        System.out.println(L.get(0));
    }
}
