/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.Log;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_MarketSummaryWebSocket_Test_Failing {
    private static List<Session> sessions = new CopyOnWriteArrayList<>();
    MarketSummaryWebSocket marketsummarywebsocket;
    @Mock
    private Instance<TradeServices> services;
    @Mock
    private Session currentSession;
    private TradeServices tradeAction;
    private CountDownLatch latch = new CountDownLatch(1);
    private Log log;
    @Mock
    private MarketSummaryWebSocket marketSummaryWebSocket;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void onClose_shouldLogAndRemoveSession_LzmZ0() {
        Session session = mock(Session.class);
        CloseReason reason = mock(CloseReason.class);
        marketSummaryWebSocket.onClose(session, reason);
        verify(log).trace("MarketSummaryWebSocket:onClose -- session -->" + session + "<--");
        verify(sessions).remove(session);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnMarketSummarytUpdateWithServices_PbeF1_qrxp0() {
        Instance<TradeServices> services = mock(Instance.class);
        TradeServices tradeServices = mock(TradeServices.class);
        when(services.get()).thenReturn(tradeServices);
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket(services);
        marketSummaryWebSocket.onMarketSummarytUpdate("event");
        verify(services, times(1)).get();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnErrorWithCoverage_lXjX2_ecgQ0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        Throwable t = new Throwable();
        Session currentSession = mock(Session.class);
        marketSummaryWebSocket.onError(t, currentSession);
        marketSummaryWebSocket.onError(t, null);
        marketSummaryWebSocket.onError(null, currentSession);
        marketSummaryWebSocket.onError(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnMarketSummarytUpdateWithServices_PbeF1_qrxp0_fid1() {
        Instance<TradeServices> services = mock(Instance.class);
        TradeServices tradeServices = mock(TradeServices.class);
        when(services.get()).thenReturn(tradeServices);
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket(services);
        marketSummaryWebSocket.onMarketSummarytUpdate("event");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testonClose() throws Exception {
        marketsummarywebsocket = new MarketSummaryWebSocket();
        Session session = mock(Session.class);
        CloseReason reason = mock(CloseReason.class);
        when(reason.getReasonPhrase()).thenReturn("Test reason");
        marketsummarywebsocket.onClose(session, reason);
        verify(session, times(1)).close();
        assertTrue(sessions.isEmpty());
    }
}