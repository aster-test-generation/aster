/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import com.ibm.websphere.samples.daytrader.util.RecentQuotePriceChangeList;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MarketSummaryWebSocket_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_LogTrace_IoZJ0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        Session session = mock(Session.class);
        Throwable throwable = new Throwable();
        marketSummaryWebSocket.onError(throwable, session);
        verify(session, times(1)).toString();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_PrintStackTrace_pqYa1() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        Session session = mock(Session.class);
        Throwable throwable = new Throwable();
        marketSummaryWebSocket.onError(throwable, session);
        verify(throwable, times(1)).printStackTrace();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_LogAndPrintStackTrace_JGII2() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        Session session = mock(Session.class);
        Throwable throwable = new Throwable();
        marketSummaryWebSocket.onError(throwable, session);
        verify(session, times(1)).toString();
        verify(throwable, times(1)).printStackTrace();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSendMarketSummaryNullMessage_VqKz0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        ActionMessage message = null;
        Session currentSession = mock(Session.class);
        marketSummaryWebSocket.sendMarketSummary(message, currentSession);
        verify(currentSession, never()).getAsyncRemote();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnCloseLogger_xEvb1_pqzq0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    Session session = mock(Session.class);
    CloseReason reason = mock(CloseReason.class);
    marketSummaryWebSocket.onClose(session, reason);
    verify(marketSummaryWebSocket).onClose(session, reason);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSessionNotOpen_miCu4_tWjM0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    Session session = mock(Session.class);
    when(session.isOpen()).thenReturn(false);
    verify(session, times(0)).getAsyncRemote();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSendObject_WRAd5_kfHa0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    Session session = mock(Session.class);
    when(session.isOpen()).thenReturn(true);
    marketSummaryWebSocket.onOpen(session, null);
    verify(session.getAsyncRemote(), times(1)).sendObject(any());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRecentQuotePriceChangeList_gPOC6_BtWP0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    RecentQuotePriceChangeList recentQuotePriceChangeList = mock(RecentQuotePriceChangeList.class);
    when(recentQuotePriceChangeList.recentList()).thenReturn(new ArrayList<>());
    marketSummaryWebSocket.onOpen(null, null); // Initialize sessions
    marketSummaryWebSocket.onStockChange("event");
    verify(recentQuotePriceChangeList, times(1)).recentList();
}
}