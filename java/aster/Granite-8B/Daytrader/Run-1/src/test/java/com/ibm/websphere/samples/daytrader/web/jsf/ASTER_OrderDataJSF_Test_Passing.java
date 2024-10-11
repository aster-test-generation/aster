/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataJSF_Test_Passing {
    private TradeServices tradeServices;
    @InjectMocks
    private OrderDataJSF orderDataJSF;
    @Inject
    private Instance<TradeServices> services;
    private TradeServices tradeAction;
    private ExternalContext context;
    @Mock
    private OrderDataJSF orderdatajsf;
    @Mock
    private HttpSession httpsession;
    @Mock
    private ExternalContext externalcontext;
    private OrderData orderData;

    @Inject
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAllOrder() throws Exception {
        tradeAction = mock(TradeServices.class);
        context = mock(ExternalContext.class);
        when(externalcontext.getSession(any())).thenReturn(httpsession);
        when(context).thenReturn(context);
        when(tradeAction).thenReturn(tradeAction);
        // Mock the behavior of the tradeAction.getOrders method
        when(tradeAction.getOrders(anyString())).thenReturn(new ArrayList<>());
        // Call the method under test
        orderdatajsf.getAllOrder();
        // Verify that the expected method calls were made
        verify(tradeAction, times(1)).getOrders(anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrder() throws Exception {
        orderdatajsf = new OrderDataJSF(Mockito.mock(Instance.class));
        when(externalcontext.getSession(any())).thenReturn(httpsession);
        when(httpsession.getAttribute("orderData")).thenReturn(orderData);
        orderdatajsf.getOrder();
        verify(httpsession, times(1)).getAttribute("orderData");
        verify(orderdatajsf, times(1)).setOrderData(orderData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_1() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertNotNull(orderData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_2() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertEquals(new BigDecimal("100.00"), orderData.getOrderFee());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_3() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertEquals(100.0, orderData.getQuantity(), 0.01);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_4() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertEquals("OPEN", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_5() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertEquals("XYZ", orderData.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_6() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertEquals(123, (int) orderData.getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_7() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertTrue(orderData.getOpenDate().before(orderData.getCompletionDate()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_8() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertEquals(new BigDecimal("1000.00"), orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_9() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertEquals("BUY", orderData.getOrderType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderData_dtdt0_10() {
        OrderDataJSF orderDataJSF = new OrderDataJSF(services);
        OrderData orderData = orderDataJSF.getOrderData();
        assertEquals(new BigDecimal("10000.00"), orderData.getTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_ddNX0() {
        orderDataJSF = new OrderDataJSF(services);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderData_ZABx1() {
        when(services.get()).thenReturn(mock(TradeServices.class));
        orderDataJSF.setOrderData(orderData);
        verify(orderData).setOrderType("BUY");
        verify(orderData).setPrice(BigDecimal.valueOf(100.00));
        verify(orderData).setOrderStatus("OPEN");
        verify(orderData).setSymbol("IBM");
        verify(orderData).setQuantity(100.0);
        verify(orderData).setTotal(BigDecimal.valueOf(10000.00));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderDataWithNullOrderData_mFrL2() {
        when(services.get()).thenReturn(mock(TradeServices.class));
        orderDataJSF.setOrderData(null);
        verify(orderData).setOrderType(null);
        verify(orderData).setPrice(null);
        verify(orderData).setOrderStatus(null);
        verify(orderData).setSymbol(null);
        verify(orderData).setQuantity(0.0);
        verify(orderData).setTotal(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderDataWithNullServices_ayAL3() {
        when(services.get()).thenReturn(null);
        orderDataJSF.setOrderData(orderData);
        verify(orderData).setOrderType(null);
        verify(orderData).setPrice(null);
        verify(orderData).setOrderStatus(null);
        verify(orderData).setSymbol(null);
        verify(orderData).setQuantity(0.0);
        verify(orderData).setTotal(null);
    }
}