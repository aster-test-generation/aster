/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

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
    public void testSetOrderData_QVUb0() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
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
    public void testSetOrderData_QVUb0_1() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderID(), orderDataJSF.getOrderData().getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_QVUb0_2() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderStatus(), orderDataJSF.getOrderData().getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_QVUb0_3() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOpenDate(), orderDataJSF.getOrderData().getOpenDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_QVUb0_4() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getCompletionDate(), orderDataJSF.getOrderData().getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_QVUb0_5() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderFee(), orderDataJSF.getOrderData().getOrderFee());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_QVUb0_6() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderType(), orderDataJSF.getOrderData().getOrderType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_QVUb0_7() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getQuantity(), orderDataJSF.getOrderData().getQuantity());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_QVUb0_8() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getSymbol(), orderDataJSF.getOrderData().getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_QVUb0_9() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getPrice(), orderDataJSF.getOrderData().getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_1() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertNotNull(orderData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_2() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderFee(), BigDecimal.ZERO);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_4() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderStatus(), "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_5() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getSymbol(), "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_6() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderID(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_7() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOpenDate(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_8() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getCompletionDate(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_9() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getPrice(), BigDecimal.ZERO);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_10() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getOrderType(), "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderData_nhUC0_IuGU0_11() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderDataJSF.getOrderData().getOrderFee(), BigDecimal.ZERO);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllOrder_gMka0_qEjT0() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        orderDataJSF.setOrderData(new OrderData(null, null, null, null, null, null, 0, null));
        orderDataJSF.setOrderData(orderDataJSF.getOrderData());
        orderDataJSF.getAllOrder();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllOrderWithException_xwQJ1_VzCG0() {
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
    public void testGetOrderData_nhUC0_IuGU0_3() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        OrderData orderData = new OrderData(null, null, null, null, BigDecimal.ZERO, "", 0.0, "");
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllOrderWithEmptyList_SVsE2_DtBs0() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        List<?> orderDataBeans = new ArrayList<>();
        orderDataJSF.setOrderData(new OrderData(null, null, null, null, null, null, 0, null));
        orderDataJSF.getAllOrder();
    }
}