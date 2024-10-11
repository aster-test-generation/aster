/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import com.ibm.websphere.samples.daytrader.util.RecentQuotePriceChangeList;
import java.util.concurrent.TimeUnit;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_MarketSummaryWebSocket_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnStockChangeWithOneOpenSession_xsoy1_XQgI0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    marketSummaryWebSocket.recentQuotePriceChangeList = new RecentQuotePriceChangeList(); // Initialize the required object
    String event = "Stock price changed";
    Session mockSession = mock(Session.class);
    when(mockSession.isOpen()).thenReturn(true);
    marketSummaryWebSocket.onOpen(mockSession, null); // Properly adds the session
    marketSummaryWebSocket.onStockChange(event);
    verify(mockSession.getAsyncRemote()).sendObject(any());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnStockChangeWithOneClosedSession_Anzr2_pJWU0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    marketSummaryWebSocket.recentQuotePriceChangeList = new RecentQuotePriceChangeList(); // Initialize the required object to avoid NPE
    String event = "Stock price changed";
    Session mockSession = mock(Session.class);
    when(mockSession.isOpen()).thenReturn(false);
    marketSummaryWebSocket.onOpen(mockSession, null); // This will add the session to the sessions set
    marketSummaryWebSocket.onStockChange(event);
    verify(mockSession.getAsyncRemote(), never()).sendObject(any());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnStockChangeWithOneOpenSession_xsoy1_XQgI0_fid1() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    String event = "Stock price changed";
    Session mockSession = mock(Session.class);
    when(mockSession.isOpen()).thenReturn(true);
    marketSummaryWebSocket.onOpen(mockSession, null); // Properly adds the session
    marketSummaryWebSocket.onStockChange(event);
    verify(mockSession.getAsyncRemote()).sendObject(any());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnStockChangeWithOneClosedSession_Anzr2_pJWU0_fid1() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    String event = "Stock price changed";
    Session mockSession = mock(Session.class);
    when(mockSession.isOpen()).thenReturn(false);
    marketSummaryWebSocket.onOpen(mockSession, null); // This will add the session to the sessions set
    marketSummaryWebSocket.onStockChange(event);
    verify(mockSession.getAsyncRemote(), never()).sendObject(any());
  }
}