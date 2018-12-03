import static java.lang.Math.*;

public class BodyMassIndex implements BMI {

    private double growth;
    private double weight;
    private double bodyMassIndex;

    public BodyMassIndex(double growth, double weight) {
        this.growth = growth;
        this.weight = weight;
    }

    @Override
    public double calcBMI() {

        bodyMassIndex = weight / pow(growth,2);

        return bodyMassIndex;
    }

    @Override
    public boolean isBMIgood() {

        return false;
    }

}
