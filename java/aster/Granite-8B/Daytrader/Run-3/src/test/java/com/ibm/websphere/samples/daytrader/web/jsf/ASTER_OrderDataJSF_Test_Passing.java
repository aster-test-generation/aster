/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataJSF_Test_Passing {
    private TradeServices tradeAction;
    private ExternalContext context;
    OrderDataJSF orderdatajsf;
    HttpSession httpsession;
    ExternalContext externalcontext;
    private OrderData orderData;
    private OrderDataJSF orderDataJSF;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullOrderData_ihtN1() {
        orderDataJSF.getOrder();
        assertNotNull(orderDataJSF.getOrderData());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAllOrders_gYtP0() {
        OrderData[] allOrders = new OrderData[10];
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        orderDataJSF.setAllOrders(allOrders);
        assertEquals(allOrders, orderDataJSF.getAllOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAllOrdersWithNull_pUBy1() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        orderDataJSF.setAllOrders(null);
        assertNull(orderDataJSF.getAllOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_MLth0_kcJO0() {
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new BigDecimal(100.0), "Buy", 100.0, "AAPL");
        OrderDataJSF orderDataJSF = new OrderDataJSF(null);
        orderDataJSF.setOrderData(orderData);
        assertEquals(orderData, orderDataJSF.getOrderData());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_vKfj1() {
        MockitoAnnotations.initMocks(this);
    }
}