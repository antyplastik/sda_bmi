public class Person {

    private Gender gender;
    private int age;
    private BodyMassIndex bmi;
    private BMIanalyzer bmIanalyzer;
    private double growth;
    private double weight;

    public Person(Gender gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public Person(Gender gender, int age, double growth, double weight) {
        this.gender = gender;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }

    public void setBmi(BodyMassIndex bmi) {
        this.bmi = bmi;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getBmiValue() {
        if (bmi == null){
            bmi = new BodyMassIndex(growth,weight);
        }
        double bmiValue = bmi.getBodyMassIndex();
        return bmiValue;
    }

    public BodyMassIndex getBmi() {
        return bmi;
    }

    public String getBmiAnalyzeResult() {
        bmIanalyzer = new BMIanalyzer(new Person(getGender(), getAge()));
        return bmIanalyzer.getBmiAnalyzeResult();
    }
}


enum Gender {
    MALE, FEMALE
}
