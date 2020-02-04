package pl.michalgorski.task3.models.services;

import java.util.Random;

public class RandomService {

    public static int getSumOfTwoDices() {
        Random random = new Random();

        int firstDiceValue;
        int secondDiceValue;
        int sumOfTwoDices;

        firstDiceValue = random.nextInt(6) + 1;
        secondDiceValue = random.nextInt(6) + 1;
        sumOfTwoDices = firstDiceValue + secondDiceValue;

        return sumOfTwoDices;
    }
}