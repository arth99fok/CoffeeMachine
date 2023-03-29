import java.util.Scanner;

public class CoffeeMachine {
    final static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int disposableCups = 9;
    static int money = 550;
    static String action;
    static boolean isExit = false;

    public static void main(String[] args) {
        startMachine();
    }

    public static void startMachine() {
        while(!isExit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
            switch (action) {
                case "buy" -> buy();
                case "fill" -> fill();
                case "take" -> take();
                case "remaining" -> remaining();
                case "exit" -> isExit = true;
            }

        }
    }

    public static void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                "back - to main menu:");
        action = scanner.next();
        int waterLimit;
        int coffeeLimit;
        int milkLimit;
        switch (action) {
            case "1" -> {
                waterLimit = 250;
                coffeeLimit = 16;
                if (water < waterLimit) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if (coffee < coffeeLimit) {
                    System.out.println("Sorry, not enough coffee!");
                    System.out.println();
                } else if (disposableCups == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                    System.out.println();
                } else {
                    water -= waterLimit;
                    coffee -= coffeeLimit;
                    disposableCups--;
                    money += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                }
            }
            case "2" -> {
                waterLimit = 350;
                coffeeLimit = 20;
                milkLimit = 75;
                if (water < waterLimit) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if (milk < milkLimit) {
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                } else if (coffee < coffeeLimit) {
                    System.out.println("Sorry, not enough coffee!");
                    System.out.println();
                } else if (disposableCups == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                    System.out.println();
                } else {
                    water -= waterLimit;
                    coffee -= coffeeLimit;
                    milk -= milkLimit;
                    disposableCups--;
                    money += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                }
            }
            case "3" -> {
                waterLimit = 200;
                milkLimit = 100;
                coffeeLimit = 12;
                if (water < waterLimit) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if (milk < milkLimit) {
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                } else if (coffee < coffeeLimit) {
                    System.out.println("Sorry, not enough coffee!");
                    System.out.println();
                } else if (disposableCups == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                    System.out.println();
                } else {
                    water -= waterLimit;
                    coffee -= coffeeLimit;
                    disposableCups--;
                    milk -= 100;
                    money += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                }
            }
        }
    }

    public static void fill() {
        System.out.println();
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffee += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        disposableCups += scanner.nextInt();
        System.out.println();
    }

    public static void take() {
        System.out.println();
        System.out.printf("I gave you $%d\n", money);
        money = 0;
        System.out.println();
    }
    public static void remaining() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }
}
