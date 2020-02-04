package pl.michalgorski.task3.models.services;

public class MaxPointsService {

    public static double getMaxPoints() {
        double maxPoints = 10.0;
        for (int i = 2; i <= 10; i++) {
            maxPoints += (12.0 / i);
        }
        return maxPoints;
    }

}
