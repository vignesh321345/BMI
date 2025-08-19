package com.example.bmicalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BmiCalculatorTest {

    BmiCalculator calculator = new BmiCalculator();

    @Test
    public void testCalculateBMI() {
        double bmi = calculator.calculateBMI(70, 1.75);
        assertEquals(22.86, bmi, 0.01);
    }

    @Test
    public void testBMICategory_Normal() {
        assertEquals("Normal weight", calculator.categorizeBMI(22.0));
    }

    @Test
    public void testBMICategory_Obese() {
        assertEquals("Obese", calculator.categorizeBMI(35.0));
    }

    @Test
    public void testBMICategory_Underweight() {
        assertEquals("Underweight", calculator.categorizeBMI(17.0));
    }

    @Test
    public void testBMICategory_Overweight() {
        assertEquals("Overweight", calculator.categorizeBMI(27.0));
    }
}



