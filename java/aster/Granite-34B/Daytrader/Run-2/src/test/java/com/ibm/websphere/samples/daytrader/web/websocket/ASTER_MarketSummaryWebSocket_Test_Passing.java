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
import static org.mockito.Mockito.mock;

public class Aster_MarketSummaryWebSocket_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnMarketSummarytUpdate_XXJf0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        String event = "event";
        marketSummaryWebSocket.onMarketSummarytUpdate(event);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnStockChange_xczK0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        marketSummaryWebSocket.onStockChange("event");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_dcpJ0_aqQr0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        Throwable t = new Throwable();
        Session currentSession = mock(Session.class);
        marketSummaryWebSocket.onError(t, currentSession);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSendMarketSummary_1_BIJP0_MZhO0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        ActionMessage message = new ActionMessage();
        Session currentSession = mock(Session.class);
        marketSummaryWebSocket.sendMarketSummary(message, currentSession);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSendMarketSummary_2_tObx1_eQPi0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        ActionMessage message = new ActionMessage();
        Session currentSession = mock(Session.class);
        message.doDecoding("jsonText");
        marketSummaryWebSocket.sendMarketSummary(message, currentSession);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSendMarketSummary_3_czjk2_cdrf0() {
        MarketSummaryWebSocket marketSummaryWebSocket = new MarketSummaryWebSocket();
        ActionMessage message = new ActionMessage();
        Session currentSession = mock(Session.class);
        message.doDecoding("jsonText");
        message.getDecodedAction();
        marketSummaryWebSocket.sendMarketSummary(message, currentSession);
    }
}