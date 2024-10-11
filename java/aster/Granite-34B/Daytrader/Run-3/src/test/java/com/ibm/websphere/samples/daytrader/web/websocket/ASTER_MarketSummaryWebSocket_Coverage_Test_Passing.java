/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.json.JsonObject;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_MarketSummaryWebSocket_Coverage_Test_Passing {
  private JsonObject mkSummary;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void onCloseTest1_pqQD0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    Session session = null;
    CloseReason reason = null;
    marketSummaryWebSocket.onClose(session, reason);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSendMarketSummary1_dWXP0_uxtW0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    ActionMessage message = new ActionMessage();
    Session currentSession = mock(Session.class);
    marketSummaryWebSocket.sendMarketSummary(message, currentSession);
  }
}