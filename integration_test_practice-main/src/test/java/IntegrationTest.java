import org.example.Calculator;
import org.example.TaxCalculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    private TaxCalculator taxCalculator;

    @Before
    public void setUp() {
        Calculator calculator = new Calculator();
        taxCalculator = new TaxCalculator(calculator);
    }

    @Test
    public void testTaxCalculation() {
        int base_salary = 100;
        int bonus = 10;
        double taxRate = 0.1;
        int expectedResult = 11;
        int result = taxCalculator.calculateTax(base_salary,bonus, taxRate);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testNegativeTaxCalculation() {
        int base_salary = 100;
        int bonus = 50;
        double taxRate = -0.1;
        int expectedResult = -14;
        int result = taxCalculator.calculateTax(base_salary,bonus, taxRate);
        assertEquals(expectedResult, result);
    }
}