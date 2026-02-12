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

    public int iterativeSum(){
        NumberList p=this;
        int sum=0;
        while(p!=null){
            sum+=p.value;
            p=p.next;
        }
        return sum;
    }

    public int iterativeMax(){
        int max=this.value;
        NumberList p=this;
        while(p!=null){
            if(p.value>max) max=p.value;
            p=p.next;
        }
        return max;
    }

    public boolean iterativeContains(int target){
        NumberList p=this;
        while(p!=null){
            if(p.value==target) return true;
            p=p.next;
        }
        return false;
    }

    public void printList(){
        NumberList p=this;
        while(p!=null){
            System.out.println(p.value);
            p=p.next;
        }
    }

    public void append(int newValue){
        NumberList p=this;
        while(p.next!=null){
            p=p.next;
        }
        p.next=new NumberList(newValue,null);
    }

    public NumberList remove(int target){
        if(this.value==target) return this.next;

        NumberList p=this.next,sentinel=this;
        while(p!=null){
            if(p.value==target){
                sentinel.next=p.next;
                return this;
            }
            p=p.next;
            sentinel=sentinel.next;
        }
        return this;
    }

    public static NumberList createList(int[] values){
        NumberList L=new NumberList(values[0],null);
        for(int i=1;i<values.length;i++){
            L.append(values[i]);
        }
        return L;
    }

    public static NumberList mergeSortedLists(NumberList list1, NumberList list2){
        NumberList current1=list1,current2=list2,L;
        if(current1.value>current2.value){
            L=new NumberList(current2.value,null);
            current2=current2.next;
        }
        else if(current1.value==current2.value){
            L=new NumberList(current1.value, null);
            current1=current1.next;
            current2=current2.next;
        }
        else{
            L=new NumberList(current1.value,null);
            current1=current1.next;
        }

        while(current1!=null&&current2!=null){
            if(current1.value>current2.value){
                L.append(current2.value);
                current2=current2.next;
            }
            else if(current1.value==current2.value){
                L.append(current1.value);
                current1=current1.next;
                current2=current2.next;
            }
            else{
                L.append(current1.value);
                current1=current1.next;
            }
        }

        if(current1!=null){
            while(current1!=null){
                L.append(current1.value);
                current1=current1.next;
            }
        }

        if(current2!=null){
            while(current2!=null){
                L.append(current2.value);
                current2=current2.next;
            }
        }

        return L;
    }

    public static void main(String[] args) {
        int[] values1={1,3,5,7,9,11},values2={1,2,4,6,9};
        NumberList list1=createList(values1),list2=createList(values2);

        System.out.println("===NumberList initialization complete===");
        System.out.println("list1:");
        list1.printList();
        System.out.print("\n");
        System.out.println("list2:");
        list2.printList();
        System.out.print("\n");

        System.out.println("===Recursion methods demonstration===");
        System.out.println("# Based on list1");
        System.out.println("sum:"+list1.sum());
        System.out.println("max:"+list1.max());
        System.out.println("min:"+list1.min());
        System.out.println("Is 13 in this list?");
        System.out.println(list1.contains(13));
        System.out.println("list1(reversed):");
        list1=list1.reverse();
        list1.printList();
        list1=list1.reverse();
        System.out.print("\n");

        System.out.println("===Iterative methods demonstration===");
        System.out.println("# Based on list1");
        System.out.println("sum:"+list1.iterativeSum());
        System.out.println("max:"+list1.iterativeMax());
        System.out.println("Is 13 in this list?");
        System.out.println(list1.iterativeContains(13));
        System.out.print("\n");

        System.out.println("===Tool methods demonstration===");
        System.out.println("# Based on list2");
        System.out.println("append a node with value of 14...");
        list2.append(14);
        System.out.println("list2:");
        list2.printList();
        System.out.println("remove the node with value of 4...");
        list2.remove(4);
        System.out.println("list2:");
        list2.printList();
        System.out.print("\n");

        System.out.println("===MergeSortedLists demonstration===");
        NumberList newList=mergeSortedLists(list1, list2);
        System.out.println("newList:");
        newList.printList();

    }
}
