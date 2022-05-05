import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Test()
@Listeners({Listners.class})
public class TestCalculator {

    Calculator calculator;

    @BeforeMethod
    void setUp()  {
        calculator = new Calculator();
    }

    @Test (priority = 0, groups = {"Test"})
    void testAddingTwoNumbers() {
        Assert.assertEquals(10, calculator.add(5,5), "5 + 5 should equal 10");
    }

    @Test (priority = 1, groups = {"Test"}, dependsOnMethods = {"testAddingTwoNumbers"})
    void testSubtractingTwoNumbers() {
        Assert.assertEquals(1, calculator.subtract(5,4), "5 - 4 should equal 1");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    void testMultiplyingTwoNumbers() {
        Assert.assertEquals(25, calculator.multiply(5, 5), "5 * 5 should equal 25");
    }

    @Test
    void testAreaOfCircle(){
        Assert.assertEquals(50, calculator.calculateAreaOfCircle(4),
                "The area of a circle with radius 4 should be 50");
    }

    @Test
    void testConvertToDecimalSuccess() {
        double result = calculator.convertToDecimal(3, 4);
        Assert.assertEquals(0.75, result, "The decimal should be 0.75");
    }
}
