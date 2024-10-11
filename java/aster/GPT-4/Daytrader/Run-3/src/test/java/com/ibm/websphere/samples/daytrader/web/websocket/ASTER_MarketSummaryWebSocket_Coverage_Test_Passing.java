/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import com.ibm.websphere.samples.daytrader.interfaces.QuotePriceChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_MarketSummaryWebSocket_Coverage_Test_Passing {
  private MarketSummaryWebSocket marketSummaryWebSocket;
  private Session mockSession;
  private CloseReason mockCloseReason;
  private Set<Session> sessions;
  private ActionMessage actionMessage;
  private Session currentSession;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnClose_logsSessionInfo_sogC1() {
    when(mockSession.toString()).thenReturn("MockSession");
    marketSummaryWebSocket.onClose(mockSession, mockCloseReason);
    assertFalse(sessions.contains(mockSession));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnClose_removesSession_PQhA2() {
    sessions.add(mockSession);
    marketSummaryWebSocket.onClose(mockSession, mockCloseReason);
    assertFalse(sessions.contains(mockSession));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogTrace_mAgA1() {
    marketSummaryWebSocket.onMarketSummarytUpdate("event");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSendMarketSummary_NullAction_wSte6() throws Exception {
    when(actionMessage.getDecodedAction()).thenReturn(null);
    marketSummaryWebSocket.sendMarketSummary(actionMessage, currentSession);
    verify(currentSession.getAsyncRemote(), never()).sendText(anyString());
    verify(currentSession.getAsyncRemote(), never()).sendObject(any());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNoSessions_LLxS9_wNoX0() {
    Session session = mock(Session.class); // Mock the Session object
    marketSummaryWebSocket.onOpen(session, null); // Call the method under test
    verifyNoMoreInteractions(session);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSendMarketSummary_EmptyRecentQuotePriceChangeList_MQsw5_NQdI0() throws Exception {
    ActionMessage actionMessage = mock(ActionMessage.class);
    Session currentSession = mock(Session.class);
    List<QuotePriceChange> recentQuotePriceChangeList = new ArrayList<>();
    when(actionMessage.getDecodedAction()).thenReturn("updateRecentQuotePriceChange");
    when(recentQuotePriceChangeList.isEmpty()).thenReturn(true);
    marketSummaryWebSocket.sendMarketSummary(actionMessage, currentSession);
    verify(currentSession.getAsyncRemote(), never()).sendObject(any());
  }
}