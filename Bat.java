public class Bat extends Mammal {
    public void createBat() {
        System.out.println("What kind of friggen bat is that?!?!");
        energyLevel += 300;
    }
    public void fly () {
        System.out.println("The Bat is flying rampidly!!!");
        energyLevel -= 50;
    }
    public void eatHumans () {
        System.out.println("The Bat is eating people!?!?!?");
        energyLevel += 25;
    }
    public void attackTown () {
        System.out.println("The Bat is attacking hogwarts!!!!");
        energyLevel -= 100;
    }
}