package Lesson2;

public class NumberList {
    int value;
    NumberList next;

    public NumberList(int v,NumberList n){
        value=v;
        next=n;
    }

    public int sum(){
        if(this.next==null) return this.value;
        else return this.next.sum()+this.value;
    }

    public int max(){
        if(this.next==null) return this.value;
        else{
            int nextMax=this.next.max();
            return Math.max(this.value,nextMax);
        }
    }

    public int min(){
        if(this.next==null) return this.value;
        else{
            int nextMin=this.next.min();
            return Math.min(this.value,nextMin);
        }
    }

    public boolean contains(int target){
        if(this.value==target) return true;
        else if(this.next==null) return false;
        else return this.next.contains(target);
    }

    public NumberList reverse(){
        if(this.next==null){
            return this;
        }
        NumberList newHead=this.next.reverse();
        this.next.next=this;
        this.next=null;
        return newHead;
    }
}
