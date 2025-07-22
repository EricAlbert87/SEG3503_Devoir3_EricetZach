
package test;

import static org.junit.Assert.*;
import org.junit.Test;
import CounterUI.CounterFrame;
import Counter.MarketProxyStub;

public class TestCounterFrameStub {

    @Test
    public void testAddItem() {
        CounterFrame frame = new CounterFrame(new MarketProxyStub());
        frame.addItem("Pomme");
        assertEquals(12.99, frame.getTotal(), 0.01);
    }

    @Test
    public void testAddOutOfStockItem() {
        CounterFrame frame = new CounterFrame(new MarketProxyStub());
        boolean result = frame.addItem("OUT_OF_STOCK");
        assertFalse(result);
    }

    @Test
    public void testClearTransaction() {
        CounterFrame frame = new CounterFrame(new MarketProxyStub());
        frame.addItem("Pomme");
        frame.clearTransaction();
        assertEquals(0.0, frame.getTotal(), 0.01);
    }
}
