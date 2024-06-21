package ec.edu.ups.add_calculator;

import org.junit.Test;
import org.mockito.Mockito;


import static org.junit.Assert.*;
public class ICalculatorTest {

    //ADDITION
    //no se puede instaciar una interfaz, para eso usamos mockito para simular
    @Test
    public void give_two_integers_when_addition_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(3,2)).thenReturn(5);
        assertEquals(5,c.addition(3,2));
    }
    @Test
    public void give_two_integers_when_addition_then_error() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(3,2)).thenReturn(5);
        assertEquals(5,c.addition(2,3));
    }

    //SUBTRACTION
    @Test
    public void give_two_integers_when_subtraction_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.subtraction(10,5)).thenReturn(5);
        assertEquals(5,c.subtraction(10,5));
    }

    @Test
    public void give_two_integers_when_subtraction_then_error() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.subtraction(10,5)).thenReturn(5);
        assertEquals(5,c.subtraction(5,10));
    }
    //MULTIPLICATION
    @Test
    public void give_two_integers_when_multiplication_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.multiplication(5,10)).thenReturn(50);
        assertEquals(50,c.multiplication(5,10));
    }
    @Test
    public void give_two_integers_when_multiplication_then_error() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.multiplication(5,10)).thenReturn(50);
        assertEquals(50,c.multiplication(10,5));
    }


    //DIVISION
    @Test
    public void give_two_integers_when_division_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.division(20,2)).thenReturn(10);
        assertEquals(10,c.division(20,2));
    }
    @Test(expected = ArithmeticException.class)
    public void give_two_integers_when_division_then_error() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.division(20,2)).thenReturn(10);
        assertEquals(10,c.division(20,0));
    }

}