package lab3;

import org.junit.Test;

import static org.junit.Assert.*;


public class TradeTest {

    @Test
    public void createTrade(){

        // Test trade object creation
        Trade t1 = new Trade(1, "IBM", 14, 400.00);

        assertEquals(t1.getId(), 1);

    }

    @Test
    public void ensurePositivePrice(){
        // Test trade object creation
        Trade t1 = new Trade(1, "IBM", 14, 200.00);

        assertEquals(t1.getId(), 1);

        // Ensure price is always positive
        boolean isPositive = false;
        if (t1.getPrice() > 0){
            isPositive = true;
        }
        assertTrue(isPositive);
    }
}
