/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_MarketSummaryWebSocket_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMarketSummarytUpdate_SessionClosed_TMyx1_FSFC0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    Session session = mock(Session.class);
    when(session.isOpen()).thenReturn(false);
    marketSummaryWebSocket.onOpen(session, null); // Initialize sessions
    String event = "event";
    marketSummaryWebSocket.onMarketSummarytUpdate(event);
    verify(session.getAsyncRemote(), never()).sendText(anyString());
  }
}