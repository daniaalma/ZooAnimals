public class Dog extends Canine {
    public void makeNoise() {
        System.out.println("Woof Woof");
    }
    public void roam() {//Override roam from the "Canine" class
        System.out.println("Looking for a bone");
    }
    public void wakeUp () { //Override wakeup from the "Animal" class
        System.out.println("Zzz - Yes! It's a new day!");
    }
}
