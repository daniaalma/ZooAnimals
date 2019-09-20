import java.util.Random;
public class Cat extends Feline {
    public void makeNoise() { // It makes sense to make each individual animal make their own noise similar to slide 17, Lecture 5
        System.out.println("Meow Meow Meow");
    }
    public void eat() { //This will override the method inherited from class "Feline" 
        System.out.println("I'm so hungry right meow!");
    }
    public void roam() { //cats do what they want! Cat may "disobey" when asked to get some exercise by the zoo keeper and choose to do one of the 5 commands. 
        Random rand = new Random();
        int randomNum = rand.nextInt(((5-1)+1)+1); //Get the random number
        if (randomNum<=1) {
            System.out.println("Meow Meow Meow"); // make noise
        }
        else if (randomNum==2) {
            System.out.println("Going the distance"); // roam
        }
        else if (randomNum==3) {
            System.out.println("I'm so hungry right meow!"); // eat
        }
        else if (randomNum==4) {
            System.out.println(" *Yawn*....Zzzzzzzzz"); // sleep
        }
        else {
            System.out.println("Zzz...I'm waking up "); // wake up
        }
    }
}
