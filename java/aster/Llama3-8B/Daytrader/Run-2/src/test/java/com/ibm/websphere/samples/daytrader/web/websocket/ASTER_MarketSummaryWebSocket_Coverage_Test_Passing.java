/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import javax.websocket.EndpointConfig;
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
    public void testSendMarketSummaryNullMessage_SLTt0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        ActionMessage message = null;
        Session currentSession = mock(Session.class);
        marketSummaryWebSocket.sendMarketSummary(message, currentSession);
        verify(currentSession, never()).getAsyncRemote();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSendObject_ewSe5_OfgN0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    Session session = mock(Session.class);
    when(session.isOpen()).thenReturn(true);
    marketSummaryWebSocket.onOpen(session, mock(EndpointConfig.class));
    marketSummaryWebSocket.onStockChange("event");
    verify(session).getAsyncRemote();
    verify(session.getAsyncRemote(), times(1)).sendObject(any());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRecentQuotePriceChangeList_ERxI6_vtMU0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    RecentQuotePriceChangeList recentQuotePriceChangeList = mock(RecentQuotePriceChangeList.class);
    when(recentQuotePriceChangeList.recentList()).thenReturn(new ArrayList<>());
    marketSummaryWebSocket.onOpen(null, null);
    marketSummaryWebSocket.onStockChange("event");
    verify(recentQuotePriceChangeList, times(1)).recentList();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSendMarketSummaryUpdateRecentQuotePriceChangeWithException_KRlP6_qLfL0() {
    MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
    ActionMessage message = new ActionMessage();
    Session currentSession = mock(Session.class);
    doThrow(new Exception()).when(currentSession).getAsyncRemote();
    marketSummaryWebSocket.sendMarketSummary(message, currentSession);
    verify(currentSession).getAsyncRemote();
}
}