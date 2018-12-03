public class Person {

    private String gender;
    private int age;
    private BodyMassIndex bmi;

    public Person(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public BodyMassIndex getBmi() {
        return bmi;
    }

    public void setBmi(BodyMassIndex bmi) {
        this.bmi = bmi;
    }
}
