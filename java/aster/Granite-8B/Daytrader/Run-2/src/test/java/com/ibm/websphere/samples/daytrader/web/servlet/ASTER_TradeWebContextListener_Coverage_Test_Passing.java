/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeWebContextListener_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextDestroyed_LLIo0() {
        TradeWebContextListener listener = new TradeWebContextListener();
        listener.contextDestroyed(null);
    }
}