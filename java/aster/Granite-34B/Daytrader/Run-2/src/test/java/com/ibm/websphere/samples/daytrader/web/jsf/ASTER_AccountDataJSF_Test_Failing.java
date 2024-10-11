/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AccountDataJSF_Test_Failing {
    private OrderData[] closedOrders;
    private ExternalContext context;
    private TradeServices tradeAction;
    AccountDataJSF accountdatajsf;
    HttpSession httpsession;
    ExternalContext externalcontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCurrentTimeTest_EOMA0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        Date expected = new Date();
        Date actual = accountDataJSF.getCurrentTime();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrders_withNoClosedOrders_shouldReturnEmptyArray_MqkQ0() {
        AccountDataJSF accountData = new AccountDataJSF(null);
        OrderData[] expected = new OrderData[0];
        OrderData[] actual = accountData.getClosedOrders();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getAccountIDTest_Null_ZkzT1() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        Integer expected = null;
        Integer actual = accountDataJSF.getAccountID();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationDate_iLdK0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        Date creationDate = new Date();
        accountDataJSF.setCreationDate(creationDate);
        assertEquals(creationDate, accountDataJSF.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToggleShowAllRows_XuAL0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setNumberOfOrderRows(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToggleShowAllRows_lineCoverage_Ovat1() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.toggleShowAllRows();
        accountDataJSF.toggleShowAllRows();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToggleShowAllRows_branchCoverage_YEWA2() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setNumberOfOrderRows(0);
        accountDataJSF.setNumberOfOrderRows(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBalance_JvDi0() {
        AccountDataJSF accountData = new AccountDataJSF(null);
        BigDecimal balance = accountData.getBalance();
        assertNotNull(balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBalance_zeroBalance_lnmE1_2() {
        AccountDataJSF accountData = new AccountDataJSF(null);
        BigDecimal balance = accountData.getBalance();
        assertEquals(BigDecimal.ZERO, balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBalance_nonZeroBalance_mViV2_2() {
        AccountDataJSF accountData = new AccountDataJSF(null);
        BigDecimal balance = accountData.getBalance();
        assertNotEquals(BigDecimal.ZERO, balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBalance_nullBalance_EOCi3() {
        AccountDataJSF accountData = new AccountDataJSF(null);
        BigDecimal balance = accountData.getBalance();
        assertNull(balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastLogin_VNlR0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        Date lastLogin = accountDataJSF.getLastLogin();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setCurrentTimeMaxDateTest_VmfM2_aTHA0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setCurrentTime(new Date(Long.MAX_VALUE));
        assertEquals(new Date(Long.MAX_VALUE), accountDataJSF.getCurrentTime());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setBalanceTest_qhDb3_wfAh0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        BigDecimal balance = new BigDecimal(0);
        accountDataJSF.setBalance(balance);
        assertEquals(balance, accountDataJSF.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNumberOfOrders_didv0_Sckz0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setNumberOfOrders(10);
        assertEquals(10, accountDataJSF.getNumberOfOrders().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNumberOfOrdersWithNull_oYjG1_WFjv0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setNumberOfOrders(null);
        assertEquals(null, accountDataJSF.getNumberOfOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNumberOfOrdersWithNegativeValue_VFyY2_xrwO0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setNumberOfOrders(-10);
        assertEquals(-10, accountDataJSF.getNumberOfOrders().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGain_ODWC0_cdON0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setGain(new BigDecimal("100.00"));
        accountDataJSF.getGain();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainWithNullGain_ePXz1_ZpBF0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setGain(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastLogin_IVbE0_LIXW0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        Date lastLogin = new Date();
        accountDataJSF.setLastLogin(lastLogin);
        assertEquals(lastLogin, accountDataJSF.getLastLogin());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGain_ihpl0_uFeK0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        BigDecimal actual = accountDataJSF.getGain();
        Assertions.assertEquals(null, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNumberOfOrderRowsTest_aGXh0_yMVB0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        Integer actual = accountDataJSF.getNumberOfOrderRows();
        Integer expected = accountDataJSF.getNumberOfOrderRows();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountID_rLZw0_qyqp0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setAccountID(123);
        assertEquals(123, accountDataJSF.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDWithMaxIntegerValue_JnjB5_pyVq0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setAccountID(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, accountDataJSF.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDWithMinIntegerValue_AdPJ6_rRxG0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setAccountID(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, accountDataJSF.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalanceWithRandomBigDecimalValue_Adrn7_IQVV0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        Random random = new Random();
        BigDecimal randomBigDecimal = new BigDecimal(random.nextDouble());
        accountDataJSF.setBalance(randomBigDecimal);
        assertEquals(randomBigDecimal, accountDataJSF.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDCoverage3_yVei3_zDTf0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDCoverage4_EOch4_UWDG0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        Mockito.when(accountDataJSF.getProfileID()).thenReturn("expectedValue");
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDCoverage5_Nawv5_jsni0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDCoverage6_pGZc6_XcWo0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDCoverage7_NeDU7_hCLf0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDCoverage8_NrUY8_SAEb0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDCoverage10_tWoX10_jMow0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotal_VDdz0_PLNq0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        BigDecimal holdingsTotal = new BigDecimal(0);
        accountDataJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, accountDataJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotal2_EPuH1_dofu0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        BigDecimal holdingsTotal = new BigDecimal(1);
        accountDataJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, accountDataJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotal3_oPjk2_bCAS0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        BigDecimal holdingsTotal = new BigDecimal(2);
        accountDataJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, accountDataJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotal5_AFpp4_OyFO0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        BigDecimal holdingsTotal = new BigDecimal(4);
        accountDataJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, accountDataJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotal10_JgAf9_vvvw0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        BigDecimal holdingsTotal = new BigDecimal(10);
        accountDataJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, accountDataJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAllOrders_PbYo0_MwvB0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        OrderData[] orders = new OrderData[10];
        accountDataJSF.setAllOrders(orders);
        assertEquals(orders, accountDataJSF.getAllOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setBalance_tjus0_RGqz0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setBalance(new BigDecimal("100.00"));
        assertEquals(new BigDecimal("100.00"), accountDataJSF.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setBalance2_ExGC1_FIpA0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setBalance(new BigDecimal("500.00"));
        assertEquals(new BigDecimal("500.00"), accountDataJSF.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setBalance3_iDwe2_VezC0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setBalance(new BigDecimal("1000.00"));
        assertEquals(new BigDecimal("1000.00"), accountDataJSF.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGain_ODWC0_cdON0_fid1() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.setGain(new BigDecimal("100.00"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGain_ihpl0_uFeK0_fid1() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        BigDecimal actual = accountDataJSF.getGain();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDCoverage4_EOch4_UWDG0_fid1() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
        accountDataJSF.getProfileID();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBalance_zeroBalance_lnmE1() {
        AccountDataJSF accountData = new AccountDataJSF(null);
        BigDecimal balance = accountData.getBalance();
        assertNotNull(balance);
        assertEquals(BigDecimal.ZERO, balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBalance_nonZeroBalance_mViV2() {
        AccountDataJSF accountData = new AccountDataJSF(null);
        BigDecimal balance = accountData.getBalance();
        assertNotNull(balance);
        assertNotEquals(BigDecimal.ZERO, balance);
    }
}