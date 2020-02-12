package test.java;

import main.java.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;

import main.java.Cart;
import main.java.Cart1;
import main.java.Cart2;
import main.java.Cart3;
import main.java.Cart4;
import main.java.Cart5;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BlackBoxGiven {

    private Class<Cart> classUnderTest;

    @SuppressWarnings("unchecked")
    public BlackBoxGiven(Object classUnderTest) {
        this.classUnderTest = (Class<Cart>) classUnderTest;
    }

    // Define all classes to be tested
    @Parameterized.Parameters
    public static Collection<Object[]> cartClassUnderTest() {
        Object[][] classes = {
            {Cart0.class},
            {Cart1.class},
            {Cart2.class},
            {Cart3.class},
            {Cart4.class},
            {Cart5.class}
        };
        return Arrays.asList(classes);
    }

    private Cart createCart(int age) throws Exception {
        Constructor<Cart> constructor = classUnderTest.getConstructor(Integer.TYPE);
        return constructor.newInstance(age);
    }

    // A sample Cart

    Cart cart1;
    double cart1Expected;
    Cart cart3;
    double cart3Expected;
	Cart cartAge20;
	Cart cartProduce;
	Cart cartDairy;
	Cart cartAlcohol;
	Cart cartFrozenFood;
	Cart cartMeat;
	Cart cart2;
	double cartDairyExpected;
	double cartProduceExpected;
	double cartAlcoholExpected;
	double cartFrozenFoodExpected;
	double cartMeatExpected;
	double cart2Expected;


    @org.junit.Before
    public void setUp() throws Exception {

        // all carts should be set up like this

        // cart created with an age 40 shopper
        cart1 = createCart(40);
        for (int i = 0; i < 2; i++) {
            cart1.addItem(new Alcohol());
        }
        for(int i = 0; i < 3; i++) {
            cart1.addItem(new Dairy());
        }
        for(int i = 0; i < 4; i++) {
            cart1.addItem(new Meat());
        }

        cart1Expected = 70.2;
        
        //creates cart with an age 20 shopper
        cartAge20 = createCart(20);
        for (int i = 0; i < 1; i++) {
        cartAge20.addItem(new Alcohol());
        }
        
        //creates cart with an age 40 shopper for produce
        cartProduce = createCart(40);
        for (int i = 0; i < 2; i++) {
        	cartProduce.addItem(new Produce());
        }
        cartProduceExpected = 2;
        
        cartDairy = createCart(40);
        for (int i = 0; i < 1; i++) {
        	cartDairy.addItem(new Dairy());
        }
        cartDairyExpected = 3;
        
        cartAlcohol = createCart(40);
        for (int i = 0; i < 1; i++) {
        	cartAlcohol.addItem(new Alcohol());
        }
        cartAlcoholExpected = 8;
        
        cartFrozenFood = createCart(40);
        for (int i = 0; i < 1; i++) {
        	cartFrozenFood.addItem(new FrozenFood());
        }
        cartFrozenFoodExpected = 5;
        
        cartMeat = createCart(40);
        for (int i = 0; i < 1; i++) {
        	cartMeat.addItem(new Meat());
        }
        cartMeatExpected = 10;
        //cart 2 tests produce items for 3 items to test the discount of 3 for $5.
        cart2 = createCart(40);
        for (int i = 0; i < 2; i++) {
        	cart2.addItem(new Produce());
        }
        cart2Expected = 5;
        
        //cart 3 tests discount for buying alcohol and frozen food.Total should be $10
        cart3 = createCart(40);
        for (int i = 0; i < 1; i++) {
        	cart2.addItem(new FrozenFood());
        }
        for (int i = 0; i < 1; i++) {
        	cart2.addItem(new Alcohol());
        }
        cart3Expected = 10;
        
    }
    @Test
    public void testCart3() throws UnderAgeException{
    	double amount = cart3.calcCost();
    	assertEquals(cart3Expected, amount, 0.1);
    	
    }
    @Test
    public void testCart2() throws UnderAgeException{
    	double amount = cart2.calcCost();
    	assertEquals(cart2Expected, amount, 0.1);
    	
    }
    @Test
    public void testMeat() throws UnderAgeException{
    	double amount = cartMeat.calcCost();
    	assertEquals(cartProduceExpected, amount, 0.1);
    	
    }
    @Test
    public void testFrozenFood() throws UnderAgeException{
    	double amount = cartFrozenFood.calcCost();
    	assertEquals(cartFrozenFoodExpected, amount, 0.1);
    	
    }
    @Test
    public void testAlcohol() throws UnderAgeException{
    	double amount = cartAlcohol.calcCost();
    	assertEquals(cartAlcoholExpected, amount, 0.1);
    
    }
    @Test
    public void testDairy() throws UnderAgeException{
    	double amount = cartDairy.calcCost();
    	assertEquals(cartDairyExpected, amount, 0.1);
    	
    }
    @Test
    public void testProduce() throws UnderAgeException{
    	double amount = cartProduce.calcCost();
        
        assertEquals(cartProduceExpected, amount, 0.1);
    }
    @Test(expected = UnderAgeException.class)
    public void testUnderAgeExceptionThrown() throws UnderAgeException{
		cartAge20.calcCost();
    }
    // sample test
    @Test
    public void calcCostCart1() throws UnderAgeException {
        double amount = cart1.calcCost();
        assertEquals(cart1Expected, amount, .01);
    }
}
