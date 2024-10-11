/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataJSF_Test_Failing {
    private TradeServices tradeAction;
    private ExternalContext context;
    OrderDataJSF orderDataJSF;
    HttpSession httpSession;
    ExternalContext externalContext;
    private OrderData orderData;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderID(), orderDataJSF.getOrderData().getOrderID());
        assertEquals(orderData.getOrderStatus(), orderDataJSF.getOrderData().getOrderStatus());
        assertEquals(orderData.getOpenDate(), orderDataJSF.getOrderData().getOpenDate());
        assertEquals(orderData.getCompletionDate(), orderDataJSF.getOrderData().getCompletionDate());
        assertEquals(orderData.getOrderFee(), orderDataJSF.getOrderData().getOrderFee());
        assertEquals(orderData.getOrderType(), orderDataJSF.getOrderData().getOrderType());
        assertEquals(orderData.getQuantity(), orderDataJSF.getOrderData().getQuantity());
        assertEquals(orderData.getSymbol(), orderDataJSF.getOrderData().getSymbol());
        assertEquals(orderData.getPrice(), orderDataJSF.getOrderData().getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0_1() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderID(), orderDataJSF.getOrderData().getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0_2() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderStatus(), orderDataJSF.getOrderData().getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0_3() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOpenDate(), orderDataJSF.getOrderData().getOpenDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0_4() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getCompletionDate(), orderDataJSF.getOrderData().getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0_5() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderFee(), orderDataJSF.getOrderData().getOrderFee());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0_6() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderType(), orderDataJSF.getOrderData().getOrderType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0_7() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getQuantity(), orderDataJSF.getOrderData().getQuantity());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0_8() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getSymbol(), orderDataJSF.getOrderData().getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ymJl0_9() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getPrice(), orderDataJSF.getOrderData().getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllOrder_rHHb0_GAho0() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        orderDataJSF.setOrderData(new OrderData(null, null, null, null, null, null, 0, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllOrderWithSession_CQnu1_jbMa0() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        HttpSession session = Mockito.mock(HttpSession.class);
        session.setAttribute("uidBean", "test");
        orderDataJSF.setOrderData(new OrderData(null, null, null, null, null, null, 0, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllOrderWithException_UrzR2_mjlQ0() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        try {
            orderDataJSF.setOrderData(new OrderData(null, null, null, null, null, null, 0, null));
            orderDataJSF.getAllOrder();
            fail("Expected exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_izwx0() throws Exception {
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, null, 0, null);
        HttpSession httpSession = mock(HttpSession.class);
        ExternalContext externalContext = mock(ExternalContext.class);
        OrderDataJSF orderDataJSF = new OrderDataJSF((Instance<TradeServices>) mock(TradeServices.class));
        when(httpSession.getAttribute("orderData")).thenReturn(orderData);
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData, orderDataJSF.getOrderData());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAllOrders_cxTO0_VsjE0() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData[] expectedOrders = new OrderData[5];
        orderDataJSF.setOrderData(new OrderData(null, null, null, null, null, null, 0, null));
    }
}