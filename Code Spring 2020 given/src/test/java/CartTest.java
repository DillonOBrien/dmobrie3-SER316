package test.java;

import main.java.Cart;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {

    Cart cart;
    Cart cart1;

    @Before
    public void setUp() throws Exception {
      cart = new Cart(40);
      for(int i = 0; i < 1; i++ {
        cart.addItem(new Produce());
      }
	    for (int i = 0; i < 1; i++) {
        	cart4.addItem(new Alcohol());
        }
	    for (int i = 0; i < 1; i++) {
        	cart4.addItem(new FrozenFood());
        }
	    for (int i = 0; i < 1; i++) {
        	cart4.addItem(new Meat());
        }
        for (int i = 0; i < 1; i++) {
        	cart4.addItem(new Alcohol());
        }
        for (int i = 0; i < 1; i++) {
        	cart4.addItem(new Dairy());
        }
        cartExpected = 25;
    }
    

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAmountSaved() {
      double amount = cart.Amount_saved();
        assertEquals(cartExpected, amount, .01);
    }

}
