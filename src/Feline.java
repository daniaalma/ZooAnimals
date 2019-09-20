public class Feline extends Animal { 
    public void roam() {
        System.out.println("Going the distance");
    }
    public void eat () {
        System.out.println("Feline's need their meat!");
    }
    public void wakeUp () { // Overriden from the method in "Animal" class
        System.out.println("Zzz...Feline's hate waking up");
    }
}
