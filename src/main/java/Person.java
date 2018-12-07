public class Person {

    private Gender gender;
    private int age;
    private BodyMassIndex bmi;
    private BMIanalyzer bmIanalyzer;

    public Person(Gender gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public void setBmi(BodyMassIndex bmi) {
        this.bmi = bmi;
    }

    public Gender getGender() {
        return gender;
    }

    public double getBmiValue() {
        double bmiValue = bmi.getBodyMassIndex();
        return bmiValue;
    }

    public BodyMassIndex getBmi(){
        return bmi;
    }

    public BMIanalyzer getBmiAnalyze() {
        return bmIanalyzer;
    }
}

enum Gender {
    MALE, FEMALE
}
