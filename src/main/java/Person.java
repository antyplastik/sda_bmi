public class Person {

    private Gender gender;
    private int age;
    private BodyMassIndex bmi;
    private BMIanalyzer bmIanalyzer;

    public Person(Gender gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public BodyMassIndex getBmi() {
        return bmi;
    }

    public void setBmi(BodyMassIndex bmi) {
        this.bmi = bmi;
    }

    public BMIanalyzer getBmIanalyzer() {
        return bmIanalyzer;
    }
}

enum Gender {
    MALE, FEMALE
}
