/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContextEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeWebContextListener_Test_Failing {
  @Mock
  private ServletContextEvent event;
  @Mock
  private InputStream stream;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testContextDestroyed_hdiG0() {
    TradeWebContextListener listener = new TradeWebContextListener();
    ServletContextEvent event = new ServletContextEvent(new MockServletContext());
    listener.contextDestroyed(event);
    assertTrue(listener.getClass().getName().equals("TradeWebContextListener"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testContextDestroyedWithNullEvent_JuOY1() {
    TradeWebContextListener listener = new TradeWebContextListener();
    listener.contextDestroyed(null);
    assertTrue(listener.getClass().getName().equals("TradeWebContextListener"));
  }
}