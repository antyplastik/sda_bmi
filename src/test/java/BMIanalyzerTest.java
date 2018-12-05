import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class BMIanalyzerTest {

    Person male;
    Person female;

    @Before
    public void setUp() {
        male = new Person(Gender.MALE, 29);
        female = new Person(Gender.FEMALE, 30);
    }

    @Test
    public void checkIfTheWomanHasMalnutrition(double growth, double weight) {
//        assertThat(female.setBmi(new BodyMassIndex(growth,weight)));
    }

    @Test
    public void checkIfTheWomanHasTheCorrectWeight() {

    }

    @Test
    public void checkIfTheWomanIsOverweight() {

    }

    @Test
    public void checkIfTheManHasMalnutrition(double growth, double weight, boolean expected) {
        male.setBmi(new BodyMassIndex(growth, weight));
        assertThat(male.getBmIanalyzer().checkIfMalnuration(male),is(true));
    }

    @Test
    public void checkIfTheManHasTheCorrectWeight(){

    }

    @Test
    public void checkIfTheManIsOverweight(){

    }
}
