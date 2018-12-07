import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(JUnitParamsRunner.class)
public class PersonBmiTest {

    Person female;

    @Before
    public void setUp() {
        female = new Person(Gender.FEMALE, 30);
    }

    @Test
    @Parameters(method = "personBMI")
    public void checkPersonBMI(double growth, double weight, double expected) {
        female.setBmi(new BodyMassIndex(growth,weight));
        assertThat(female.getBmiAnalyzeResult(),is(expected));
    }

    public Object[] personBMI(){
        return new Object[]{
          new Object[]{1.61,55, 21}
        };
    }
}
