package com.pavlyshyn;

import java.util.*;

public class Store {
    static List<Flower> inventory = new ArrayList<Flower>() {
        {
            add(new Flower(FlowerType.CHAMOMILE, 12));
            add(new Flower(FlowerType.ROSE, 6));
            add(new Flower(FlowerType.CHAMOMILE, 12));
            add(new Flower(FlowerType.ROSE, 7));
            add(new Flower(FlowerType.NARCISSUS, 12));
            add(new Flower(FlowerType.NARCISSUS, 7));

        }
    };
    static List<Bouquet> bouquets = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static Bouquet generateBouquet(int number, FlowerType flowerType) {
        Bouquet bouquet = new Bouquet();
        int currentNumber = 0;
        for (Flower flower : inventory) {
            if (flower.flowerType.equals(flowerType)) {
                bouquet.addFlower(flower);
                currentNumber++;
            }
            if (currentNumber == number) {
                bouquet.sort();
                return bouquet;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String typeOfFlowers;
        int number;
        Bouquet temp;
        while (true) {
            System.out.println("Available flowers");
            System.out.println(inventory);
            System.out.println("Enter number of flowers");
            do {
                number = scanner.nextInt();
                scanner.nextLine();
            } while (!(number > 0));

            System.out.println("Choose type of flowers");
            typeOfFlowers = scanner.nextLine().toUpperCase();
            temp = generateBouquet(number, FlowerType.valueOf(typeOfFlowers));
            if (temp == null) {
                System.err.println("There\'s no available  such bouquet");
            } else {
                bouquets.add(temp);
                System.out.println("Congratulations!!!\nYou has created such bouquet: ");
                System.out.println(temp);
            }
            System.out.println("If you want to stop, enter: 1, to continue, any");
            if (scanner.nextInt() == 1) {
                break;

            }
        }
    }
}
