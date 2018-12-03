import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.converters.Param;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

@RunWith(JUnitParamsRunner.class)
public class BMItest {

    Person male;

    @Before
    public void setUp() {
        male = new Person("Male", 29);

    }

    private Object[] customParams() {
        return new Object[]{
                new Object[]{173, 68, 22.72}
        };
    }

    @Test
    @Parameters(method = "customParams")
    public void checkIfTheBalanceIsCorrectlyEntered(double growth, double weight, double expected){


    }

    @Test
    @Parameters(method = "customParams")
    public void checkIfTheGrowthIsCorrectlyEntered(double growth, double weight, double expected){

    }

    @Test
    @Parameters(method = "customParams")
    public void calcBMIforCustomHeightAndWeight(double growth, double weight, double expected) {
        male.setBmi(new BodyMassIndex(growth, weight));
        Assert.assertEquals(expected, male.getBmi().calcBMI(),0.01);
    }



    @Test
    public void checkIsBMIgood() {

    }


}
