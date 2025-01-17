/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import javax.servlet.ServletContextEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeWebContextListener_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextDestroyedCompletesWithoutException_AwRF1() {
        ServletContextEvent event = mock(ServletContextEvent.class);
        TradeWebContextListener listener = new TradeWebContextListener();
        listener.contextDestroyed(event);
    }
}