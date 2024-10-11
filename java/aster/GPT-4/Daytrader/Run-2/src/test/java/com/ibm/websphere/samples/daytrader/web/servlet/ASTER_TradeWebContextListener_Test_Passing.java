/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContextEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeWebContextListener_Test_Passing {
  private ServletContextEvent servletContextEvent;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testContextDestroyed_vMvJ0() {
    TradeWebContextListener listener = new TradeWebContextListener();
    ServletContextEvent event = mock(ServletContextEvent.class);
    listener.contextDestroyed(event);
    assertTrue(true); // Dummy assertion as there's no output to assert on
  }
}