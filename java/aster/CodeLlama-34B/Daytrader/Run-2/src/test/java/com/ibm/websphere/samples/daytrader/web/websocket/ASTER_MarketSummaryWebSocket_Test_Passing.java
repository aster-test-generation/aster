/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_MarketSummaryWebSocket_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSendMarketSummary_nullSession_ytQV5() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    ActionMessage message = new ActionMessage();
    Session currentSession = null;
    marketSummaryWebSocket.sendMarketSummary(message, currentSession);
    assertNull(currentSession);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSendMarketSummary_updateMarketSummary_cAQf0_RoNs0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    ActionMessage message = new ActionMessage();
    Session currentSession = mock(Session.class);
    message.doDecoding("{\"action\":\"updateMarketSummary\"}");
    marketSummaryWebSocket.sendMarketSummary(message, currentSession);
    assertEquals("updateMarketSummary", message.getDecodedAction());
  }
}