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
  public void testSendMarketSummaryWithNullAction_pXxc0() {
    ActionMessage message = mock(ActionMessage.class);
    when(message.getDecodedAction()).thenReturn(null);
    Session session = mock(Session.class);
    MarketSummaryWebSocket webSocket = new MarketSummaryWebSocket();
    webSocket.sendMarketSummary(message, session);
    verify(session, never()).getAsyncRemote();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSendMarketSummaryWithInvalidAction_YajW3() {
    ActionMessage message = mock(ActionMessage.class);
    when(message.getDecodedAction()).thenReturn("invalidAction");
    Session session = mock(Session.class);
    MarketSummaryWebSocket webSocket = new MarketSummaryWebSocket();
    webSocket.sendMarketSummary(message, session);
    verify(session, never()).getAsyncRemote();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnStockChangeWithOneClosedSession_lRCH2_WdBy0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    Session mockSession = mock(Session.class);
    when(mockSession.isOpen()).thenReturn(false);
    marketSummaryWebSocket.onOpen(mockSession, null); // This will add the session properly
    String event = "Stock price updated";
    marketSummaryWebSocket.onStockChange(event);
    verify(mockSession.getAsyncRemote(), never()).sendObject(any());
  }
}