package ec.edu.ups.add_calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc=null;


    @BeforeClass
    public static void setupClass(){
        System.out.println("SetupCLass()");

    }
    @Before
    public void setup(){
        System.out.println("Setup()");
        calc= new Calculator();
    }


    //ADDITION
    @Test
    public void given_two_integers_when_addition_then_ok(){
        assertEquals(6,calc.addition(4,2));
        System.out.println("Test 1");
    }
    @Test(timeout = 100)
    public void given_two_integers_when_addition_then_timeout(){
        assertEquals(6,calc.addition(4,2));
        System.out.println("Test 2");
    }


    @Test(expected = AssertionError.class)
    public void given_two_integers_when_addition_then_exception(){
        assertEquals(8,calc.addition(-4,2));
        System.out.println("Test 3");
    }



    // SUBSTRACTION
    @Test()
    public void given_two_integers_when_subtraction_then_ok(){
        assertEquals(2,calc.subtraction(4,2));
        System.out.println("Test 4");
    }

    @Test(timeout = 150)
    public void given_two_integers_when_subtraction_then_timeout(){
        assertEquals(2,calc.subtraction(4,2));
        System.out.println("Test 5");
    }
    @Test(expected = AssertionError.class)
    public void given_two_integers_when_subtraction_then_exception(){
        assertEquals(8,calc.subtraction(-4,2));
        System.out.println("Test 6");
    }

    //MULTIPLICATION
    @Test()
    public void given_two_integers_when_multiplication_then_ok(){
        assertEquals(18,calc.multiplication(6,3));
        System.out.println("Test 7");
    }



    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_timeout(){
        assertEquals(-8,calc.multiplication(-4,2));
        System.out.println("Test 8");
    }

    //DIVISION
    @Test()
    public void given_two_integers_when_division_then_ok(){
        assertEquals(18,calc.division(36,2));
        System.out.println("Test 9");
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        assertEquals(3,calc.division(6,0));
        System.out.println("Test 10");
    }

    @Test(timeout = 150)
    public void given_two_integers_when_division_then_timeout(){
        assertEquals(-2,calc.division(-4,2));
        System.out.println("Test 11");
    }




    @AfterClass
    public static void tearDownClass(){
        System.out.println("TearDownClass()");

    }
}