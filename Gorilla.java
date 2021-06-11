public class Gorilla extends Mammal{


    public void createGorilla() {
        System.out.println("Hey look a monkey!!");
        energyLevel += 100;
    }

    public void throwSomething() {
        System.out.println("The Gorilla threw a banana peel and exherted some energy!");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("The Gorilla ate a banana replenishing some energy!");
        energyLevel += 10;
    }

        public void climbTree() {
        System.out.println("The Gorilla climbed a tree and exherted some energy!");
        energyLevel -= 10;
    }
}