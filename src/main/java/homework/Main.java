package homework;

public class Main {

    public static void main(String[] args) {
        // всегда меняет дверь
        MontyHall simulationTrue = new MontyHall(1000, true);
        System.out.println("Игрок всегда меняет дверь");
        simulationTrue.runGame();

        // никогда не меняет дверь
        MontyHall simulationFalse = new MontyHall(1000, false);
        System.out.println("Игрок никогда не меняет дверь");
        simulationFalse.runGame();
    }
}
