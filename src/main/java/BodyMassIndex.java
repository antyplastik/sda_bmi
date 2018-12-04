import java.util.logging.Logger;

import static java.lang.Math.*;

public class BodyMassIndex implements BMI {

    private double growth;
    private double weight;
    private double bodyMassIndex;

    public BodyMassIndex(double growth, double weight) {
//        Logger logger = null;
//        try {
            this.growth = checkGrowth(growth);
//        } catch (IllegalArgumentException e) {
//            logger.info("[ERROR] Bad argument");
//        }
//        try {
            this.weight = checkWeight(weight);
//        } catch (IllegalArgumentException e) {
//            logger.info("[ERROR] Bad argument");
//        }
    }


    @Override
    public double checkGrowth(double growth) {
        if (growth >= 0.5 && growth <= 2.4)
            return growth;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public double checkWeight(double weight) {
        if (weight >=10 && weight<=300)
        return weight;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public double calcBMI() {
        bodyMassIndex = weight / pow(growth, 2);
        return bodyMassIndex;
    }


    public double getGrowth() {
        return growth;
    }

    public double getWeight() {
        return weight;
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }
}
