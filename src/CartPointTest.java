import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartPointTest {


    @Test
    void test(){
        CartPoint c = new CartPoint(100);
        CartPoint equalc = new CartPoint(100);
        CartPoint lessc = new CartPoint(25);
        CartPoint greaterc = new CartPoint(15000);

        //lessThan
        assertTrue(c.lessThan(greaterc));
        assertFalse(c.lessThan(lessc));
        assertFalse(c.lessThan(equalc));

        //lessThanEqualTo
        assertTrue(c.lessThanEqualTo(greaterc));
        assertTrue(c.lessThanEqualTo(equalc));
        assertFalse(c.lessThanEqualTo(lessc));

        //equal
        assertTrue(c.equalTo(equalc));
        assertFalse(c.equalTo(lessc));
        assertFalse(c.equalTo(greaterc));

        //greaterThanEqualTo
        assertFalse(c.greaterThanEqualTo(greaterc));
        assertTrue(c.greaterThanEqualTo(equalc));
        assertTrue(c.greaterThanEqualTo(lessc));

        //greaterThan
        assertFalse(c.greaterThan(greaterc));
        assertTrue(c.greaterThan(lessc));
        assertFalse(c.greaterThan(equalc));

        //notEqual
        assertFalse(c.notEqual(equalc));
        assertTrue(c.notEqual(lessc));
        assertTrue(c.notEqual(greaterc));
    }

}