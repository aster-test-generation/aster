/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import java.util.Properties;
import javax.servlet.ServletContextEvent;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockServletContext;
public class Aster_TradeWebContextListener_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_RuntimeModeNull_vBrV0() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        listener.contextInitialized(event);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_RuntimeModeNotNull_oRba1() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        System.setProperty("RUNTIME_MODE", "1");
        listener.contextInitialized(event);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_RuntimeModeProperty_fAIr2() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        Properties prop = new Properties();
        prop.setProperty("runtimeMode", "1");
        listener.contextInitialized(event);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_OrderProcessingModeNotNull_IeKB4() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        System.setProperty("ORDER_PROCESSING_MODE", "1");
        listener.contextInitialized(event);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_OrderProcessingModeProperty_Hzva5() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        Properties prop = new Properties();
        prop.setProperty("orderProcessingMode", "1");
        listener.contextInitialized(event);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_MAX_USERSNotNull_nRkV7() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        System.setProperty("MAX_USERS", "1");
        listener.contextInitialized(event);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_MAX_USERSProperty_SnXv8() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        Properties prop = new Properties();
        prop.setProperty("maxUsers", "1");
        listener.contextInitialized(event);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_MAX_QUOTESNotNull_BFvL10() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        System.setProperty("MAX_QUOTES", "1");
        listener.contextInitialized(event);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_MAX_QUOTESProperty_PqGi11() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        Properties prop = new Properties();
        prop.setProperty("maxQuotes", "1");
        listener.contextInitialized(event);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextInitialized_PUBLISH_QUOTESNotNull_rreT13() {
        TradeWebContextListener listener = new TradeWebContextListener();
        ServletContextEvent event = new ServletContextEvent(new MockServletContext());
        System.setProperty("PUBLISH_QUOTES", "true");
        listener.contextInitialized(event);
    }
}