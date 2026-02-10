public class DogLauncher {
    public static void main(String[] args) {
        Dog smallDog = new Dog(15);
        Dog mediumDog = new Dog(50);
        Dog hugeDog = new Dog(130);

        Dog.biggerDog(smallDog,mediumDog).makeNoise();
    }
}
