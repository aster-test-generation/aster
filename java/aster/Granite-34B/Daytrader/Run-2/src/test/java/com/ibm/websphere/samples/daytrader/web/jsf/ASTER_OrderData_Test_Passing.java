/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OrderData_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrderFee_SMGH0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100.00), "type", 100.00, "symbol", new BigDecimal(10.00));
        BigDecimal result = orderData.getOrderFee();
        assertEquals(new BigDecimal(100.00), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrderFee2_oEdI1() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100.00), "type", 100.00, "symbol");
        BigDecimal result = orderData.getOrderFee();
        assertEquals(new BigDecimal(100.00), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getQuantity_withAllPropertiesSet_uMVT0() {
        OrderData orderData = new OrderData(1, "OPEN", new Date(), new Date(), new BigDecimal(10.0), "MARKET", 100.0, "AAPL", new BigDecimal(150.0));
        assertEquals(100.0, orderData.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getQuantity_withMissingProperties_cQFs1() {
        OrderData orderData = new OrderData(1, "OPEN", new Date(), new Date(), new BigDecimal(10.0), "MARKET", 100.0, "AAPL");
        assertEquals(100.0, orderData.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderType_dlyH0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderType("newType");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderTypeWithNull_oWYR1() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderType(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderTypeWithEmpty_auHU2() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderType("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrice_ozwD0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(10.0), "type", 100.0, "symbol", new BigDecimal(100.0));
        orderData.setPrice(new BigDecimal(200.0));
        assertEquals(new BigDecimal(200.0), orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPriceWithNullPrice_YEDf1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(10.0), "type", 100.0, "symbol", new BigDecimal(100.0));
        orderData.setPrice(null);
        assertEquals(null, orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPriceWithZeroPrice_NTSB2() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(10.0), "type", 100.0, "symbol", new BigDecimal(100.0));
        orderData.setPrice(new BigDecimal(0.0));
        assertEquals(new BigDecimal(0.0), orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderStatus_pHzt0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(10.0), "type", 100.0, "symbol", new BigDecimal(100.0));
        orderData.setOrderStatus("complete");
        assertEquals("complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderStatusWithNull_NQUq1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(10.0), "type", 100.0, "symbol", new BigDecimal(100.0));
        orderData.setOrderStatus(null);
        assertEquals(null, orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderStatusWithEmpty_ZufK2() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(10.0), "type", 100.0, "symbol", new BigDecimal(100.0));
        orderData.setOrderStatus("");
        assertEquals("", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatus_jsVv0() {
        OrderData orderData = new OrderData(1, "Complete", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL", new BigDecimal(150.00));
        assertEquals("Complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatusWithNoOrderType_UFXZ1() {
        OrderData orderData = new OrderData(1, "Complete", new Date(), new Date(), new BigDecimal(100.00), null, 100.00, "AAPL");
        assertEquals("Complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatusWithNoPrice_sHRf2() {
        OrderData orderData = new OrderData(1, "Complete", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL");
        assertEquals("Complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatusWithNoQuantity_Usas3() {
        OrderData orderData = new OrderData(1, "Complete", new Date(), new Date(), new BigDecimal(100.00), "Limit", 0, "AAPL", new BigDecimal(150.00));
        assertEquals("Complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatusWithNoSymbol_mJcK4() {
        OrderData orderData = new OrderData(1, "Complete", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, null, new BigDecimal(150.00));
        assertEquals("Complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatusWithNoOrderFee_mRpO5() {
        OrderData orderData = new OrderData(1, "Complete", new Date(), new Date(), null, "Limit", 100.00, "AAPL", new BigDecimal(150.00));
        assertEquals("Complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatusWithNoCompleteDate_VMUG6() {
        OrderData orderData = new OrderData(1, "Complete", new Date(), null, new BigDecimal(100.00), "Limit", 100.00, "AAPL", new BigDecimal(150.00));
        assertEquals("Complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatusWithNoOpenDate_YppZ7() {
        OrderData orderData = new OrderData(1, "Complete", null, new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL", new BigDecimal(150.00));
        assertEquals("Complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatusWithNoOrderID_Odui8() {
        OrderData orderData = new OrderData(null, "Complete", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL", new BigDecimal(150.00));
        assertEquals("Complete", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_DJLn0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL", new BigDecimal(150.00));
        assertEquals("AAPL", orderData.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNoSymbol_qLpQ1() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, null, new BigDecimal(150.00));
        assertEquals(null, orderData.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderID_pOvL0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL", new BigDecimal(150.00));
        assertEquals(new Integer(1), orderData.getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderIDWithNoOrderFee_FvPB1() {
        OrderData orderData = new OrderData(2, "Open", new Date(), new Date(), null, "Market", 100.00, "AAPL");
        assertEquals(new Integer(2), orderData.getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbol_jpcl0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(100));
        orderData.setSymbol("newSymbol");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbolWithNull_uKMM1() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(100));
        orderData.setSymbol(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbolWithEmpty_BTTr2() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(100));
        orderData.setSymbol("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderFee_sFeO0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderFee(new BigDecimal(20.0));
        assertEquals(new BigDecimal(20.0), orderData.getOrderFee());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderFeeWithNull_KdDb1() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderFee(null);
        assertEquals(null, orderData.getOrderFee());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderFeeWithZero_SkgF2() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderFee(BigDecimal.ZERO);
        assertEquals(BigDecimal.ZERO, orderData.getOrderFee());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenDate_JrAT0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100, "symbol", new BigDecimal(100));
        Date openDate = orderData.getOpenDate();
        assertNotNull(openDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenDateWithNullOpenDate_EnnI1() {
        OrderData orderData = new OrderData(1, "status", null, new Date(), new BigDecimal(100), "type", 100, "symbol", new BigDecimal(100));
        Date openDate = orderData.getOpenDate();
        assertNull(openDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenDate_ADfz0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(100));
        Date openDate = new Date();
        orderData.setOpenDate(openDate);
        assertEquals(openDate, orderData.getOpenDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenDateWithNull_Hpzf1() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(100));
        orderData.setOpenDate(null);
        assertNull(orderData.getOpenDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenDateWithInvalidDate_YBzf2() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(100));
        Date invalidDate = new Date(Long.MIN_VALUE);
        orderData.setOpenDate(invalidDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCompletionDateTest_mwqN0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Type", 100.00, "Symbol", new BigDecimal(10.00));
        assertEquals(orderData.getCompletionDate(), new Date());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCompletionDateTest2_nGjy1() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Type", 100.00, "Symbol");
        assertEquals(orderData.getCompletionDate(), new Date());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrice_1_wOdX0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100, "symbol", new BigDecimal(100));
        assertEquals(new BigDecimal(100), orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrice_2_bnKu1() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100, "symbol");
        assertEquals(null, orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOrderTypeTest_IQfT0_1() {
        OrderData orderData1 = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.0, "AAPL", new BigDecimal(150.00));
        OrderData orderData2 = new OrderData(2, "Open", new Date(), new Date(), new BigDecimal(100.00), null, 100.0, "AAPL", new BigDecimal(150.00));
        assertEquals("Limit", orderData1.getOrderType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOrderTypeTest_IQfT0_2() {
        OrderData orderData1 = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.0, "AAPL", new BigDecimal(150.00));
        OrderData orderData2 = new OrderData(2, "Open", new Date(), new Date(), new BigDecimal(100.00), null, 100.0, "AAPL", new BigDecimal(150.00));
        assertEquals(null, orderData2.getOrderType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderID_wCif0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderID(2);
        assertEquals(2, orderData.getOrderID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderIDWithNull_Urqy1() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderID(null);
        assertEquals(null, orderData.getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderIDWithNegativeValue_yMTb2() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderID(-1);
        assertEquals(-1, orderData.getOrderID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderIDWithZeroValue_RbmQ3() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderID(0);
        assertEquals(0, orderData.getOrderID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderIDWithPositiveValue_qYzw4() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderID(1);
        assertEquals(1, orderData.getOrderID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderIDWithMaxIntValue_VVqx5() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderID(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, orderData.getOrderID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderIDWithMinIntValue_MqOA6() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        orderData.setOrderID(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, orderData.getOrderID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderIDWithRandomValue_kPNL7() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
        Random random = new Random();
        int randomInt = random.nextInt();
        orderData.setOrderID(randomInt);
        assertEquals(randomInt, orderData.getOrderID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantity_tRdU0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100.0), "type", 100.0, "symbol", new BigDecimal(100.0));
        orderData.setQuantity(100.0);
        assertEquals(100.0, orderData.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantity2_Aaqs1() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100.0), "type", 100.0, "symbol");
        orderData.setQuantity(100.0);
        assertEquals(100.0, orderData.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTotal_OiSJ0_1() {
        OrderData orderData1 = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeA", 100.0, "SymbolA", new BigDecimal(10.00));
        OrderData orderData2 = new OrderData(2, "Open", new Date(), new Date(), null, "TypeB", 200.0, "SymbolB", new BigDecimal(20.00));
        assertEquals(new BigDecimal(1000.00), orderData1.getTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTotal_OiSJ0_2() {
        OrderData orderData1 = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeA", 100.0, "SymbolA", new BigDecimal(10.00));
        OrderData orderData2 = new OrderData(2, "Open", new Date(), new Date(), null, "TypeB", 200.0, "SymbolB", new BigDecimal(20.00));
        assertEquals(new BigDecimal(4000.00), orderData2.getTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTotal_hILB0_1() {
        OrderData order = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeA", 100.0, "SymbolA", new BigDecimal(10.00));
        order.setTotal(new BigDecimal(1000.00));
        OrderData order2 = new OrderData(2, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeB", 100.0, "SymbolB");
        order2.setTotal(new BigDecimal(-1000.00));
        OrderData order3 = new OrderData(3, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeC", 100.0, "SymbolC", new BigDecimal(10.00));
        order3.setTotal(new BigDecimal(0.00));
        assertEquals(new BigDecimal(1000.00), order.getTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTotal_hILB0_2() {
        OrderData order = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeA", 100.0, "SymbolA", new BigDecimal(10.00));
        order.setTotal(new BigDecimal(1000.00));
        OrderData order2 = new OrderData(2, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeB", 100.0, "SymbolB");
        order2.setTotal(new BigDecimal(-1000.00));
        OrderData order3 = new OrderData(3, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeC", 100.0, "SymbolC", new BigDecimal(10.00));
        order3.setTotal(new BigDecimal(0.00));
        assertEquals(new BigDecimal(-1000.00), order2.getTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTotal_hILB0_3() {
        OrderData order = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeA", 100.0, "SymbolA", new BigDecimal(10.00));
        order.setTotal(new BigDecimal(1000.00));
        OrderData order2 = new OrderData(2, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeB", 100.0, "SymbolB");
        order2.setTotal(new BigDecimal(-1000.00));
        OrderData order3 = new OrderData(3, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeC", 100.0, "SymbolC", new BigDecimal(10.00));
        order3.setTotal(new BigDecimal(0.00));
        assertEquals(new BigDecimal(0.00), order3.getTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDate_GWkA0() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100, "symbol", new BigDecimal(100));
        Date completionDate = new Date();
        orderData.setCompletionDate(completionDate);
        assertEquals(completionDate, orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithNullCompletionDate_Wdvm1() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100, "symbol", new BigDecimal(100));
        orderData.setCompletionDate(null);
        assertNull(orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithInvalidCompletionDate_xwUI2() {
        OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100, "symbol", new BigDecimal(100));
        Date completionDate = new Date(0);
        orderData.setCompletionDate(completionDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getQuantity_withMissingProperties2_sAJi2_Noww0() {
        OrderData orderData = new OrderData(1, "OPEN", new Date(), new Date(), new BigDecimal(10.0), "MARKET", 100.0, "AAPL", new BigDecimal(100.0));
        assertEquals(100.0, orderData.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOrderTypeTest_IQfT0() {
        OrderData orderData1 = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.0, "AAPL", new BigDecimal(150.00));
        assertEquals("Limit", orderData1.getOrderType());
        OrderData orderData2 = new OrderData(2, "Open", new Date(), new Date(), new BigDecimal(100.00), null, 100.0, "AAPL", new BigDecimal(150.00));
        assertEquals(null, orderData2.getOrderType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTotal_hILB0() {
        OrderData order = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeA", 100.0, "SymbolA", new BigDecimal(10.00));
        order.setTotal(new BigDecimal(1000.00));
        assertEquals(new BigDecimal(1000.00), order.getTotal());
        OrderData order2 = new OrderData(2, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeB", 100.0, "SymbolB");
        order2.setTotal(new BigDecimal(-1000.00));
        assertEquals(new BigDecimal(-1000.00), order2.getTotal());
        OrderData order3 = new OrderData(3, "Open", new Date(), new Date(), new BigDecimal(100.00), "TypeC", 100.0, "SymbolC", new BigDecimal(10.00));
        order3.setTotal(new BigDecimal(0.00));
        assertEquals(new BigDecimal(0.00), order3.getTotal());
    }
}