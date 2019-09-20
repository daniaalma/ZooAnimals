public class Wolf extends Canine {
    public void makeNoise() {
        System.out.println("*Howls* Oooooooo");
    }

    public void eat () { // Overriden from "Canine" class
        System.out.println("My favorite part of the day");
    }
}
