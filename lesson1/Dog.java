public class Dog {
    int weight;
    public Dog(int w) {
        weight=w;
    }
    public void makeNoise(){
        if (weight < 10) {
            System.out.println("yipyipyip!");
        } else if (weight < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }

    public static Dog biggerDog(Dog d1,Dog d2){
        if(d1.weight<d2.weight){
            return d2;
        }else return d1;
    }
}
